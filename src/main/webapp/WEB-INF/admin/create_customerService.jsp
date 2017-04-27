<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.Date"%>
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




	<form id="addff" method="post" action="../customerService/saveCustomServiceObjects.controller">
		<div class="col-md-12">
			<div class="form-group">
				<br /> <br />
				<div class="col-sm-9" style="display: inline-block;">
					服务类型: <select class="form-control" name="serveType">
						<option value="咨询">咨询</option>
						<option value="建议">建议</option>
						<option value="投诉">投诉</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-9" style="display: inline-block;">
					客户名称: <input name="customer" class="form-control" type="text">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-9" style=" display: inline-block;">
					概要: <input name="overview" class="form-control" type="text">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-9" style="display: inline-block;">
					创建人: <input name="createPeople" class="form-control" type="text">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-9" style="display: inline-block;">
					创建时间: <input name="createTime" class="form-control"
						value="<fmt:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd HH:mm:ss"/>"
						type="text" disabled="disabled">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-9" style="display: inline-block;">
					请求服务:
					<textarea class="form-control" name="serviceProceResult" style="width: 803px;"></textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-9" style="display: inline-block;">
					<input type="submit" class="btn btn-info btn-sm" value="保存">
					<input  type="reset" name="reset" onclick="clearAddff();"
						class="btn btn-info btn-sm" value="重置" />
				</div>
			</div>
		</div>
	</form>

	<!-- <div class="form-group">
		<div class="col-sm-9"
			style="display: inline-block; margin-left: 16px;">
			<input type="submit" class="btn btn-info btn-sm" value="保存">
			<button type="button" class="btn btn-info btn-sm">重置</button>
		</div>
	</div> -->




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

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/adminJs/customerService.js"></script>
</body>


<!-- Mirrored from www.zi-han.net/theme/hplus/graph_echarts.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:18:59 GMT -->
</html>
