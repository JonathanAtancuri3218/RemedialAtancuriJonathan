package ec.ups.edu.RemedialAtancuriJonathan.modelo;

public class Respuesta {

	private int id;
	private String mensaje;
	

	public Respuesta() {
	}
	public Respuesta(int id, String mensaje) {
		
		this.id = id;
        this.mensaje = mensaje;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "Mensajes [id=" + id + ", mensaje=" + mensaje + "]";
	}
	
	
}
