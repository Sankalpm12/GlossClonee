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
					<th>TradeID</th>
					<th>Company</th>
					<th>Instrument</th>
					<th>Party</th>
					<th>Price</th>
				</tr>
					<tr>
						<td>${TradeEnquiry.id}</td>
						<td>${TradeEnquiry.company}</td>
						<td>${TradeEnquiry.instrument}</td>
						<td>${TradeEnquiry.party}</td>
						<td>${TradeEnquiry.price}</td>

					</tr>

			</table>

		</div>


	</div>
	<input type="button" value="Close"
		onclick="window.location.href='TradeReporting.jsp'; return false;"
		class="add-student-button" />
	
</body>
</html>