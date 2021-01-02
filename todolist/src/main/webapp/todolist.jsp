<%--
  Created by IntelliJ IDEA.
  User: titu
  Date: 2021/01/01
  Time: 5:53 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="todoList">
    <c:forEach items="${list}" var="item">
        <c:if test="${item.type == 'TODO'}">
            <div class="list">
                <span style="font-size: 20px; font-weight: bold;"> ${item.title} <br><br> </span>
                <span style="font-size: 15px;"> 등록날짜: ${item.regDate.split(" ")[0]} , ${item.name}, 우선순위 ${item.sequence} </span>
                <button id="button_type" type="button" onclick="typeChange('${item.id}', '${item.type}')"> -> </button>
            </div>
        </c:if>
    </c:forEach>
</div>