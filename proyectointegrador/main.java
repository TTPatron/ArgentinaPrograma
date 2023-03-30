package proyectointegrador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import proyectointegrador.Equipo;
import proyectointegrador.Partido;
import proyectointegrador.Pronostico;


public class main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader lector;
		String ruta = "C:\\Users\\Tito\\Desktop\\Programacion\\Argentina programa\\yoprogramo\\workspace IDE\\Proyectoclase2\\src\\proyectointegrador\\resultado.txt";
		String[] partes;
		String linea;
		
		
		try {
			lector = new BufferedReader( new FileReader(ruta));
			Scanner leer= new Scanner(System.in);
			while ((linea=lector.readLine()) != null) {
				partes= linea.split(",");
				String nombreEquipo1 = partes[0];
				int golEquipo1 = Integer.parseInt(partes[1]);
				int golEquipo2 = Integer.parseInt(partes[2]);
				String nombreEquipo2 = partes[3];
				
				Equipo equipo1 = new Equipo(nombreEquipo1);
				Equipo equipo2 = new Equipo(nombreEquipo2);
				Partido partido1 = new Partido(equipo1,equipo2,golEquipo1,golEquipo2);
				
				System.out.println(nombreEquipo1+ " " + golEquipo1 + " - " + golEquipo2 + " " +nombreEquipo2);
				
				System.out.println("ingrese su nombre");
				String nombrePart = leer.nextLine();
				System.out.println("ingrese el nombre del equipo ganador");
				String equipoGanador = leer.nextLine();
				
				Pronostico primero = new Pronostico(partido1,equipoGanador,nombrePart);
				
			String pronosticostr="";
			pronosticostr = pronosticostr+ primero.mostrarDatos();
			System.out.println(pronosticostr);
			String[] pronostico;
			pronostico = pronosticostr.split(",");
			String persona1= pronostico[0];
			String ganadorpronostico= pronostico[1];
			String ganadorpartido = partido1.Resultado();
			int puntos=0;
			if (ganadorpartido.equals(ganadorpronostico)) {
				puntos= puntos +1;
			} else {
				System.out.println("No sumó puntos por su pronostico fallido");
			}
			System.out.println(persona1+ " - Puntos: " + puntos);
			
			}
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,e);
		}
		
	}

}
