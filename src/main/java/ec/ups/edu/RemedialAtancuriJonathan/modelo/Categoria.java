package ec.ups.edu.RemedialAtancuriJonathan.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String tipo;
	private String Descripcion;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categoria [tipo=" + tipo + ", Descripcion=" + Descripcion + "]";
	}
	
	

}
