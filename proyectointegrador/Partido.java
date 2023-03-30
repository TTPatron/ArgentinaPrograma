package proyectointegrador;

public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEqui1;
	private int golesEqui2;
	
	
	public Partido (Equipo equipo1, Equipo equipo2, int golesEqui1, int golesEqui2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEqui1 = golesEqui1;
		this.golesEqui2 = golesEqui2;
	}
	
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	public void setGolesEqui1(int golesEqui1) {
		this.golesEqui1 = golesEqui1;
	}
	public void setGolesEqui2(int golesEqui2) {
		this.golesEqui2 = golesEqui2;
	}
	
	public Equipo getEquipo1() {
		return equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public int getGolesEqui1 () {
		return golesEqui1;
	}
	public int getGolesEqui2() {
		return golesEqui2;
	}
	
	public String Resultado() {
		String equipoGanador;
		if (golesEqui1 > golesEqui2) {
			equipoGanador = equipo1.getNombre();
		} else {
			equipoGanador = equipo2.getNombre();
		}
		System.out.print("El ganador del partido fue: " +equipoGanador +"\n");
		return equipoGanador;
	}

}
