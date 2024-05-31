
<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<% String s = (String) request.getAttribute("Titolo"); %>
<% List<String> regione = (List<String>) request.getAttribute("regioni"); %>

<h1>Regione d'italia</h1>
<h2><%= s %></h2>
<% for (String reg :regione){ %>
<p><a href="/Istat.it/province?regione=<%=reg %>"><%=reg %></a></p>
<% } %>
</body>
</html>