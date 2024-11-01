package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List <Audiovisual> lstAudiovisual;

public List<Audiovisual> getLstAudiovisual() {
	return lstAudiovisual;
}

public void setLstAudiovisual(List<Audiovisual> lstAudiovisual) {
	this.lstAudiovisual = lstAudiovisual;
}

public Sistema() {
	super();
	this.lstAudiovisual = new ArrayList<Audiovisual>();
}

public boolean agregarAudiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, int duracion) throws Exception {
	return lstAudiovisual.add(new Pelicula( codAudiovisual,  titulo, anio,  estreno,  genero,  duracion));

}

public boolean agregarAudiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, boolean capitulosUnitarios) throws Exception {
	return lstAudiovisual.add(new Serie(codAudiovisual,  titulo,  anio, estreno, genero,  capitulosUnitarios));
}

public Audiovisual traerAudioVisual ( String codAudiovisual) {
	Audiovisual a=null;
	int i=0;
	while(i<lstAudiovisual.size() && a==null ) {
		if(lstAudiovisual.get(i).getCodAudiovisual().equals(codAudiovisual)) {
			a=lstAudiovisual.get(i);
		}
		i++;
	}
	return a;
	
}

}



