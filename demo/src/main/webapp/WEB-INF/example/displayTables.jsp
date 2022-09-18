<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>User Tables</title>
</head>

<body>

<h3>Table</h3>
    <s:iterator value="users">
        <p><s:property value="id" /></p>
        <p><s:property value="age" /></p>
        <p><s:property value="contactNumber" /></p>
        <p><s:property value="name" /></p>
        <br />
    </s:iterator>
</body>
</html>
