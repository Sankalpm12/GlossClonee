<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Party Details</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css">
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2 align="center">Party Details</h2>

		</div>


	</div>

	<div id="container">
		<div id="content">
			<table border="1">
				<tr>
					<th>Party ID</th>
					<th>Party Name</th>				
					<th>Party Reference</th>
					<th>Party</th>
				</tr>
					<tr>
						<td>${PartyDetail.partyId}</td>
						<td>${PartyDetail.partyName}</td>
						<td>${PartyDetail.partyReference}</td>
						<td>${PartyDetail.country}</td>

					</tr>

			</table>

		</div>


	</div>
	<input type="button" value="Close"
		onclick="window.location.href='PartyReporting.jsp'; return false;"
		class="add-student-button" />
	
</body>
</html>