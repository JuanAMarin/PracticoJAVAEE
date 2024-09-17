import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Singleton
public class CategoriaDAO {

    @PersistenceContext
    private EntityManager em;

    public void agregarCategoria(Categoria categoria) {
        em.persist(categoria);
    }

    public Categoria obtenerCategoria(Long id) {
        return em.find(Categoria.class, id);
    }

    public List<Categoria> listarCategorias() {
        return em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
    }
}
