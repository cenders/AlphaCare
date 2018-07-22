<%@page import="ist412.alphacare.Record"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/index.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
        <title>AlphaCare | Records</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">AlphaCare</a>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                  <a class="nav-link" href="/Dashboard">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" href="/Records">Records<span class="sr-only">(current)</span></a>
                </li>
              </ul>
            </div>
        </nav>
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Date</th>
                        <th scope="col">Record Type</th>
                        <th scope="col">Message</th>
                        <th scope="col">Recorded By</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                    <%
                    Record[] records = (Record[])request.getAttribute("Records");
                    for( int i = 0; i < records.length; i++){
                        out.println("<tr>");
                        out.println("<td>" + records[i].getRecordDate().toString() + "</td>");
                        out.println("<td>" + records[i].getRecordType() + "</td>");
                        out.println("<td>" + records[i].getMsg() + "</td>");
                        out.println("<td>" + records[i].getWorker() + "</td>");
                        out.println("</tr>");
                    }
                    %>    
                  </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
