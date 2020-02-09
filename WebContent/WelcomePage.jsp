<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="CSS/style.css">
<link type="text/css" rel="stylesheet" href="CSS/Options.css">
<title>TE</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2 align="center">Task Explorer</h2>
		</div>
	</div>
	<div id="container">
	<div id="content">
	
		<table>
			<tr>
			<th>
			<div class="dropdown">
				<button class="dropbtn">Capture</button>
				<div class="dropdown-content">
					<a href="/GLOSSClone/tradeCapture.jsp">Trade Capture</a>
					<a href="/GLOSSClone/InstrumentCapture.jsp">Instrument Capture</a> 
					<a href="/GLOSSClone/PartyCapture.jsp">Party Capture</a>
				</div>
			</div>
			</th>
			<th>
				<div class="dropdown">
				<button class="dropbtn">Reporting</button>
				<div class="dropdown-content">
					<a href="/GLOSSClone/TradeReporting.jsp">Trade List</a>
					<a href="/GLOSSClone/InstrumentReporting.jsp">Instrument List</a> 
					<a href="/GLOSSClone/PartyReporting.jsp">Party List</a>
				</div>
			</div>
			</th>
			</tr>
		</table>
		
		</div>
	</div>
</body>
</html>