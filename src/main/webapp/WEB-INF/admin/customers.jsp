<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>基础表格</title>
<link
	href="${pageContext.request.contextPath}/admin/customer/css/bootstrap.min14ed.css?v=3.3.6"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/customer/css/font-awesome.min93e3.css?v=4.4.0"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/customer/css/animate.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/css/style.min862f.css?v=4.1.0"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/customer/css/plugins/bootstrap-table/bootstrap-table.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/customer/js/bootstrap-table-fixed-columns.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/customer/css/sweetalert.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<link
	href="${pageContext.request.contextPath}/admin/customer/css/sweetalert.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/admin/customer/css/toastr.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/sweetalert.min.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/toastr.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/toastr.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/plugins/layer/layer.min.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/sweetalert.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/customer/js/bootstrap-table-fixed-columns.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/admin/js/customer.js"></script>
</body>
<body>
	<table>
		<tr>
			<td>客户编号：</td>
			<td><input type="text" class="form-control" id="khno"
				placeholder="客户编号"></td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td>客户名称：</td>
			<td><input type="text" class="form-control" id="name"
				placeholder="客户名称"></td>
			<td><a href="javascript:sousuo();"><button type="button"
						class="btn btn-primary">搜索</button></a></td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>


			<td><a href="javascript:openCustomerOrder()"><button
						type="button" class="btn btn-primary">历史订单查看</button></a></td>

			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>

			<td><a href="javascript:lxrgl()"><button type="button"
						class="btn btn-primary">联系人管理</button></a></td>


			<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>


			<td><a href="javascript:JWJLGL()"><button type="button"
						class="btn btn-primary">交往记录管理</button></a></td>
		</tr>

	</table>
	<div class="btn-group hidden-xs" id="exampleTableEventsToolbar"
		role="group">
		<button type="button" class="btn btn-outline btn-default btn-primary"
			id="getAddDlg" data-toggle="modal" data-target="#myModals">
			<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
		</button>
		<button type="button" class="btn btn-outline btn-default btn-primary">
			<i class="glyphicon glyphicon-heart" aria-hidden="true"></i>
		</button>
		<button type="button" onclick="deleteById()"
			class="btn btn-outline btn-default btn-primary">
			<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>
		</button>
	</div>
	<table id="table"></table>






	<!--  添加对话框 -->
	<div class="modal fade" id="myModals" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<form
			action="${pageContext.request.contextPath}/customer/addCustomer.controller"
			method="post">
			<div class="modal-dialog" style="width: 700px;">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">客户信息添加</h4>
					</div>
					<div class="modal-body">
						<table cellspacing="8px">
							<tr>
								<td>客户名称：</td>
								<td><input type="text" class="form-control" name="name"
									placeholder="请输入客户名称"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>客户地区:</td>
								<td><input type="text" class="form-control" name="area"
									placeholder="用户地区"></td>
							</tr>
							<tr>
								<td>客户经理：</td>
								<td><select name="cusManager" id="cusManagers"
									class="form-control">
										<option value="">请选择客户经理</option>

								</select></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>客户等级：</td>
								<td><select id="levels" name="level" class="form-control">
										<option value="">请选择客户等级</option>

								</select></td>
							</tr>
							<tr>
								<td>客户满意度：</td>
								<td><select name="myd" class="form-control">
										<option value="☆☆☆☆☆">☆☆☆☆☆</option>
										<option value="☆☆☆☆">☆☆☆☆</option>
										<option value="☆☆☆">☆☆☆</option>
										<option value="☆☆">☆☆</option>
										<option value="☆">☆</option>
								</select></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>客户信用度：</td>
								<td><select name="xyd" class="form-control">
										<option value="☆☆☆☆☆">☆☆☆☆☆</option>
										<option value="☆☆☆☆">☆☆☆☆</option>
										<option value="☆☆☆">☆☆☆</option>
										<option value="☆☆">☆☆</option>
										<option value="☆">☆</option>
								</select></td>
							</tr>

							<tr>
								<td>邮政编码：</td>
								<td><input type="text" class="form-control" name="postCode"
									placeholder="请输入邮编"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>联系电话：</td>
								<td><input type="text" class="form-control" name="phone"
									placeholder="联系电话"></td>
							</tr>
							<tr>

								<td>客户地址：</td>
								<td colspan="4"><input type="text" class="form-control"
									name="address" placeholder="客户地址"></td>
							</tr>
							<!-- sdas -->
							<tr>
								<td>营业执照号注册号：</td>
								<td><input type="text" class="form-control" name="yyzzzch"
									placeholder="营业执照号注册号"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>法人：</td>
								<td><input type="text" class="form-control" name="fr"
									placeholder="法人"></td>


							</tr>

							<tr>
								<td>注册资金：</td>
								<td><input type="text" class="form-control" name="zczj"
									placeholder="请输入注册资金"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>年营业额：</td>
								<td><input type="text" class="form-control" name="nyye"
									placeholder="年营业额"></td>


							</tr>

							<tr>
								<td>开户银行：</td>
								<td><input type="text" class="form-control" name="khyh"
									placeholder="银行"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>开户账号：</td>
								<td><input type="text" class="form-control" name="khzh"
									placeholder="开户账号"></td>


							</tr>
							<tr>
								<td>地税登记号：</td>
								<td><input type="text" class="form-control" name="dsdjh"
									placeholder="地税登记号"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>国税登记号：</td>
								<td><input type="text" class="form-control" name="gsdjh"
									placeholder="国税登记号"></td>
							</tr>
						</table>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">
							<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭
						</button>
						<button type="submit" id="btn_submit" class="btn btn-primary">
							<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存
						</button>
					</div>
				</div>
			</div>
		</form>
	</div>
	<!--  更新操作 -->
	<div class="modal fade" id="myUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<form
			action="${pageContext.request.contextPath}/customer/updateCustomer.controller"
			method="post">
			<div class="modal-dialog" style="width: 700px;">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">客户信息更新</h4>
					</div>

					<div class="modal-body">

						<table cellspacing="8px">
							<tr>
								<td><input name="khno" id="khno" type="hidden"> <input
									name="webSite" id="webSite" type="hidden"> <input
									name="fax" id="fax" type="hidden"> <input name="id"
									id="id" type="hidden"></td>
								<td>客户名称：</td>
								<td><input type="text" class="form-control" id="names"
									name="name" placeholder="请输入客户名称"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>客户地区:</td>
								<td><input type="text" class="form-control" id="area"
									name="area" placeholder="用户地区"></td>
							</tr>
							<tr>
								<td>客户经理：</td>
								<td><select name="cusManager" class="form-control"
									id="cusManager">
										<option value="">请选择客户经理</option>
								</select></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>客户等级：</td>
								<td><select name="level" class="form-control" id="level">
										<option value="">请选择客户等级</option>
								</select></td>
							</tr>
							<tr>
								<td>客户满意度：</td>
								<td><select name="myd" class="form-control" id="myd">
										<option value="☆☆☆☆☆">☆☆☆☆☆</option>
										<option value="☆☆☆☆">☆☆☆☆</option>
										<option value="☆☆☆">☆☆☆</option>
										<option value="☆☆">☆☆</option>
										<option value="☆">☆</option>
								</select></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>客户信用度：</td>
								<td><select name="xyd" class="form-control" id="xyd">
										<option value="☆☆☆☆☆">☆☆☆☆☆</option>
										<option value="☆☆☆☆">☆☆☆☆</option>
										<option value="☆☆☆">☆☆☆</option>
										<option value="☆☆">☆☆</option>
										<option value="☆">☆</option>
								</select></td>
							</tr>

							<tr>
								<td>邮政编码：</td>
								<td><input type="text" class="form-control" id="postCode"
									name="postCode" placeholder="请输入邮编"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>联系电话：</td>
								<td><input type="text" class="form-control" id="phone"
									name="phone" placeholder="联系电话"></td>
							</tr>
							<tr>

								<td>客户地址：</td>
								<td colspan="4"><input type="text" class="form-control"
									id="address" name="address" placeholder="客户地址"></td>
							</tr>
							<!-- sdas -->
							<tr>
								<td>营业执照号注册号：</td>
								<td><input type="text" class="form-control" id="yyzzzch"
									name="yyzzzch" placeholder="营业执照号注册号"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>法人：</td>
								<td><input type="text" class="form-control" id="fr"
									name="fr" placeholder="法人"></td>


							</tr>

							<tr>
								<td>注册资金：</td>
								<td><input type="text" class="form-control" id="zczj"
									name="zczj" placeholder="请输入注册资金"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>年营业额：</td>
								<td><input type="text" class="form-control" id="nyye"
									name="nyye" placeholder="年营业额"></td>


							</tr>

							<tr>
								<td>开户银行：</td>
								<td><input type="text" class="form-control" id="khyh"
									name="khyh" placeholder="银行"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>开户账号：</td>
								<td><input type="text" class="form-control" id="khzh"
									name="khzh" placeholder="开户账号"></td>


							</tr>
							<tr>
								<td>地税登记号：</td>
								<td><input type="text" class="form-control" id="dsdjh"
									name="dsdjh" placeholder="地税登记号"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td>国税登记号：</td>
								<td><input type="text" class="form-control" id="gsdjh"
									name="gsdjh" placeholder="国税登记号"></td>
							</tr>
						</table>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">
							<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭
						</button>
						<button type="submit" id="btn_submit" class="btn btn-primary">
							<span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>更新
						</button>
					</div>
				</div>
			</div>
		</form>
	</div>






	<!-- 联系人管理 -->
	<div class="modal fade" id="lxrgl" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width: 700px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">客户联系人管理</h4>
				</div>
				<input name="khno" id="khno" type="hidden"> <input
					name="webSite" id="webSite" type="hidden"> <input
					name="fax" id="fax" type="hidden"> <input name="id" id="id"
					type="hidden">
				<div class="modal-body">
					<table>
						<tr>
							<td>客户编号：</td>
							<td><input class="form-control" type="text" 
								 id="example-c" readonly></td>
							<td>客户名称：</td>
							<td><input class="form-control" type="search" 
								 id="example-s" readonly></td>
						</tr>
					</table>

					<button type="button"
						class="btn btn-outline btn-default btn-primary" id="getAddDlg"
						data-toggle="modal" data-target="#myModal">
						<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
					</button>
					<button type="button" onclick="deleteById()"
						class="btn btn-outline btn-default btn-primary">
						<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>
					</button>
					<table id="planTables"></table>


				</div>
			</div>




		</div>
	</div>




	<!-- order -->


	<div class="modal fade" id="lxrgl1" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width: 700px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">客户联系人管理</h4>
				</div>
				<input name="khno" id="khno" type="hidden"> <input
					name="webSite" id="webSite" type="hidden"> <input
					name="fax" id="fax" type="hidden"> <input name="id" id="id"
					type="hidden">
				<div class="modal-body">
					<table>
						<tr>
							<td>客户编号：</td>
							<td><input class="form-control" type="text"
								 id="example-c" readonly></td>
							<td>客户名称：</td>
							<td><input class="form-control" type="search"
								 id="example-s" readonly></td>
						</tr>
					</table>

					<button type="button"
						class="btn btn-outline btn-default btn-primary" id="getAddDlg"
						data-toggle="modal" data-target="#myModal">
						<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
					</button>
					<button type="button" onclick="deleteById()"
						class="btn btn-outline btn-default btn-primary">
						<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>
					</button>
					<table id="planTable"></table>


				</div>
			</div>




		</div>
	</div>


<!-- 交往记录管理 -->
	<div class="modal fade" id="jwjlgl" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width: 700px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">客户交往记录管理</h4>
				</div>
				<input name="khno" id="khno" type="hidden"> <input
					name="webSite" id="webSite" type="hidden"> <input
					name="fax" id="fax" type="hidden"> <input name="id" id="id"
					type="hidden">
				<div class="modal-body">
					<table>
						<tr>
							<td>客户编号：</td>
							<td><input class="form-control" type="text" 
								 id="example-c" readonly></td>
							<td>客户名称：</td>
							<td><input class="form-control" type="search" 
								 id="example-s" readonly></td>
						</tr>
					</table>

					<button type="button"
						class="btn btn-outline btn-default btn-primary" id="getAddDlg"
						data-toggle="modal" data-target="#myModal">
						<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
					</button>
					<button type="button" onclick="deleteById()"
						class="btn btn-outline btn-default btn-primary">
						<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>
					</button>
					<table id="planTablea"></table>


				</div>
			</div>




		</div>
	</div>





</body>
</html>