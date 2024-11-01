package test;

import modelo.Capitulo;
import modelo.Pelicula;
import java.util.ArrayList;

import modelo.Serie;
import modelo.Sistema;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema=new Sistema();
		try {
			System.out.println((sistema.agregarAudiovisual("7389189", "TODOS TENEMOS UN MUERTO", 2021, true,"COMODIA DRAMATICA", 103)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println((sistema.agregarAudiovisual("1732485","los simuladores", 2003, false,"DRAMA SOCIAL", true)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(sistema.agregarAudiovisual("3748916", "CORANADOS DE GLORIA", 2019, false, "DOCUMENTAL",false));
			System.out.println((((Serie) sistema.traerAudioVisual("3748916")).agregarCapitulo("PRIMER TITULO",2,13)));
			System.out.println((((Serie) sistema.traerAudioVisual("3748916")).agregarCapitulo("LA GENESIS DE LA GENERACION DORADA",1,14)));
			System.out.println(sistema.agregarAudiovisual("4689735", "LUNA DE AVELLANEDA", 2004, false,"COMEDIA GRAMATICA", 139));
			System.out.println(sistema.agregarAudiovisual("7389182", "TODOS TENEMOS UN MUERTO", 2021, false,"COMEDIA GRAMATICA", 103));
			System.out.println(sistema.agregarAudiovisual("1732489", "LOS SIMULADORES", 2003, false, "DRAMA SOCIAL",true));
			System.out.println((((Serie) sistema.traerAudioVisual("1732489")).agregarCapitulo("Capitulo2",2,35)));
			System.out.println((((Serie) sistema.traerAudioVisual("1732489")).agregarCapitulo("Capitulo1",1,40)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sistema.getLstAudiovisual());
		System.out.println(sistema.traerAudioVisual("4689735"));
		System.out.println((((Pelicula)sistema.traerAudioVisual("4689735")).calcularDuracion()));
		System.out.println(sistema.traerAudioVisual("3748916"));
		System.out.println((((Serie)sistema.traerAudioVisual("3748916")).CalcularDuracion()));
		
	}

}
