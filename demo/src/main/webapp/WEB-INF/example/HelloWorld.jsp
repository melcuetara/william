<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="HelloWorld.message"/></title>
</head>

<body>
<h2><s:property value="message"/></h2>

<h3>Menu</h3>
<ul>
    <li>
        <s:url var="url" action="displayTables">
        </s:url>
        <s:a href="%{url}">Display Table</s:a>
    </li>
</ul>

</body>
</html>
