package clases;

public class Motor {
private int caballos;
private int potencia;
public Motor(int caballos, int potencia) {
	super();
	this.caballos = caballos;
	this.potencia = potencia;
}
public int getCaballos() {
	return caballos;
}
public int getPotencia() {
	return potencia;
}
public void setCaballos(int caballos) {
	this.caballos = caballos;
}
public void setPotencia(int potencia) {
	this.potencia = potencia;
}
@Override
public String toString() {
	return "Motor [caballos=" + caballos + ", potencia=" + potencia + "]";
}





}
