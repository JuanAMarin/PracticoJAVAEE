import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class CategoriaService {

    @Inject
    private CategoriaDAO categoriaDAO;

    public void agregarCategoria(Categoria categoria) {
        // Validación de regla de negocio
        if (categoria.getNombre() == null || categoria.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la categoría no puede estar vacío.");
        }
        categoriaDAO.agregarCategoria(categoria);
    }

    public Categoria obtenerCategoria(Long id) {
        return categoriaDAO.obtenerCategoria(id);
    }

    public List<Categoria> listarCategorias() {
        return categoriaDAO.listarCategorias();
    }
}
