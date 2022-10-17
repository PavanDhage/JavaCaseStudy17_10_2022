<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action=performRecharge" method="post">
<h4 style=font-family:Courier New; color:blue">
Enter Mobile Number:<input type="text" name=mobileNumber"/>
<br/>
Select Plan from below
<table border="2" cellpadding="10" bgcolor="yellow">
<tr bgcolor="orange">
<th>PLAN ID</th>
<th>DAYS</th>
<th>TALKTIME</th>
<th>DATA</th>
<th>PRICE</th>
<th>SELECT</th>
</tr></table>
<c:forEach var="offer" items="${offerList}">
<tr>
<td>${offer.id}</td>
<td>${offer.days}</td>
<td>${offer.talkTime}</td>
<td>${offer.data} GB</td>
<td>${offer.price}</td>

<td><input type="radio" name="offerId" value="${offer.id}"/></tr>
</c:forEach>
</table>
</h4>
<input type="submit" value="Submit"/>
</form>

</div>
</body>
</html>