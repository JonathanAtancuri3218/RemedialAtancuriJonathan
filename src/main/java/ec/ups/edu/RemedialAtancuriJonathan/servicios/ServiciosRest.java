package ec.ups.edu.RemedialAtancuriJonathan.servicios;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.ups.edu.RemedialAtancuriJonathan.ON.LibroON;
import ec.ups.edu.RemedialAtancuriJonathan.modelo.Libro;
import ec.ups.edu.RemedialAtancuriJonathan.modelo.Respuesta;

@Path("/servicios")
public class ServiciosRest {
	
	
    @Inject
	private LibroON libroON;
	
	@GET
    @Path("/libros/")
    @Produces("application/json")
	//@Consumes("application/json")
    public List<Libro> obtenerLibro() throws Exception{
        return libroON.obtenerLibros();
    }
	    @POST
	    @Path("/guardar_libro")
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.APPLICATION_JSON)
	    public Respuesta guardarProducto(Libro libro) {
	        try{
	        	libroON.guardarLibro(libro);
	            return new Respuesta(200, "Producto Guardado");
	        }catch (Exception ex){
	            return new Respuesta(100, ex.getMessage());
	        }
	    }
}
