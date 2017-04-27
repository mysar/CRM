$(function(){
	initData();
	$.post('../customer/getdatadicByName.controller',function(data){
		for(var leg=0;leg<data.length;leg++){
			$('#level').append("<option value="+data[leg].dataDicValue+">"+data[leg].dataDicValue+"</option>");
		}
	});
	$.post('../customer/getObjectsByRole.controller',function(data){
		for(var leg=0;leg<data.length;leg++){
			$('#cusManager').append("<option value="+data[leg].userName+">"+data[leg].userName+"</option>");
		}
	});

	$.post('../customer/getdatadicByName.controller',function(data){
		for(var leg=0;leg<data.length;leg++){
			$('#levels').append("<option value="+data[leg].dataDicValue+">"+data[leg].dataDicValue+"</option>");
		}
	});
	$.post('../customer/getObjectsByRole.controller',function(data){
		for(var leg=0;leg<data.length;leg++){
			$('#cusManagers').append("<option value="+data[leg].userName+">"+data[leg].userName+"</option>");
		}
	});
})
function initData(){
	$('#table').bootstrapTable({
	    url: "../customer/customer.controller",
	    sortOrder: 'desc',
	    pagination: true,
	    pageNumber: 1,
	    pageSize: 5,
	    pageList: [5,8, 10,],
	    dataType: "json",
	    pagination: true, //分页
	    singleSelect: false,
	    sidePagination: "server", //服务端处理分页
	    clickToSelect: true,//是否启用点击选中行
	    //showToggle: true,  //是否显示详细视图和列表视图的切换按钮
        //cardView: false, 
        
        showPaginationSwitch : true,//选中行记录
	    //冻结列
	    fixedColumns:true,
	    fixedNumber:5,
	    columns: [
	    	{
	            field: 'ck',
	            checkbox: true,
	            align: 'center',
	          }
	    	
	    	
	    	,{
	        field: 'id',
	        title: '编号',
	        
	    }, {
	        field: 'khno',
	        title: '客户编号',
	    }, {
	        field: 'name',
	        title: '客户名称',
	    }, {
	        field: 'area',
	        title: '客户地区',
	    }, {
	        field: 'cusManager',
	        title: '客户经理',
	    }, {
	        field: 'level',
	        title: '客户等级',
	    }, {
	        field: 'myd',
	        title: '客户满意度'
	    }, {
	        field: 'xyd',
	        title: '客户信用度'
	    }, {
	        field: 'address',
	        title: '客户地址'
	    }, {
	        field: 'postCode',
	        title: '邮政编码'
	    }, {
	        field: 'phone',
	        title: '联系电话'
	    }, {
	        field: 'fax',
	        title: '传真'
	    }, {
	        field: 'webSite',
	        title: '网址'
	    }, {
	        field: 'yyzzzch',
	        title: '营业执照号注册号'
	    }, {
	        field: 'fr',
	        title: '法人'
	    }, {
	        field: 'zczj',
	        title: '注册资金（万元）'
	    }, {
	        field: 'nyye',
	        title: '年营业额'
	    }, {
	        field: 'khyh',
	        title: '开户银行'
	    }, {
	        field: 'khzh',
	        title: '开户账号'
	    }, {
	        field: 'dsdjh',
	        title: '地税登记号'
	    }, {
	        field: 'gsdjh',
	        title: '国税登记号'
	    }, {
	        field: 'state',
	        title: '客户状态',
	        formatter:function(value,row,index){  
	        	if(value==1){
	        		return '客户流失';
	        	}else if(value==0){
	        		return '正常';  
	        	}
	        }
	    }
	   
	    ], 
	    onDblClickCell(field, value, row){
			goUpdate(row.id);
			
		},
		clickToSelect:true
	});
}

