<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="CSS/tradeCapture.css">
<title>Trade Capture</title>
</head>
<body>
<form action="ServletController" method="GET">
<input type="hidden" name="command" value="TradeCapture">

<div id="wrapper">
	<div id="header">
	<h2 align="center"> Trade Capture </h2>
	
	</div>

</div>

<div id="container">
	<div id="content">
	<table>
	
		<tr><td align="right">Company:</td><td><input type="text" placeholder="Enter company reference" name="company"/><br/></td></tr>
		<tr><td align="right">Instrument:</td><td><input type="text" placeholder="Enter instrument reference" name="instrument"/></td></tr>
		<tr><td align="right">Party:</td><td><input type="text" placeholder="Enter Party reference" name="party"/><br/></td></tr>
		<tr><td align="right">Price:</td><td><input type="text" placeholder="Enter Price" name="price"/></td></tr>
		<tr><td align="right">Market:</td><td><input type="text" placeholder="Enter Market reference" name="market"/><br/></td></tr>
		<tr><td align="right">Quantity:</td><td><input type="text" placeholder="Enter Quantity" name="quantity"/></td></tr>

		

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