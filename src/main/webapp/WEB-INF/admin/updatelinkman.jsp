<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


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
<body>

	<form action="../linkman/updatelinkman.controller">
		<div class="modal-body">
			<div class="col-md-12">
				<div class="form-group">
					<label class="col-sm-3 control-label">cusId：</label>
					<div class="col-sm-9">
						<input type="text" name="cusId" class="form-control"
							value="${linkman.cusId}"> <span
							class="help-block m-b-none">说明文字</span>

					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">linkName：</label>
					<div class="col-sm-9">
						<input type="text" name="linkName" class="form-control"
							value="${linkman.linkName}"> <span
							class="help-block m-b-none">说明文字</span>

					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">sex：</label>
					<div class="col-sm-9">
						<input type="text" name="sex" class="form-control"
							value="${linkman.sex}"> <span class="help-block m-b-none">说明文字</span>

					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">职位：</label>
					<div class="col-sm-9">
						<input type="text" name="zhiwei" class="form-control"
							value="${linkman.zhiwei}"> <span
							class="help-block m-b-none">说明文字</span>

					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">办公电话：</label>
					<div class="col-sm-9">
						<input type="text" name="officePhone" class="form-control"
							value="${linkman.officePhone}"> <span
							class="help-block m-b-none">说明文字</span>

					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label">私人电话：</label>
					<div class="col-sm-9">
						<input type="text" name="phone" class="form-control"
							value="${linkman.phone}"> <span
							class="help-block m-b-none">说明文字</span>

					</div>
				</div>
				<input type="hidden" name="id" class="form-control"
					value="${linkman.id }">
			</div>
		</div>

		<div class="modal-footer">
			<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			<input type="submit" value="更新">
		</div>
	</form>










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
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/js/shade_util.js"></script>
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