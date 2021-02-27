package ec.ups.edu.RemedialAtancuriJonathan.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.RemedialAtancuriJonathan.modelo.Libro;

@Stateless
public class LibroDAO {


	@PersistenceContext
	private EntityManager em;

	 public void guardarLibro(Libro libro) throws Exception {
	        em.persist(libro);
	    }
	
	public int obtenerStockLibro(int codigoLibro) throws Exception {
        return em.createQuery("SELECT p.stock FROM Libro p WHERE p.codigo = :codigoLibro", Integer.class)
                .setParameter("codigoLibro", codigoLibro)
                .getSingleResult();
    }


    /**
     * Actualiza el stock del producto
     * @return
     * @throws Exception
     */
    public void actualizarStockLibro(int idLibro, int stock) throws Exception {
        em.createQuery("UPDATE Libro p SET p.stock = :stock WHERE p.codigo = :idLibro")
                .setParameter("idLibro", idLibro)
                .setParameter("stock", stock)
                .executeUpdate();
    }

	
    public List<Libro> getLibros(){
		String jpql="SELECT c FROM Libro c WHERE codigo=?1";
		
		Query q= em.createQuery(jpql, Libro.class);
		q.setParameter(1,1);

		return (List<Libro>)q.getResultList();
		
	}
}
