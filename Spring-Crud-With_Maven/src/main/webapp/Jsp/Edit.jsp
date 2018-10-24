<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<center>
<head>
<h1>**Re pagistration page**</h1>
${msg}
</head>
<form action="update">
<body bgcolor="yellow">
<pre>
<input type="hidden" name="uid" value="${ldata.uid}">

Name:-     <input type="text" name="nm" value="${ldata.nm}">

Address:-  <input type="text" name="addr" value="${ldata.addr}">

Mobileno:- <input type="text" name="mn" value="${ldata.mn}">

Username:- <input type="text" name="un" value="${ldata.l.un}">

Password:- <input type="text" name="pw" value="${ldata.l.pw}">

              <input type="submit" value="Update">
            
            
</pre>
</body>
</form>
</center>
</html>