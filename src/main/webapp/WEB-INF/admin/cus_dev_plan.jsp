<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户开发计划</title>
<link href="${pageContext.request.contextPath}/admin/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/css/plugins/iCheck/custom.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/css/animate.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/admin/css/style.min862f.css?v=4.1.0" rel="stylesheet">
</head>
<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-14">
                <div class="ibox float-e-margins">
                   	<div class="ibox-content">
                        <div class="row">
	                        <form action="${pageContext.request.contextPath}/plan/goPlan.controller">
                            	<div class="form-group draggable">
	                                <div class="col-sm-4">
	                                    <select class="form-control" name="devResult">
	                                    	<option value="">请选择开发状态...</option>	
	 										<option value="0">未开发</option>
	 										<option value="1">开发中</option>
	 										<option value="2">开发成功</option>
	 										<option value="3">开发失败</option>		
	                                    </select>
	                                 </div>
	                                
                            	</div>
                            		
 		                     	<button class="btn btn-primary" type="submit">搜索</button>
 		                    </form>
 		                   </div>
				 <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover dataTables-example">
                                <thead>
                                    <tr>
                                       <th>编号</th>
										<th>客户名称</th>
										<th>概要</th>
										<th>联系人</th>
										<th>创建人</th>
										<th>创建时间</th>
										<th>指派人</th>
										<th>指派时间</th>
										<th>客户开发状态</th>
										<th>操作</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:forEach items="${paging}" var="plan">
									<tr>
										<td>${plan.id}</td>
										<td>${plan.saleChance.customerName}</td>
										<td>${plan.saleChance.overview}</td>
										<td>${plan.saleChance.linkMan}</td>
										<td>${plan.saleChance.createMan}</td>
										<td><fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${plan.saleChance.createTime}" /></td>
										<td>${plan.saleChance.assignMan}</td>
										<td><fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${plan.saleChance.assignTime}" /></td>
										
										
										<td class="project-status">
											<c:if test="${plan.saleChance.devResult==0}"><span class="label label-warning">未开发</c:if>
											<c:if test="${plan.saleChance.devResult==1}"><span class="label label-primary">进行中</c:if>
											<c:if test="${plan.saleChance.devResult==2}"><span class="label label-default">开发成功</c:if>
											<c:if test="${plan.saleChance.devResult==3}"><span class="label label-danger">开发失败</c:if>
										</td>
				
										<td><a href="${pageContext.request.contextPath}/plan/updatePlan.controller?id=${plan.saleChance.id}">
											<button class="btn btn-white" type="button">开发</button></a>
											<a href="${pageContext.request.contextPath}/plan/plan.controller?id=${plan.saleChance.id}">
											<button class="btn btn-white" type="button">查看详情</button></a></td>
									</tr>
								</c:forEach>
								</tbody>
</table>
</div></div></div></div></div></div>

<
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