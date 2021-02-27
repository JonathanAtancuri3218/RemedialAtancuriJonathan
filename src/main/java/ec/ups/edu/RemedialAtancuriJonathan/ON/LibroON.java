package ec.ups.edu.RemedialAtancuriJonathan.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.RemedialAtancuriJonathan.dao.CategoriaDAO;
import ec.ups.edu.RemedialAtancuriJonathan.dao.LibroDAO;
import ec.ups.edu.RemedialAtancuriJonathan.modelo.Libro;

@Stateless
public class LibroON {
	
	@Inject
	private LibroDAO libroDAO;
	
	@Inject
	private CategoriaDAO categoriaDAO;
	
	public void guardarLibro(Libro libro) throws Exception {
		libroDAO.guardarLibro(libro);
    }
	
	
	public List<Libro> obtenerLibros() throws Exception {
        return libroDAO.getLibro();
    }


}
