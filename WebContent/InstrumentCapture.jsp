<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="CSS/tradeCapture.css">
<title>Instrument Capture</title>
</head>
<body>
<form action="ServletController" method="GET">
<input type="hidden" name="command" value="InstrumentCapture">

<div id="wrapper">
	<div id="header">
	<h2 align="center"> Instrument Capture </h2>
	
	</div>

</div>

<div id="container">
	<div id="content">
	<table>
	
		<tr><td align="right">Instrument Name:</td><td><input type="text" placeholder="Enter company reference" name="InstrumentName"/><br/></td></tr>
		<tr><td align="right">Instrument Reference:</td><td><input type="text" placeholder="Enter instrument reference" name="InstrumentRef"/></td></tr>
		<tr><td align="right">Market:</td><td><input type="text" placeholder="Enter Party reference" name="market"/><br/></td></tr>
	</table>
	<br/><br/>
	<div class="Container ">
	<input type="submit" value="Submit"/></t><input type="submit" value="Close"/>
	</div>
	</div>
</div>
</form>
</body>
</html>