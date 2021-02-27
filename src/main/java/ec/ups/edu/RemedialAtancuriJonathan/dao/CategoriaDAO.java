package ec.ups.edu.RemedialAtancuriJonathan.dao;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.RemedialAtancuriJonathan.modelo.Categoria;

@Stateless
public class CategoriaDAO {

	@PersistenceContext
	private EntityManager em;

	public boolean insert(Categoria categoria) throws SQLException {
		em.persist(categoria);
		
		return true;
	}
	public boolean update(Categoria categoria) throws SQLException {
		em.merge(categoria);
		return true;
	}
	public Categoria buscar(String tipo){
		return em.find(Categoria.class, tipo);
	}
	
	public List<Categoria> getCategoria(){
		String jpql="SELECT FROM Categoria c WHERE tipo=?1";
		
		Query q= em.createQuery(jpql, Categoria.class);
		q.setParameter(1,1);

		return (List<Categoria>)q.getResultList();
		
	}

}
