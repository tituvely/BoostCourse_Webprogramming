<%--
  Created by IntelliJ IDEA.
  User: titu
  Date: 2020/12/30
  Time: 2:24 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>일정을 관리하세요</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
    <body>
    <div class = container>
        <div class="header">
            <button class="newTodo" type="button" onclick="location.href='./todoForm'">
                새로운 TODO 등록
            </button>
        </div>
        <div class="todo">
            TODO
        </div>
        <div class="doing">
            DOING
        </div>
        <div class="done">
            DONE
        </div>
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
        <div class="doingList">
            <c:forEach items="${list}" var="item">
                <c:if test="${item.type == 'DOING'}">
                    <div class="list">
                        <span style="font-size: 20px; font-weight: bold;"> ${item.title} <br><br> </span>
                        <span style="font-size: 15px;"> 등록날짜: ${item.regDate.split(" ")[0]} , ${item.name}, 우선순위 ${item.sequence} </span>
                        <button id="button_type" type="button" onclick="typeChange('${item.id}', '${item.type}')"> -> </button>
                    </div>
                </c:if>
            </c:forEach>
        </div>
        <div class="doneList">
            <c:forEach items="${list}" var="item">
                <c:if test="${item.type == 'DONE'}">
                    <div class="list">
                        <span style="font-size: 20px; font-weight: bold;"> ${item.title} <br><br> </span>
                        <span style="font-size: 15px;"> 등록날짜: ${item.regDate.split(" ")[0]} , ${item.name}, 우선순위 ${item.sequence} </span>
                    </div>
                </c:if>
            </c:forEach>
        </div>
        <div class="footer">
            made by titu
        </div>
    </div>
    </body>
    <script src="typeChange.js?ver=2"></script>
</html>