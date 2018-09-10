<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Book Store</title>

<style type="text/css">
.image1{
	width:150px;
}

.book1:link,.book1:visited{
	display:block;
	background-color:#FF2832;
	color:#ffffff;
	font-weight:bold;
	width:120px;
	text-align:center;
	text-decoration:none;
	padding:4px;
}
.book1:hover,.book1:active{
	background-color:#ff6347;
}

</style>

</head>
<body>
<table width="90%" height="600px" border="0" align="center">
	<tr height="10%"><td colspan="2">
		<jsp:include page="header1.jsp" flush="true" />
	</td></tr>
	<tr><td>
		<table width="90%" border="0" align="center">
			<tr align="left">
				<td rowspan="10" ><img alt="${requestScope.book.name}" src="images/${requestScope.book.image}" class="image1"></td>
				<td><h2>${requestScope.book.name}</h2></td>
				<td align="left"><h2>(${requestScope.book.intro})</h2></td>
			</tr>
			<tr align="left">
				<td><span>作者：${requestScope.book.author}</span></td>
				<td><span>出版社：${requestScope.book.publisher}</span></td>
			</tr>
			<tr><td><br/></td></tr>
			<tr align="left">
				<td><span>价格：${requestScope.book.price}</span></td>
				<td><span>库存数量：${requestScope.book.amount}</span></td>
			</tr>
			<tr><td><br/></td></tr>
			<tr ><td colspan="2">服务:&nbsp;&nbsp;由“Book&nbsp;Store”发货，并提供售后服务。 今日19:45前完成下单，预计后天可送达</td></tr>
			<tr><td><br/></td></tr>
	<!-- 		<tr>
				<td align="right"><span>购买数量:&nbsp;&nbsp;</span></td>
				<td align="left"><input type="text" name="quantity" style="width:40px;height:20px;"></td>
			</tr>
			<tr><td><br/></td></tr> -->
			<tr>
				<td align="right"><a href="addshopping.do?book_id=${requestScope.book.id}&book_quantity=1" target="_blank" class="book1">加入购物车</a></td>
				<td align="left"><a href="" target="_blank" class="book1">立即购买</a></td>
			</tr>
		</table>
	</td></tr>
	<tr height="5%"><td colspan="2">
		<jsp:include page="footer.jsp" flush="true" />
	</td></tr>
</table>
</body>
</html>