package modelo;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Audiovisual {
private boolean capitulosUnitarios;
private List <Capitulo> lstCapitulo;
public boolean isCapitulosUnitarios() {
	return capitulosUnitarios;
}
public void setCapitulosUnitarios(boolean capitulosUnitarios) {
	this.capitulosUnitarios = capitulosUnitarios;
}
public List<Capitulo> getLstCapitulo() {
	return lstCapitulo;
}
public void setLstCapitulo(List<Capitulo> lstCapitulo) {
	this.lstCapitulo = lstCapitulo;
}

public Serie(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, boolean capitulosUnitarios
		) throws Exception {
	super(codAudiovisual, titulo, anio, estreno, genero);
	this.capitulosUnitarios = capitulosUnitarios;
	this.lstCapitulo = new ArrayList <Capitulo>();
}



@Override
public String toString() {
	return 	"\n"+ this.getTitulo()+
			" Serie [capitulosUnitarios=" + capitulosUnitarios + ", lstCapitulo=" + lstCapitulo + ", codAudiovisual="
			+ codAudiovisual + ", titulo=" + titulo + ", anio=" + anio + ", estreno=" + estreno + ", genero=" + genero
			+ "]";
}
public boolean agregarCapitulo(String capitulo, int nroCapitulo, int duraciion){
	return lstCapitulo.add(new Capitulo (capitulo,  nroCapitulo,  duraciion));
	
	
}

public int CalcularDuracion() {
	int resul=0;
	for(int i=0;i<lstCapitulo.size();i++) {
		resul=resul+lstCapitulo.get(i).getDuraciion();
	}
	return resul;
}




}
