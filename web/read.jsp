<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">
        
                <h1>Tyler's NFL Players Database</h1>
        <%= table %>
        
        <br><br>
        <a href ="add">Add a New Player</a>
        <br><br>
        <a href="search.jsp">Search Players</a>
    
            </div>
       <%@ include file="includes/footer.jsp" %>
        
         </div>
           
    </body>
    
</html>
