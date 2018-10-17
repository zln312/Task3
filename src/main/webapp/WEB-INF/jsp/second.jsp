<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/20
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<% long start=System.currentTimeMillis();%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="massage">
        <spring:message code="${code}"/>
    </json:property>
    <json:array name="data" items="${list}" var="second">
        <json:object>
            <json:property name="id" value="${second.id}"/>
            <json:property name="name" value="${second.name}"/>
            <json:property name="firstId" value="${second.firstId}"/>
            <json:property name="status" value="${second.status}"/>
            <json:property name="updateBy" value="${second.updateBy}"/>
            <json:property name="createAt" value="${second.createAt}"/>
            <json:property name="updateAt" value="${second.updateAt}"/>

        </json:object>
    </json:array>
</json:object>
<%=System.currentTimeMillis()-start%>