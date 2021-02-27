package ec.ups.edu.RemedialAtancuriJonathan.servicios;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.ups.edu.RemedialAtancuriJonathan.ON.LibroON;
import ec.ups.edu.RemedialAtancuriJonathan.modelo.Libro;

@Path("/servicios")
public class ServiciosRest {
	
	
    @Inject
	private LibroON libroON;
	
	@GET
    @Path("/libros/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Libro> obtenerProductos() throws Exception{
        return libroON.obtenerLibros();
    }
}
