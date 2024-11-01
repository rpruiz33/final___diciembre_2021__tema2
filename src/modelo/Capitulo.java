package modelo;

public class Capitulo {
private String capitulo;
private int nroCapitulo ;
private int duraciion;
public String getCapitulo() {
	return capitulo;
}
public void setCapitulo(String capitulo) {
	this.capitulo = capitulo;
}
public int getNroCapitulo() {
	return nroCapitulo;
}
public void setNroCapitulo(int nroCapitulo) {
	this.nroCapitulo = nroCapitulo;
}
public int getDuraciion() {
	return duraciion;
}
public void setDuraciion(int duraciion) {
	this.duraciion = duraciion;
}
public Capitulo(String capitulo, int nroCapitulo, int duraciion) {
	super();
	this.capitulo = capitulo;
	this.nroCapitulo = nroCapitulo;
	this.duraciion = duraciion;
}
@Override
public String toString() {
	return "\nCapitulo [capitulo=" + capitulo + ", nroCapitulo=" + nroCapitulo + ", duraciion=" + duraciion + "]";
}





}
