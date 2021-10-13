package Personajes;

import Armas.Arco;

public class Archero {
	String nombre;
	double dmg;
	int vida;
	int stamina;
	String clase = "Archero";
	Arco clas;

	public Archero(String nombre, int vida, int stamina) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.stamina = stamina;
	}

public int archeroAttack() {
	int dmg;
	if(clase == clas.getClas()) {
		dmg= (int) (Math.random()*4+1); 
	}else{
		dmg= (int) (Math.random()*2+1);
	}
	return dmg;
}

	public Archero(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public int getStamina() {
		return stamina;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

}
