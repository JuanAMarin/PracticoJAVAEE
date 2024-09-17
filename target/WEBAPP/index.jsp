<!DOCTYPE html>
<html>
<head>
    <title>Gestión de Categorías</title>
</head>
<body>
    <h1>Gestión de Categorías</h1>
    <form action="categorias" method="post">
        <input type="text" name="nombre" placeholder="Nombre" required />
        <textarea name="descripcion" placeholder="Descripción"></textarea>
        <input type="date" name="fechaCreacion" required />
        <button type="submit">Agregar Categoría</button>
    </form>
    <a href="categorias?accion=listar">Listar Categorías</a>
</body>
</html>