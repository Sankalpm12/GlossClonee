<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="CSS/tradeCapture.css">
<title>Party Capture</title>
</head>
<body>
<form action="ServletController" method="GET">
<input type="hidden" name="command" value="PartyCapture">
<div id="wrapper">
	<div id="header">
	<h2 align="center"> Party Capture </h2>
	
	</div>

</div>

<div id="container">
	<div id="content">
	<table>
	
		<tr><td align="right">Party Name:</td><td><input type="text" placeholder="Enter Party name" name="partyName"/><br/></td></tr>
		<tr><td align="right">Party Reference:</td><td><input type="text" placeholder="Enter party reference" name="partyReference"/></td></tr>
		<tr><td align="right">Country:</td><td><input type="text" placeholder="Enter country" name="country"/><br/></td></tr>
	</table>
	<br/><br/>
	<div class="Container ">
	<input type="submit" value="Submit"/></t><input type="button" onclick="window.location.href = 'http://localhost:8080/GLOSSClone/ServletController';" value="Close"/>
	</div>
	</div>
</div>
</form>
</body>
</html>