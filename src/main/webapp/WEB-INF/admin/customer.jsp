<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<style type="text/css">
.table th, .table td {
	text-align: center;
	height: 38px;
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>基础表格</title>
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/admin/favicon.ico">
<link
	href="${pageContext.request.contextPath}/admin/css/bootstrap.min14ed.css?v=3.3.6"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/css/font-awesome.min93e3.css?v=4.4.0"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/css/plugins/iCheck/custom.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/css/animate.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/css/style.min862f.css?v=4.1.0"
	rel="stylesheet">
</head>
</body>
</html>
<div class="row">
	<div class="col-sm-12">
		<div class="ibox float-e-margins">
			<div class="ibox-title">
				<h5>客户信息</h5>
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
					<div class="col-sm-6">
						<table>
							<tr>
								<th><div class="view">
										<!-- Button to trigger modal -->
										<!-- 模态框（Modal） -->
										<div class="modal fade" id="myModal" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal"
															aria-hidden="true">&times;</button>
														<h2 class="modal-title" id="myModalLabel">新建客户信息</h2>
													</div>

													<div class="ibox-content">
														<form role="form" method="post" class="form-horizontal m-t"
															action="${pageContext.request.contextPath}/customer/addCustomer.controller">

															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">客户编号：</label>
																<div class="col-sm-9">
																	<input type="text" name="khno" class="form-control"
																		placeholder="客户编号">
																</div>
															</div>

															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">客户名称：</label>
																<div class="col-sm-9">
																	<input type="text" name="name" class="form-control"
																		placeholder="请输入客户名称">
																</div>
															</div>

															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">客户地区：</label>
																<div class="col-sm-9">
																	<select class="form-control" name="area">
																		<option value="">请选择地区</option>
																		<option value="北京">北京</option>
																		<option value="上海">上海</option>
																		<option value="广州">广州</option>
																		<option value="南京">南京</option>
																		<option value="天津">天津</option>
																	</select>
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label" >客户经理：</label>
																<div class="col-sm-9">
																	<input type="text" name="cusManager"
																		class="form-control" placeholder="请输入客户经理">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">客户等级：</label>
																<div class="col-sm-9">
																	<input type="text" name="level" class="form-control"
																		placeholder="请输入客户等级">
																</div>
															</div>
																<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">客户满意度：</label>
																<div class="col-sm-9">
																	<select class="form-control" name="myd">
																		<option value="">请选择满意度</option>
																		<option value="★☆☆☆☆">★</option>
																		<option value="★★☆☆☆">★★</option>
																		<option value="★★★☆☆">★★★</option>
																		<option value="★★★★☆">★★★★</option>
																		<option value="★★★★★">★★★★★</option>
																	</select>
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">客户信用度：</label>
																<div class="col-sm-9">
																	<select class="form-control" name="xyd">
																		<option value="">请选择信用度</option>
																		<option value="★☆☆☆☆">★</option>
																		<option value="★★☆☆☆">★★</option>
																		<option value="★★★☆☆">★★★</option>
																		<option value="★★★★☆">★★★★</option>
																		<option value="★★★★★">★★★★★</option>
																	</select>
																</div>
															</div>
															
															<div class="form-group draggable" class="col-md-12">
																<label class="col-sm-3 control-label">客户地址：</label>
																<div class="col-sm-9">
																	<input type="text" name="address" class="form-control"
																		placeholder="请输入客户地址">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">邮政编码：</label>
																<div class="col-sm-9">
																	<input type="text" name="postCode" class="form-control"
																		placeholder="请输入邮政编码">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">联系电话：</label>
																<div class="col-sm-9">
																	<input type="text" name="phone" class="form-control"
																		placeholder="请输入联系电话">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">传真：</label>
																<div class="col-sm-9">
																	<input type="text" name="fax" class="form-control"
																		placeholder="请输入传真">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">网址：</label>
																<div class="col-sm-9">
																	<input type="text" name="webSite" class="form-control"
																		placeholder="请输入网址">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">营业执照号注册号：</label>
																<div class="col-sm-9">
																	<input type="text" name="yyzzzch" class="form-control"
																		placeholder="请输入营业执照号注册号">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">客户法人：</label>
																<div class="col-sm-9">
																	<input type="text" name="fr" class="form-control"
																		placeholder="请输入法人">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">注册资金（万元）：</label>
																<div class="col-sm-9">
																	<input type="text" name="zczj" class="form-control"
																		placeholder="请输入注册资金（万元）">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">年营业额：</label>
																<div class="col-sm-9">
																	<input type="text" name="nyye" class="form-control"
																		placeholder="请输入年营业额">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">开户银行：</label>
																<div class="col-sm-9">
																	<input type="text" name="khyh" class="form-control"
																		placeholder="请输入开户银行">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">开户账号：</label>
																<div class="col-sm-9">
																	<input type="text" name="khzh" class="form-control"
																		placeholder="请输入开户账号">
																</div>
															</div>
															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">地税登记号：</label>
																<div class="col-sm-9">
																	<input type="text" name="dsdjh" class="form-control"
																		placeholder="请输入地税登记号">
																</div>
															</div>

															<div class="form-group draggable" class="col-md-6">
																<label class="col-sm-3 control-label">国税登记号：</label>
																<div class="col-sm-9">
																	<input type="text" name="gsdjh" class="form-control"
																		placeholder="请输入国税登记号">
																</div>
															</div>

															<input type="hidden" value="0" name="state" />



															<div class="hr-line-dashed"></div>
															<div class="form-group draggable">
																<div class="col-sm-12 col-sm-offset-3">
																	<button class="btn btn-primary" id="b" type="submit">保存</button>
																	<button class="btn btn-white" type="submit">取消</button>
																</div>
															</div>
															<input type="hidden" id="i1" value="${i}" />
														</form>

														<div class="clearfix"></div>
													</div>

												</div>
											</div>
										</div>













									</div></th>
								<th><span><button class="btn btn-primary" data-toggle="modal" data-target="#myModal"> 添加</button></span></th><th><span><a href="goKHLXRGL.controller"><button
												class="btn btn-sm btn-primary">联系人管理</button></a></span></th><th> <span><a
										href="goJWJLGL.controller"><button
												class="btn btn-sm btn-primary">交往记录管理</button></a></span></th>
							</tr>
							<!-- 搜索开始 -->
							<tr>
								<form action="goCustomer.controller" method="post">
									<td>客户名称：</td>
									<th><input type="text" name="name" placeholder="请输入客户名称"
										class="input-sm form-control"></th>
									<td>地址：</td>
									<th><input type="text" name="address" placeholder="请输入地址"
										class="input-sm form-control"></th>
									<td>
										<button type="submit" class="btn btn-sm btn-primary">搜索</button>
									</td>
								</form>
							</tr>
							<!-- 搜索结束 -->
						</table>
					</div>
				</div>
				<div class="table-responsive">
					<table id="dg"
						class="table table-striped table-bordered table-hover dataTables-example " >
						<!-- 表头排序  -->
						<thead>
							<tr>
								<th>操作</th><!--  <input type="checkbox" name="input[]">-->
								<th>序号</th>
								<th style="width: 40px">客户编号</th>
								<th style="width: 40px">客户名称</th>
								<th style="width: 40px">客户地区</th>
								<th style="width: 40px">客户经理</th>
								<th style="width: 40px">客户等级</th>
								<th style="width: 60px important">客户满意度</th>
								<th>客户信用度</th>
								<th>客户地址</th>
								<th>邮政编码</th>
								<th>联系电话</th>
								<th>传真</th>
								<th>网址</th>
								<th>营业执照号注册号</th>
								<th>法人</th>
								<th>注册资金（万元）</th>
								<th>年营业额</th>
								<th>开户银行</th>
								<th>开户账号</th>
								<th>地税登记号</th>
								<th>国税登记号</th>
								<!-- <th>客户状态</th> -->
							</tr>
						</thead>
						<tbody>

							<c:forEach items="${entities}" var="entity">
								<tr style="height: 20px">
									<!-- <input type="checkbox" value="${ entity.id}"
										name="input[]">onclick="SelectTR(this);" -->
									<td><a href="${pageContext.request.contextPath}/customer/deleteCustomer.controller?id=${entity.id}"><button class="btn btn-white" type="button">
										删除</button></a>
										
										
									<button class="btn btn-white" type="button"><i class="fa fa-paste"></i>	<a href="${pageContext.request.contextPath}/customer/goUpdataCustomer.controller?id=${entity.id}">修改</a></button></td>
									<th>${entity.id }</th>
									<th>${entity.khno }</th>
									<th>${entity.name }</th>
									<th>${entity.area }</th>
									<th>${entity.cusManager }</th>
									<td>${entity.level }</td>
									<td>${entity.myd }</td>
									<td>${entity.xyd }</td>
									<td>${entity.address }</td>
									<td>${entity.postCode }</td>
									<td>${entity.phone }</td>
									<td>${entity.fax }</td>
									<td>${entity.webSite }</td>
									<td>${entity.yyzzzch }</td>
									<td>${entity.fr }</td>
									<td>${entity.zczj }</td>
									<td>${entity.nyye }</td>
									<td>${entity.khyh }</td>
									<td>${entity.khzh }</td>
									<td>${entity.dsdjh }</td>
									<td>${entity.gsdjh }</td>
									<%-- <td>${entity.state }</td> --%>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
</body>

<script
	src="${pageContext.request.contextPath}/admin/js/jquery.min.js?v=2.1.4"></script>
<script
	src="${pageContext.request.contextPath}/admin/js/bootstrap.min.js?v=3.3.6"></script>
<script
	src="${pageContext.request.contextPath}/admin/js/plugins/jeditable/jquery.jeditable.js"></script>
<script
	src="${pageContext.request.contextPath}/admin/js/plugins/dataTables/jquery.dataTables.js"></script>
<script
	src="${pageContext.request.contextPath}/admin/js/plugins/dataTables/dataTables.bootstrap.js"></script>
<script
	src="${pageContext.request.contextPath}/admin/js/content.min.js?v=1.0.0"></script>
<script>

														
//点击行时使前面的复选框选中，并变色
/* function SelectTR(tr)
{
	var arr;
	var tds=tr.childNodes;
	for(var j=0; j<tds.length;j++)
	{
		var inputs=tds[j].childNodes;
		for (var i=0; i < inputs.length; i++) // 遍历页面上所有的 input
		{
			if (inputs[i].type == "checkbox")
			{
			   inputs[i].checked = !inputs[i].checked;
			   tr.style.backgroundColor = inputs[i].checked ? "#fafdc6" : "";
			   alert("id:"+inputs[i].value);
			}
		}
	}
}   */
	$(document).ready(
			function() {
				$(".dataTables-example").dataTable();
				var oTable = $("#editable").dataTable();
				oTable.$("td").editable(
						"http://www.zi-han.net/theme/example_ajax.php",
						{
							"callback" : function(sValue, y) {
								var aPos = oTable.fnGetPosition(this);
								oTable.fnUpdate(sValue, aPos[0], aPos[1])
							},
							"submitdata" : function(value, settings) {
								return {
									"row_id" : this.parentNode
											.getAttribute("id"),
									"column" : oTable.fnGetPosition(this)[2]
								}
							},
							"width" : "100%",
							"height" : "100%"
						})
			});
	function fnClickAddRow() {
		$("#editable").dataTable().fnAddData(
				[ "Custom row", "New row", "New row", "New row", "New row" ])
	};
</script>

</html>