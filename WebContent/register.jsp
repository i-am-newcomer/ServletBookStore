<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册-BOOK STORE</title>
</head>
<body>
<table width="90%" height="600px" rules="none" border="0" align="center">
	<tr height="15%"><td>
		<jsp:include page="header2.jsp" flush="true">
			<jsp:param value="注册" name="subTitle"/>
		</jsp:include>
	</td></tr>
	
	<tr><td>
		<form action="register.do" method="post">
			<table width="80%" rules="none" border="0" align="center">
				<tr><td colspan="3" align="center"><h1>注册新用户</h1></td></tr>
				<tr><td colspan="3" align="center"><h3>${requestScope.register_result}</h3></td></tr>
				<tr>
					<td align="right" width="30%"><span>邮箱</span></td>
					<td align="left" width="70%" colspan="2"><input type="text" name="register_email" placeholder="邮箱账号" style="width:250px;height:25px;margin:5px;"/></td>
				</tr>
				<tr>
					<td align="right" width="30%"><span>手机号</span></td>
					<td align="left" width="70%" colspan="2"><input type="text" name="register_phone" placeholder="11位手机号码" style="width:250px;height:25px;margin:5px;"/></td>
				</tr>
				<tr>
					<td align="right" width="30%"><span>用户名</span></td>
					<td align="left" width="70%" colspan="2"><input type="text" name="register_username" placeholder="用户名，不得少于四位" style="width:250px;height:25px;margin:5px;"/></td>
				</tr>
				<tr>
					<td align="right" width="30%"><span>密码</span></td>
					<td align="left" width="70%" colspan="2"><input type="password" name="register_pwd" placeholder="密码，不得少于6位" style="width:250px;height:25px;margin:5px;"/></td>
				</tr>
				<tr>
					<td align="right" width="30%"><span>确认密码</span></td>
					<td align="left" width="70%" colspan="2"><input type="password" name="register_confpwd" style="width:250px;height:25px;margin:5px;"/></td>
				</tr>
				<tr>
					<td align="right" width="40%"><img alt="checkcode" src="checkcode"></td>
					<td align="left" width="20%"><input type="text" name="register_checkcode" style="width:200px;height:25px;margin:5px;"></td>
					<td align="left" width="40%"><a href="" onclick="myReload()" style="color:red">看不清，换一张</a></td>
				</tr>
				<tr><td colspan="3" align="center"><input type="submit" value="注册" style="width:150px;height:32px;margin:5px;background-color:#4688F1;color:#ffffff"/></td></tr>
			</table>
		</form>	
	</td></tr>
	
	<tr height="15%"><td>
		<jsp:include page="footer.jsp" flush="true" />
	</td></tr>
</table>
</body>
</html>