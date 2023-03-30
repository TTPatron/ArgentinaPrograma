package proyectointegrador;

public class Equipo {
	//nombre y descripcion de los equipos
	private String nombre;
	private String descripcion; 
	
	// funcion para definir un equipo
	
	public Equipo (String nombre) {
		this.nombre = nombre;
	}
	public Equipo (String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	// definir nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//definir descripcion
	public void setDescripcion (String descripcion) {
		this.descripcion = descripcion;
	}
	//retornar nombre
	public String getNombre() {
		return nombre;
	}
	//retornar descripcion
	public String getDescription() {
		return descripcion;
	}
	

}
