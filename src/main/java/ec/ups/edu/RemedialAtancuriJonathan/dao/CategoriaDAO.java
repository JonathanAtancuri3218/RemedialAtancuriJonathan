package ec.ups.edu.RemedialAtancuriJonathan.dao;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.RemedialAtancuriJonathan.modelo.Autor;
import ec.ups.edu.RemedialAtancuriJonathan.modelo.Categoria;

@Stateless
public class CategoriaDAO {

	@Inject
	private EntityManager em;

	public boolean insert(Categoria categoria) throws SQLException {
		em.persist(categoria);
		
		return true;
	}
	public boolean update(Categoria categoria) throws SQLException {
		em.merge(categoria);
		return true;
	}
	public Categoria read(int id){
		Categoria cliente=em.find(Categoria.class, id);
		return cliente;
	}
	public boolean delete(int id) throws SQLException {
		Autor cliente= this.read(id);
		em.remove(cliente);
		return true;

	}
	public List<Autor> getAutor(){
		String jpql="SELECT c FROM Categoria c WHERE tipo=?1";
		
		Query q= em.createQuery(jpql, Autor.class);
		q.setParameter(1,1);

		return (List<Autor>)q.getResultList();
		
	}

}
