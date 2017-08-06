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
    
    <title>My JSP 'showAllUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/bootstrap.css" rel="stylesheet">
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
				<th align="center" valign="middle">员工性别</th>
				<th align="center" valign="middle">员工生日</th>
				<th align="center" valign="middle">所属部门</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="emps" var="user">
			<tr>
				<td align="center" valign="middle"><s:property value="#user.name"/></td>
				<td align="center" valign="middle"><s:property value="#user.sex"/></td>
				<td align="center" valign="middle"><s:date name="#user.birth" format="yyyy-MM-dd"/></td>
				<td align="center" valign="middle"><s:property value="#user.depart.name"/></td>
			</tr>
			</s:iterator>
		</tbody>
		</table>
  </body>
</html>
