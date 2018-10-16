

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
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="massage">
        <spring:message code="${code}"/>
    </json:property>
    <json:array name="data" items="${words}" var="words">
        <json:object>
            <json:property name="id" value="${words.id}"/>
            <json:property name="vistior" value="${words.visitor}"/>
            <json:property name="content" value="${words.content}"/>
            <json:property name="createAt" value="${words.createAt}"/>
        </json:object>
    </json:array>
</json:object>
