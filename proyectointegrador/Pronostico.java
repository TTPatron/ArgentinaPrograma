package proyectointegrador;

public class Pronostico {
	private String nombre;
	private Partido resPart;
	private String ganador;
	
	public Pronostico() {
		
	}
	
	
	public Pronostico (Partido resPart, String ganador, String nombre) {
		this.nombre = nombre;
		this.resPart = resPart;
		this.ganador = ganador;
	}
	
	public Partido getResPart() {
		return resPart;
	}
	
	public String getGanador() {
		return ganador;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setResPart(Partido resPart) {
		this.resPart = resPart;
	}
	
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	
	public void setParticipante(String nombre) {
		this.nombre = nombre;
	}
	
	public String mostrarDatos() {
		String datos = nombre + "," + ganador + "\n";
		return datos;
	}
}
