package ec.ups.edu.RemedialAtancuriJonathan.dao;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.RemedialAtancuriJonathan.modelo.Autor;


@Stateless
public class AutorDAO {
	
	@Inject
	private EntityManager em;

	public boolean insert(Autor autor) throws SQLException {
		em.persist(autor);
		
		return true;
	}
	public boolean update(Autor autor) throws SQLException {
		em.merge(autor);
		return true;
	}
	public Autor read(int id){
		Autor cliente=em.find(Autor.class, id);
		return cliente;
	}
	public boolean delete(int id) throws SQLException {
		Autor cliente= this.read(id);
		em.remove(cliente);
		return true;

	}
	public List<Autor> getClientes(){
		String jpql="SELECT c FROM Autor c WHERE tipo=?1";
		
		Query q= em.createQuery(jpql, Autor.class);
		q.setParameter(1,1);

		return (List<Autor>)q.getResultList();
		
	}

}
