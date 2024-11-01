package modelo;

public class Pelicula extends Audiovisual {
private int duracion;

public int getDuracion() {
	return duracion;
}

public void setDuracion(int duracion) {
	this.duracion = duracion;
}

public Pelicula(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, int duracion) throws Exception {
	super(codAudiovisual, titulo, anio, estreno, genero);
	this.duracion = duracion;
}

@Override
public String toString() {
	return "\n"+ this.getTitulo()+" pelicula [duracion=" + duracion + ", codAudiovisual=" + codAudiovisual + ", titulo=" + titulo + ", anio="
			+ anio + ", estreno=" + estreno + ", genero=" + genero + "]";
}


public int calcularDuracion() {
	return this.getDuracion();
}


}