function sousuo(){
	var khno=$('#khno').val();
	var name=$('#name').val();
	$('#table').bootstrapTable('refresh',{url: '../customer/customer.controller?khno='+khno+'&name='+name+''});
}
function goUpdate(id){

	
	$.ajax({
        url:'../customer/selectCustomerById.controller',
        data:{id:id},
        success:function(data){
        	
        	$('#id').val(data.id);                      
        	$('#khno').val(data.khno);			
        	$('#names').val(data.name);
        	$('#area').val(data.area);
        	$('#cusManager').val(data.cusManager);
        	$('#level').val(data.level);
        	$('#myd').val(data.myd);
        	$('#xyd').val(data.xyd);
        	$('#address').val(data.address);
        	$('#postCode').val(data.postCode);
        	$('#phone').val(data.phone);
        	$('#webSite').val(data.webSite);
        	$('#yyzzzch').val(data.yyzzzch);
        	$('#fax').val(data.fax);
        	$('#fr').val(data.fr);
        	$('#zczj').val(data.zczj);
        	$('#nyye').val(data.nyye);
        	$('#khyh').val(data.khyh);
         	$('#khzh').val(data.khzh);
        	$('#dsdjh').val(data.dsdjh);
        	$('#gsdjh').val(data.gsdjh);
        	$('#state').val(data.state);
        }
    });
	$('#myUpdateModal').modal('show');
}


//删除
function deleteById(){
	var arr = $("#table").bootstrapTable('getSelections');
	if (arr.length == 0) {
		toastr.warning('请选择有效数据');
	} else {
		var ids = "";
			for (var index = 0; index < arr.length; index++) {
				var row = arr[index];
				if (index == 0) {
					ids += row.id
				} else {
					ids += "," + row.id;
				}
			}
		}
		swal({
			 title: "操作提示", //弹出框的title
			 text: "确定删除吗？", //弹出框里面的提示文本
			 type: "warning", //弹出框类型
			 showCancelButton: true, //是否显示取消按钮
			 confirmButtonColor: "#DD6B55",//确定按钮颜色
			 cancelButtonText: "取消",//取消按钮文本
			 confirmButtonText: "是的，确定删除！",//确定按钮上面的文档
			 closeOnConfirm: true
			 }, function () {
				 $.ajax({
			         url:'../customer/deleteCustomerById.controller',
			         data:{ids:ids},
			         success:function(data){
			        	if(data){
			        		toastr.success('删除成功');
			        		$('#table').bootstrapTable('refresh');
			        	}
			         }
			     });
			 });
	}
	


function loadData(jsonStr){
	var obj = eval("("+jsonStr+")");
	var key,value,tagName,type,arr;
	for(x in obj){
		key = x;
		value = obj[x];
		
		$("[name='"+key+"'],[name='"+key+"[]']").each(function(){
			tagName = $(this)[0].tagName;
			type = $(this).attr('type');
			if(tagName=='INPUT'){
				if(type=='radio'){
					$(this).attr('checked',$(this).val()==value);
				}else if(type=='checkbox'){
					arr = value.split(',');
					for(var i =0;i<arr.length;i++){
						if($(this).val()==arr[i]){
							$(this).attr('checked',true);
							break;
						}
					}
				}else{
					$(this).val(value);
				}
			}else if(tagName=='SELECT' || tagName=='TEXTAREA'){
				$(this).val(value);
			}
			
		});
	}
}




/**
 * 联系人管理
 * @returns
 */
function lxrgl(){
	var id;
	var selection=$('#table').bootstrapTable('getSelections');
	if(selection.length!=1){
		toastr.warning('请选择有效数据');
	}else{
	
		id=selection[0].id;
		alert(id);
		$.post('../customer/selectCustomerById.controller',
				{id:id},function(data){
			$('#example-c').val(data.khno);
			$('#example-s').val(data.name);
		});
		
		$('#planTables').bootstrapTable({
		    url: "../customer/selectlinkmanBycusId.controller?cusId="+id,
		    sortOrder: 'desc',
		    pagination: true,
		    pageNumber: 1,
		    pageSize: 5,
		    pageList: [5, 10, 20],
		    dataType: "json",
		    pagination: true, //分页
		    singleSelect: false,
		    sidePagination: "server", //服务端处理分页
		    columns: [{
	            field: 'ck',
	            checkbox: true,
	            align: 'center',
	            
	          },{
		        field: 'id',
		        title: '编号',
		        
		    }, {
		        field: 'linkName',
		        title: '客户姓名',
		    }, {
		        field: 'sex',
		        title: '性别',
		    }, {
		        field: 'zhiwei',
		        title: '职位',
		    }, {
		        field: 'officePhone',
		        title: '办公电话',
		    }, {
		        field: 'phone',
		        title: '手机',
		    }]
		})
		$('#lxrgl').modal('show');
	}
}





