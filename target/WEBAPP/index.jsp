<!DOCTYPE html>
<html>
<head>
    <title>Gesti�n de Categor�as</title>
</head>
<body>
    <h1>Gesti�n de Categor�as</h1>
    <form action="categorias" method="post">
        <input type="text" name="nombre" placeholder="Nombre" required />
        <textarea name="descripcion" placeholder="Descripci�n"></textarea>
        <input type="date" name="fechaCreacion" required />
        <button type="submit">Agregar Categor�a</button>
    </form>
    <a href="categorias?accion=listar">Listar Categor�as</a>
</body>
</html>