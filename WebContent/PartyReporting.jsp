<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="CSS/tradeCapture.css">
<title>Trade Enquiry</title>
</head>
<body>
<form action="ServletController" method="GET">
<input type="hidden" name="command" value="PartyEnquiry">

<div id="wrapper">
	<div id="header">
	<h2 align="center"> Party Enquiry </h2>
	
	</div>

</div>

<div id="container">
	<div id="content">
	<table>
	
		<tr><td align="right">Party Reference:</td><td><input type="number" placeholder="Enter party reference" name="partyReference"/><br/></td></tr>	

	</table>
	<br/><br/>
	<div class="Container ">
	<input type="submit" value="Search"/></t><input type="button" onclick="window.location.href = 'http://localhost:8080/GLOSSClone/ServletController';" value="Close"/>
	</div>
	</div>
</div>
</form>

</body>
</html>