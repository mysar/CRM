<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<!-- Mirrored from www.zi-han.net/theme/hplus/graph_echarts.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:18:59 GMT -->
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>H+ 后台主题UI框架 - 百度ECHarts</title>
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<link rel="shortcut icon" href="favicon.ico">
<link
	href="${pageContext.request.contextPath}/admin/css/bootstrap.min14ed.css?v=3.3.6"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/css/font-awesome.min93e3.css?v=4.4.0"
	rel="stylesheet">

<!-- Data Tables -->
<link
	href="${pageContext.request.contextPath}/admin/css/plugins/dataTables/dataTables.bootstrap.css"
	rel="stylesheet">

<link
	href="${pageContext.request.contextPath}/admin/css/animate.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/css/style.min862f.css?v=4.1.0"
	rel="stylesheet">


</head>

<body class="gray-bg">

	<!-- 客户服务实体表管理 -->

	<div class="wrapper wrapper-content animated fadeInRight">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>用户服务实体表管理</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="dropdown-toggle" data-toggle="dropdown"
								href="table_data_tables.html#"> <i class="fa fa-wrench"></i>
							</a>
							<ul class="dropdown-menu dropdown-user">
								<li><a href="table_data_tables.html#">选项1</a></li>
								<li><a href="table_data_tables.html#">选项2</a></li>
							</ul>
							<a class="close-link"> <i class="fa fa-times"></i>
							</a>
						</div>
					</div>


					<!-- 显示服务分配信息 -->
					<div class="ibox-content">

						<table
							class="table table-striped table-bordered table-hover dataTables-example">
							<thead>
								<tr>
									<th>[]</th>
									<th>序号</th>
									<th>服务类型</th>
									<th>概要</th>
									<th>客户</th>
									<th>创建人</th>
									<th>创建日期</th>
									<th>分配处理</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="entity" items="${customerServiceList}">
									<tr onclick="SelectTR(this);">
										<td><input type="checkbox" class="i-checks"
											name="input[]" value="${entity.id}"></td>
										<td>${entity.id}</td>
										<td>${entity.serveType}</td>
										<td>${entity.overview}</td>
										<td>${entity.customer}</td>
										<td>${entity.createPeople}</td>
										<td><fmt:formatDate value="${entity.createTime}" /></td>
										<td><a data-toggle="modal" data-target="#myModal"
											href="${pageContext.request.contextPath}/customerService/selectObjectsById.controller?id=${entity.id}"
											class="btn btn-outline btn-success">分配</a></td>
									</tr>
								</c:forEach>

							</tbody>
						</table>
					</div>






					<!-- 模态框（Modal） -->
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 class="modal-title" id="myModalLabel">添加</h2>
								</div>

								<div class="ibox-content">
									<form role="form" class="form-horizontal m-t"
										action="${pageContext.request.contextPath}/customerService/selectObjectsById.controller">
										<input name="id" value="${requestScope.entityObjects.id}">
										<div class="form-group draggable">
											<label class="col-sm-3 control-label">分配人：</label>
											<div class="col-sm-9">
												<select class="form-control" name="assigner">
													<option value="">请选择...</option>
													<option value="小红">小红</option>
													<option value="小明">小明</option>
												</select>
											</div>
										</div>

										<input type="hidden" name="id" value="${entity.id}" />
										<div class="hr-line-dashed"></div>
										<div class="form-group draggable">
											<div class="col-sm-12 col-sm-offset-3">
												<button class="btn btn-primary" type="submit">保存内容</button>
												<button class="btn btn-white" type="button"
													class="btn btn-default" data-dismiss="modal">取消</button>
											</div>
										</div>
									</form>
									<div class="clearfix"></div>
								</div>

							</div>
						</div>
					</div>














				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/adminJs/customerService.js"></script>
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
		$(document)
				.ready(
						function() {
							$(".dataTables-example").dataTable();
							var oTable = $("#editable").dataTable();
							oTable
									.$("td")
									.editable(
											"http://www.zi-han.net/theme/example_ajax.php",
											{
												"callback" : function(sValue, y) {
													var aPos = oTable
															.fnGetPosition(this);
													oTable.fnUpdate(sValue,
															aPos[0], aPos[1])
												},
												"submitdata" : function(value,
														settings) {
													return {
														"row_id" : this.parentNode
																.getAttribute("id"),
														"column" : oTable
																.fnGetPosition(this)[2]
													}
												},
												"width" : "90%",
												"height" : "100%"
											})
						});
		function fnClickAddRow() {
			$("#editable").dataTable()
					.fnAddData(
							[ "Custom row", "New row", "New row", "New row",
									"New row" ])
		};
	</script>
	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>


<!-- Mirrored from www.zi-han.net/theme/hplus/graph_echarts.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:18:59 GMT -->
</html>
