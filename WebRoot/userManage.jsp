<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userManage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.css">
	<script src="js/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    		<table class="table table-bordered table-responsive table-striped table-hover">
		<thead>
			<tr class="info">
				<th align="center" valign="middle">员工姓名</th>
				<th align="center" valign="middle">所属部门</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="emps" var="user">
			<tr>
				<td align="center" valign="middle"><s:property value="#user.name"/></td>
				<td align="center" valign="middle"><s:property value="#user.depart.name"/></td>
				<td align="center" valign="middle"><div class="btn-group">
					<a href="Emp_findEmp?id=<s:property value="#user.id"/>" class="btn btn-info">修改</a>
					<a href="Emp_deleteEmp?userId=<s:property value="#user.id"/>" class="btn btn-warning">删除</a>
				</div></td>
			</tr>
			</s:iterator>
		</tbody>
		</table> <br>
  </body>
</html>
