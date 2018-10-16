<%--
 Created by IntelliJ IDEA.
 User: Administrator
 Date: 2018/9/20
 Time: 17:16
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
    <json:property name="id" value="${works.id}"/>
    <json:property name="name" value="${works.name}"/>
    <json:property name="littleWord" value="${works.littleWord}"/>
    <json:property name="littleWord" value="${works.littleWord}"/>
    <json:property name="littlePicture" value="${works.littlePicture}"/>
    <json:property name="link" value="${works.link}"/>
    <json:property name="mainPicture" value="${works.mainPicture}"/>

    <json:property name="mainWord" value="${works.mainWord}"/>


</json:object>

