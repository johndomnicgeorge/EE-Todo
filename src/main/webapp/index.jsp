<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>EE-Todo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="shared/header.jsp"></jsp:include>
        <div class="container">
            <h2>Welcome to EE-Todo</h2>
            <div class="col-md-6 col-md-offset-3">
                Kindly login to proceed.
            </div>
        </div>
        <jsp:include page="shared/footer.jsp"></jsp:include>
    </body>
</html>