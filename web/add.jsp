<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Player</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">




                <h1>Add a New Player</h1>

                <form name="addForm" action="addPlayer" method="get">

                    <label>Player Name:</label>
                    <input type="text" name="name" value="" />
                    <br>
                    <label>Team Name:</label>
                    <input type="text" name="team" value="" />
                    <br>
                    <label>Age:</label>
                    <input type="text" name="age" value="" />
                    <br>
                    <label>Posistion:</label>
                    <input type="text" name="posistion" value="" />
                    <br>
                    <input type="submit" name="submit" value="Submit" />
                </form>
            </div>
            <%@ include file="includes/footer.jsp" %>

        </div>
    </body>
</html>
