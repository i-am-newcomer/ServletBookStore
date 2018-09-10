<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<style type="text/css">
.image1{
	width:150px;
}

.author{
	color:#aaa;
	font-size:14px;
}

.price1{
	color:#ff0000;
	font-size:15px;
}

.price2{
	color:#aaa;
	font-size:12px;
}

a:link,a:visited{
	text-decoration:none;
	color:#000000;
	font-size:14px;
}

a:hover,a:active{
	text-decoration:underline;
	color:#ffa500;
	font-size:16px;
}
</style>

<table width="100%"  border="0" align="center" rules="none">
	<tr><td colspan="4" align="left" valign="middle"><span style="color:#487A6F;font-size:22px;">新书上架</span></td></tr>
	<tr><td colspan="4" align="left" valign="top"><br/></td></tr>
	<tr align="center">
		<td><a href="showbook?book_id=3" target="_blank"><img alt="CET6" src="images/3.jpg" class="image1"></a></td>
		<td><a href="showbook?book_id=25" target="_blank"><img alt="novel1" src="images/25.jpg" class="image1"></a></td>
		<td><a href="showbook?book_id=7" target="_blank"><img alt="java1" src="images/7.jpg" class="image1"></a></td>
		<td><a href="showbook?book_id=20" target="_blank"><img alt="literature1" src="images/20.jpg" class="image1"></a></td>
	</tr>
	<tr align="center">
		<td><a href="showbook?book_id=3" target="_blank">星火英语六级真题</a></td>
		<td><a href="showbook?book_id=25" target="_blank">挪威的森林</a></td>
		<td><a href="showbook?book_id=7" target="_blank">深入理解java虚拟机</a></td>
		<td><a href="showbook?book_id=20" target="_blank">天长地久：给美君的信</a></td>
	</tr>
	<tr align="center">
		<td><span class="author">汪开虎</span></td>
		<td><span class="author">村上春树</span></td>
		<td><span class="author">周志明</span></td>
		<td><span class="author">龙应台</span></td>
	</tr>
	<tr align="center">
		<td><span class="price1">￥36.80</span>&ensp;&ensp;<span class="price2">￥56.80</span></td>
		<td><span class="price1">￥19.00</span>&ensp;&ensp;<span class="price2">￥38.00</span></td>
		<td><span class="price1">￥68.00</span>&ensp;&ensp;<span class="price2">￥88.00</span></td>
		<td><span class="price1">￥36.80</span>&ensp;&ensp;<span class="price2">￥56.80</span></td>
	</tr>
</table>
