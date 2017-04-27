<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>产品实体信息</title>
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
				<h5>产品实体信息</h5>
				<div class="ibox-tools">
					<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
					</a> <a class="dropdown-toggle" data-toggle="dropdown"
						href="table_basic.html#"> <i class="fa fa-wrench"></i>
					</a> <a class="close-link"> <i class="fa fa-times"></i>
					</a>
				</div>
			</div>
			<div class="row">

				<div class="col-sm-6">

					<table>
						<tr>
							<form action="goProduct.controller" method="post">
							<td>产品名称：</td>
							<th><input type="text" name="productName"
								placeholder="请输入产品部分名称" class="input-sm form-control"></th>
							<td>型号：</td>
							<th><input type="text" name="model" placeholder="请输入产品型号"
								class="input-sm form-control"></th>
							<td>
								<button type="submit" class="btn btn-sm btn-primary">搜索</button>
							</td>
							</form>
						</tr>
					</table>

				</div>
			</div>
			<div class="ibox-content">

				<div class="table-responsive">
					<table
						class="table table-striped table-bordered dataTables-example">
						<thead>
							<tr>
								<th></th>
								<th>编号</th>
								<th>产品名称</th>
								<th>型号</th>
								<th>单位</th>
								<th>价格</th>
								<th>库存</th>
								<th>备注</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${entities}" var="entity">
								<tr>
									<td><input type="checkbox" checked class="i-checks"
										name="input[]"></td>
									<td>${entity.id }</td>
									<td>${entity.productName }</td>
									<td>${entity.model }</td>
									<td>${entity.unit}</td>
									<td>${entity.price }</td>
									<td>${entity.store }</td>
									<td>${entity.remark }</td>
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
							"width" : "90%",
							"height" : "100%"
						})
			});
	function fnClickAddRow() {
		$("#editable").dataTable().fnAddData(
				[ "Custom row", "New row", "New row", "New row", "New row" ])
	};
</script>

</html>