/*order  历史订单查看*/



function openCustomerOrder(){
	var id;
	var selection=$('#table').bootstrapTable('getSelections');
	if(selection.length!=1){
		toastr.warning('请选择有效数据');
	}else{
	
		id=selection[0].id;
		alert(id);
		$.post('../customer/selectCustomerById.controller',
				{id:id},function(data){
			$('#example-c').val(data.khno);
			$('#example-s').val(data.name);
		});
		$('#planTable').bootstrapTable({
		    url: "../customer/selectOrderByCusid.controller?cusId="+id,
		    sortOrder: 'desc',
		    pagination: true,
		    pageNumber: 1,
		    pageSize: 5,
		    pageList: [5, 10, 20],
		    dataType: "json",
		    pagination: true, //分页
		    singleSelect: false,
		    sidePagination: "server", //服务端处理分页
		    clickToSelect: true,//是否启用点击选中行
		    showToggle: true,  //是否显示详细视图和列表视图的切换按钮
	        cardView: false, 
	        
	        showPaginationSwitch : true,//选中行记录
		    
		    columns: [
		    	{
					title : "全选",
					field : "select",
					checkbox : true,
					width : 20,//宽度
					align : "center",//水平
					valign : "middle"//垂直
				}
		   ,{
		        field: 'id',
		        title: '序号',
		    }, {
		        field: 'orderNo',
		        title: '订单号'
		    }, {
		        field: 'orderDate',
		        title: '订购日期'
		    }, {
		        field: 'address',
		        title: '送货地址'
		    },  {
		        field: 'state',
		        title: '客户状态',
		        formatter:function(value,row,index){  
		        	if(value==1){
		        		return '回款';
		        	}else if(value==0){
		        		return '未回款';  
		        	}
		        }
		    }
		   
		    ], 
		    /**
		     * 双击修改
		     */
		    onDblClickCell(field, value, row){
				goUpdate(row.id);
			},
			clickToSelect:true
		});
		
		
		
		$('#lxrgl1').modal('show');
	}
}



function JWJLGL(){
	var id;
	var selection=$('#table').bootstrapTable('getSelections');
	if(selection.length!=1){
		toastr.warning('请选择有效数据');
	}else{
	
		id=selection[0].id;
		alert(id);
		$.post('../customer/selectCustomerById.controller',
				{id:id},function(data){
			$('#example-c').val(data.khno);
			$('#example-s').val(data.name);
		});
		
		$('#planTablea').bootstrapTable({
		    url: "../customer/selectContactByCusid.controller?cusId="+id,
		    sortOrder: 'desc',
		    pagination: true,
		    pageNumber: 1,
		    pageSize: 5,
		    pageList: [5, 10, 20],
		    dataType: "json",
		    pagination: true, //分页
		    singleSelect: false,
		    sidePagination: "server", //服务端处理分页
		    columns: [{
	            field: 'ck',
	            checkbox: true,
	            align: 'center',
	            
	          },{
		        field: 'id',
		        title: '编号',
		        
		    }, {
		        field: 'contactTime',
		        title: '交往时间',
		    }, {
		        field: 'address',
		        title: '交往地址',
		    }, {
		        field: 'overView',
		        title: '概要',
		    }]
		})
		$('#jwjlgl').modal('show');
	}
}

