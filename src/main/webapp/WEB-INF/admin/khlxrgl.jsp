<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>


<!-- Mirrored from www.zi-han.net/theme/hplus/table_basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:20:01 GMT -->
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>客户关系管理系统</title>
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<link rel="shortcut icon" href="favicon.ico">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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

<body class="gray-bg">







	<button class="btn btn-sm btn-primary" data-toggle="modal"
		data-target="#myModal">添加</button>
	<div class="wrapper wrapper-content animated fadeInRight">
		<div class="row">
			<div class="ibox-content">
				<table
					class="table table-striped table-bordered table-hover dataTables-example">
					<thead>
						<tr>
							<th>id</th>
							<th>客户编号</th>
							<th>姓名</th>
							<th>性别</th>
							<th>职位</th>
							<th>办公电话</th>
							<th>私人电话</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${entity}" var="e">
							<tr>
								<td>${e.id }</td>
								<td>${e.cusId }</td>
								<td>${e.linkName }</td>
								<td>${e.sex }</td>
								<td>${e.zhiwei }</td>
								<td>${e.officePhone }</td>
								<td>${e.phone }</td>
								<td><a href="../linkman/deletelinkman.controller?id=${e.id }">删除</a>|<a
									href="">修改</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>

			</div>


		</div>

	</div>


	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加</h4>
				</div>

				<form action="../linkman/addlinkman.controller">
					<div class="modal-body">
						<div class="col-md-6">
							<div class="form-group">
								<label class="col-sm-3 control-label">cusId：</label>
								<div class="col-sm-9">
									<input type="text" name="cusId" class="form-control"
										placeholder="请输入文本"> <span class="help-block m-b-none">说明文字</span>

								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">linkName：</label>
								<div class="col-sm-9">
									<input type="text" name="linkName" class="form-control"
										placeholder="请输入文本"> <span class="help-block m-b-none">说明文字</span>

								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">sex：</label>
								<div class="col-sm-9">
									<input type="text" name="sex" class="form-control"
										placeholder="请输入文本"> <span class="help-block m-b-none">说明文字</span>

								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<label class="col-sm-3 control-label">职位：</label>
								<div class="col-sm-9">
									<input type="text" name="zhiwei" class="form-control"
										placeholder="请输入文本"> <span class="help-block m-b-none">说明文字</span>

								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">办公电话：</label>
								<div class="col-sm-9">
									<input type="text" name="officePhone" class="form-control"
										placeholder="请输入文本"> <span class="help-block m-b-none">说明文字</span>

								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">私人电话：</label>
								<div class="col-sm-9">
									<input type="text" name="phone" class="form-control"
										placeholder="请输入文本"> <span class="help-block m-b-none">说明文字</span>

								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<input type="submit" value="添加">
					</div>
				</form>
			</div>
		</div>
	</div>








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
</html>