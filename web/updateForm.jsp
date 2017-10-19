<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.NFLPlayers"%>
<% NFLPlayers Player = (NFLPlayers) request.getAttribute("Player"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Update a Player</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <h1>Update A Player Record</h1>
     
        <form name="updateForm" action="updatePlayer" method="get">
            
            <label>Player ID:</label>
            <input type="text" name="id" value="<%= Player.getPLAYERID() %>" readonly />
            <br>
            <label>Player Name:</label>
            <input type="text" name="name" value="<%= Player.getPLAYERNAME() %>" />
            <br>
            <label>Team Name:</label>
            <input type="text" name="team" value="<%= Player.getTEAMNAME() %>" />
            <br>
            <label>Age:</label>
            <input type="text" name="age" value="<%= Player.getAGE() %>" />
            <br>
            <label>Posistion:</label>
            <input type="text" name="posistion" value="<%= Player.getPOSISTION() %>" />
            <br>
            <input type="submit" name="submit" value="Update" />
        </form>
    </body>
</html>
