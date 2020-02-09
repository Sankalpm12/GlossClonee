<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trade Details</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css">
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2 align="center">Trade Details</h2>

		</div>


	</div>

	<div id="container">
		<div id="content">
			<table border="1">
				<tr>
					<th>InstrumentID</th>
					<th>Instrument Name</th>				
					<th>Instrument Reference</th>
					<th>Market</th>
				</tr>
					<tr>
						<td>${InstrumentEnquiry.instrumentId}</td>
						<td>${InstrumentEnquiry.instrumentName}</td>
						<td>${InstrumentEnquiry.instrumentReference}</td>
						<td>${InstrumentEnquiry.market}</td>

					</tr>

			</table>

		</div>


	</div>
	<input type="button" value="Close"
		onclick="window.location.href='InstrumentReporting.jsp'; return false;"
		class="add-student-button" />
	
</body>
</html>