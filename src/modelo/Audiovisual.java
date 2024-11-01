package modelo;

public class Audiovisual {
protected String codAudiovisual;
protected String titulo;
protected int anio;
protected boolean estreno;
protected String genero;

public String getCodAudiovisual() {
	return codAudiovisual;
}


    public  void setCodAudiovisual(String codAudiovisual) throws Exception{
        if (codAudiovisual.length() != 7) {
            throw new IllegalArgumentException("El código audiovisual debe tener 7 dígitos");
        }

        int digitoVerificadorCalculado = calcularDigitoVerificador(codAudiovisual);
        int digitoVerificadorReal = Character.getNumericValue(codAudiovisual.charAt(6)); 

        if (digitoVerificadorCalculado != digitoVerificadorReal) {
            throw new Exception("El dígito verificador no coincide");
        }
        this.codAudiovisual=codAudiovisual;

    }

    private  int calcularDigitoVerificador(String codAudiovisual) {
        int sumaImpares = 0;
        int sumaPares = 0;

        for (int i = 0; i < 6; i++) { 
            int digito = Character.getNumericValue(codAudiovisual.charAt(i));
            if (i % 2 == 0) { 
                sumaImpares += digito;
            } else { 
                sumaPares += digito;
            }
        }

        sumaImpares *= 3;
        int totalSuma = sumaImpares + sumaPares;

        int digitoVerificador = (10 - (totalSuma % 10)) % 10;

        return digitoVerificador;
    }

   


public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getAnio() {
	return anio;
}
public void setAnio(int anio) {
	this.anio = anio;
}
public boolean isEstreno() {
	return estreno;
}
public void setEstreno(boolean estreno) {
	this.estreno = estreno;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public Audiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero) throws Exception {
	super();
	setCodAudiovisual(codAudiovisual);
	this.titulo = titulo;
	this.anio = anio;
	this.estreno = estreno;
	this.genero = genero;
}
@Override
public String toString() {
	return "\nAudiovisual [codAudiovisual=" + codAudiovisual + ", titulo=" + titulo + ", anio=" + anio + ", estreno="
			+ estreno + ", genero=" + genero + "]";
}



}
