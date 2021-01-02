<%--
  Created by IntelliJ IDEA.
  User: titu
  Date: 2020/12/29
  Time: 9:33 오후
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
    <title>할일을 등록하세요</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="title">
    할일 등록
</div>
<div class="content">
    <form method="POST" action="./todoAdd">
        <div class="question">어떤일인가요?</div>
        <input type="text" name="what" placeholder="swift 공부하기(24자까지)" maxlength="24"><br>
        <div class="question">누가 할일인가요?</div>
        <input type="text" name="who" placeholder="홍길동"><br>
        <div class="question">우선순위를 선택하세요</div>
        <label><input type="radio" name="priority" value="1"> 1순위</label>
        <label><input type="radio" name="priority" value="2"> 2순위</label>
        <label><input type="radio" name="priority" value="3"> 3순위</label>
        <div>
            <input type="button" value="< 이전" onClick="location.href='javascript:history.back()'">
            <input type="submit" value="제출">
            <input type="reset" value="내용지우기">
        </div>
    </form>
</div>
</body>
</html>
