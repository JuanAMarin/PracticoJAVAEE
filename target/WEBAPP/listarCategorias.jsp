<!DOCTYPE html>
<html>
<head>
    <title>Listado de Categor�as</title>
</head>
<body>
    <h1>Listado de Categor�as</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Descripci�n</th>
                <th>Fecha de Creaci�n</th>
            </tr>
        </thead>
        <tbody>
            <% List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias"); %>
            <% for (Categoria categoria : categorias) { %>
                <tr>
                    <td><%= categoria.getId() %></td>
                    <td><%= categoria.getNombre() %></td>
                    <td><%= categoria.getDescripcion() %></td>
                    <td><%= categoria.getFechaCreacion() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
    <a href="index.jsp">Volver</a>
</body>
</html>
