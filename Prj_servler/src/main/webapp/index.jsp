<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<html>
<head>
	<title>Pagina principale</title>
</head>
<body>
	<h1>Home page JSP</h1>
	<%= LocalDateTime.now() %>
	<form action="libri">
		<input type="text" name="titolo" placeholder="titolo"><br>
		<input type="text" name="autore" placeholder="autore"><br>
		<input type="number" name="id" placeholder="id"><br>
		<input type="number" step="0.5" name="prezzo" placeholder="titolo"><br>
		<button>Add Libro</button>
	</form>
	<table id = "tabella">
		<tr>
			<th>Titolo</th>
			<th>autore</th>
		<tr>
	</table>
	<script type= "text/javascript">
		const URL = 'libri';
		const TABLE = document.getElementById('tabella')
		fetch(URL)
			.then(libri => libri.json())
			.then(libri => {
				for(libro of libri)
				{
					const RIGA  = document.createElement('tr');
					const Cell1 = document.createELement('td');
					const Cell2 = documnet.createElement('td');
					Cell1.textContent = libro.titolo
					Cell2.textContent = libro.autore
					RIGA.append(Cell1, Cell2)
					TABLE.append(RIGA)
				}
			})
	</script>
</body>

</html>