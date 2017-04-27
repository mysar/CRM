<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>基础表格</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/admin/favicon.ico">
<link href="${pageContext.request.contextPath}/admin/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/css/plugins/iCheck/custom.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/css/animate.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/css/style.min862f.css?v=4.1.0" rel="stylesheet">
</head>
<body>
	<div class="row">
		<div class="col-sm-12">
			<div class="ibox float-e-margins">
				<div class="ibox-title">
					<h5>用户字典</h5>
					<div class="ibox-tools">
						<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
						</a> <a class="dropdown-toggle" data-toggle="dropdown"
							href="table_basic.html#"> <i class="fa fa-wrench"></i>
						</a> <a class="close-link"> <i class="fa fa-times"></i>
						</a>
					</div>
				</div>
				<div class="ibox-content">
					<div class="row">
					
					 <form action="${pageContext.request.contextPath}/datadic/goDatadic.controller" method="post">
                            	
                            	<div class="form-group draggable">
	                                <div class="col-sm-2">
	                                    <input type="text" placeholder="请输入关键词" class="input-sm form-control" name="dataDicValue"> 
	                                 </div>
                            	</div>
                            		
 		                     	<button class="btn  btn-sm btn-primary" type="submit">搜索</button>
 		                    </form>

					</div>
					<button class="btn btn-primary" data-toggle="modal" data-target="#myModal"> 添加</button>
			
			
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h2 class="modal-title" id="myModalLabel"> 添加 </h2>
			</div>
			
			 <div class="ibox-content">
                        <form role="form" class="form-horizontal m-t" method="post" action="${pageContext.request.contextPath}/datadic/addDatadic.controller">
                            
                            <div class="form-group draggable">
                                <label class="col-sm-3 control-label">字典名:</label>
                                <div class="col-sm-9">
                                    <select class="form-control" name="dataDicName">
                                        <option value="">请选择...</option>	
	 									<option value="客户等级">客户等级</option>
	 									<option value="服务类型">服务类型</option>	
                                    </select>
                                </div>
                            </div>
                            
                            
                            
                             <div class="form-group draggable">
                                <label class="col-sm-3 control-label">字典值:</label>
                                <div class="col-sm-9">
                                    <input type="text" name="dataDicValue" class="form-control" placeholder="请输入文本">
                                </div>
                            </div>
                            
                           
                            <div class="hr-line-dashed"></div>
                            <div class="form-group draggable">
                                <div class="col-sm-12 col-sm-offset-3">
                                    <button class="btn btn-primary" type="submit">保存内容</button>
                                    <button class="btn btn-white" type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                </div>
                            </div>
                        </form>
                        <div class="clearfix"></div>
                    </div>

</div></div></div>
<!-- end -->		
					
					
					
					<div class="table-responsive">
						<table class="table table-striped table-bordered table-hover dataTables-example">
							<thead>
								<tr class="gradeA">
									<th>编号</th>
									<th>数据字典名称</th>
									<th>数据字典值</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${paging}" var="d">
									<tr>
										<td>${d.id}</td>
										<td>${d.dataDicName}</td>
										<td>${d.dataDicValue}</td>
										<td>
										<a href="${pageContext.request.contextPath}/datadic/deleteDatadic.controller?id=${d.id}">
										<button class="btn btn-white" type="button">删除</button></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>			
</div></div></div></div>	
</body>
	<script src="${pageContext.request.contextPath}/admin/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/admin/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath}/admin/js/plugins/jeditable/jquery.jeditable.js"></script>
    <script src="${pageContext.request.contextPath}/admin/js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="${pageContext.request.contextPath}/admin/js/plugins/dataTables/dataTables.bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/admin/js/content.min.js?v=1.0.0"></script>
    <script>
        $(document).ready(function(){$(".dataTables-example").dataTable();var oTable=$("#editable").dataTable();oTable.$("td").editable("http://www.zi-han.net/theme/example_ajax.php",{"callback":function(sValue,y){var aPos=oTable.fnGetPosition(this);oTable.fnUpdate(sValue,aPos[0],aPos[1])},"submitdata":function(value,settings){return{"row_id":this.parentNode.getAttribute("id"),"column":oTable.fnGetPosition(this)[2]}},"width":"90%","height":"100%"})});function fnClickAddRow(){$("#editable").dataTable().fnAddData(["Custom row","New row","New row","New row","New row"])};
    </script>
	
	</html>