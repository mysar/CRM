<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>营销管理</title>
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
	                        <form action="${pageContext.request.contextPath}/chance/goChance.controller">
                            	
                            	<div class="form-group draggable">
	                                <div class="col-sm-2">
	                                    <select class="form-control" name="state">
	                                    	<option value="">请选择...</option>	
	 										<option value="0">未分配</option>
	 										<option value="1">已分配</option>	
	                                    </select>
	                                 </div>
                            	</div>
                            		
 		                     	<button class="btn btn-primary" type="submit">搜索</button>
 		                    </form>
 		                   </div>
 <!-- 添加 -->		                   
<button class="btn btn-primary" data-toggle="modal" data-target="#myModal_save"> 创建</button>
<!-- 添加模态框（Modal） -->
<div class="modal fade col-sm-14" id="myModal_save" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content" style="width: 700px;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="myModalLabel"> 添加 </h4>
			</div>
			
			<div class="ibox-content">
                        <form role="form" class="form-horizontal m-t" action="${pageContext.request.contextPath}/chance/addChance.controller" method="post">
                            <div class="form-group draggable">
                                <label class="col-sm-3 control-label">客户名称：</label>
                                <div class="col-sm-5">
                                    <input type="text" name="customerName" class="form-control">
                                </div>
                            </div>
                            
                            <div class="form-group draggable">
                                <label class="col-sm-3 control-label">机会来源：</label>
                                <div class="col-sm-5">
                                    <input type="text" name="chanceSource" class="form-control">
                                </div>
                            </div>
                              <div class="form-group draggable">
                                <label class="col-sm-3 control-label">联系人:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="linkMan" class="form-control">
                                </div>
                            </div>
                              <div class="form-group draggable">
                                <label class="col-sm-3 control-label">联系电话:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="linkPhone" class="form-control">
                                </div>
                            </div>
                              <div class="form-group draggable">
                                <label class="col-sm-3 control-label">成功几率(%):</label>
                                <div class="col-sm-5">
                                    <input type="text" name="cgjl" class="form-control" placeholder="格式类型：80">
                                </div>
                            </div>
                            <div class="form-group draggable">
                                <label class="col-sm-3 control-label">概要:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="overview" class="form-control">
                                </div>
                            </div>
                           	
                           	<div class="form-group">
                                <label class="col-sm-3 control-label">描述:</label>
                                <div class="col-sm-8">
                                    <textarea id="ccomment" name="description" class="form-control" required="" aria-required="true"></textarea>
                                </div>
                            </div>
                            
                           
                            
                            <div class="form-group draggable">
                                <label class="col-sm-3 control-label">创建人:</label>
                                <div class="col-sm-4">
                                    <input type="text" name="createMan" class="form-control" placeholder="当前用户">
                                     <span class="help-block m-b-none"><i class="fa fa-info-circle"></i> 默认使用当前用户</span>
                                </div>
                                <div class="col-sm-4"><input type="text" name="exeAffect" class="form-control" placeholder="默认当前时间">
                                 <span class="help-block m-b-none"><i class="fa fa-info-circle"></i> 创建时间</span>
                                </div>
                            </div>
                            
                            <div class="form-group draggable">
                                <label class="col-sm-3 control-label">指派给:</label>
                                <div class="col-sm-4">
                                <input type="hidden" name="state" value="1" >
                                <input type="hidden" name="devResult" value="0" >
                                    <select class="form-control" name="assignMan">
                                        <option value="">请选择...</option>	
	 									<option value="小明">小明</option>
	 									<option value="小张">小张</option>
	 									<option value="小刘">小刘</option>		
                                    </select>
                                </div>
                                <div class="col-sm-4"><input type="text" name="exeAffect" class="form-control" placeholder="默认当前时间">
                                 <span class="help-block m-b-none"><i class="fa fa-info-circle"></i> 指派时间</span>
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
                                    <tr>
                                        <th>#</th>
                                        <th>客户名称</th>
                                        <th>机会来源</th>
                                        <th>成功几率</th>
                                        <th>联系人</th>
                                        <th>联系电话</th>
                                        <th>机会描述</th>
                                        <th>概要</th>
                                        <th>创建人</th>
                                      <!-- <th>创建时间</th>-->
                                        <th>指派人</th>
                                        <th>指派时间</th>
                                        <th>分配状态</th>
                                        <th>客户开发状态</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:forEach items="${paging}" var="chance">
									<tr>
										<td><input type="checkbox" class="i-checks" name="input[]"> ${chance.id}</td>
										<td>${chance.customerName}</td>
										<td>${chance.chanceSource}</td>
										<td>${chance.cgjl}%</td>
										<td>${chance.linkMan}</td>
										<td>${chance.linkPhone}</td>
										<td>${chance.description}</td>
										<td>${chance.overview}</td>
										<td>${chance.createMan}</td>
										<!-- 
										<td><fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${chance.createTime}" /></td>-->
										<td>${chance.assignMan }</td>
										<td><fmt:formatDate value="${chance.assignTime}" type="date" dateStyle="default"/></td>
										<td><c:if test="${chance.state==0}">
										
										<button class="btn btn-green" data-toggle="modal" data-target="#myModal1">未分配
										</button></c:if>
										<c:if test="${chance.state==1}">已分配</c:if></td>
										<td class="project-status">
											<c:if test="${chance.devResult==0}"><span class="label label-warning">未开发</c:if>
											<c:if test="${chance.devResult==1}"><span class="label label-primary">进行中</c:if>
											<c:if test="${chance.devResult==2}"><span class="label label-default">开发成功</c:if>
											<c:if test="${chance.devResult==3}"><span class="label label-danger">开发失败</c:if>
										</td>
									</tr>
									</c:forEach>
								</tbody>
</table>
</div></div></div></div></div></div>

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h2 class="modal-title" id="myModalLabel">分配</h2>
			</div>
			
			 <div class="ibox-content">
                        <form role="form" class="form-horizontal m-t" action="${pageContext.request.contextPath}/chance/updateChance.controller?id=${chance.id}">
                            <div class="form-group draggable">
                                <label class="col-sm-3 control-label">计划项:${chance.id }</label>
                                <div class="col-sm-9">
                                    <input type="text" name="id" class="form-control" value="${chance.id }" id="idd">
                                </div>
                            </div>
                            
                            
                            <div class="form-group draggable">
                                <label class="col-sm-3 control-label">下拉列表：</label>
                                <div class="col-sm-9">
                                    <select class="form-control" name="">
                                        <option>选项 1</option>
                                        <option>选项 2</option>
                                        <option>选项 3</option>
                                        <option>选项 4</option>
                                    </select>
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