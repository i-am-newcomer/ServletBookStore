<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Book Store</title>
</head>
<body>
<table width="90%" height="600px" border="0" align="center">
	<tr height="10%"><td colspan="2">
		<jsp:include page="header1.jsp" flush="true" />
	</td></tr>
	<tr height="20%">
		<td width="20%"><jsp:include page="classification.jsp" flush="true" /></td>
		<td><jsp:include page="newbook.jsp" flush="true" /></td>
	</tr>
	<tr height="10%"><td colspan="2"><hr/></td></tr>
	<tr height="40%"><td colspan="2"><jsp:include page="recommendbook.jsp" flush="true" /></td></tr>
	<tr><td></td></tr>
	<tr height="5%"><td colspan="2">
		<jsp:include page="footer.jsp" flush="true" />
	</td></tr>
</table>
</body>
</html>