import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;
import java.io.IOException;
import java.util.List;

@WebServlet("/categorias")
public class CategoriaServlet extends HttpServlet {

    @EJB
    private CategoriaService categoriaService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        if ("listar".equals(accion)) {
            List<Categoria> categorias = categoriaService.listarCategorias();
            req.setAttribute("categorias", categorias);
            req.getRequestDispatcher("/WEB-INF/listarCategorias.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String descripcion = req.getParameter("descripcion");
        String fechaStr = req.getParameter("fechaCreacion");
        Categoria categoria = new Categoria();
        categoria.setNombre(nombre);
        categoria.setDescripcion(descripcion);
        categoria.setFechaCreacion(java.sql.Date.valueOf(fechaStr));
        categoriaService.agregarCategoria(categoria);
        resp.sendRedirect("categorias?accion=listar");
    }
}
