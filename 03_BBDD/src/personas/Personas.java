package personas;

public class Personas {
private int id;
private String nombre;
private int edad;
public Personas(int id, String nombre, int edad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.edad = edad;
}
public int getId() {
	return id;
}
public String getNombre() {
	return nombre;
}
public int getEdad() {
	return edad;
}
public void setId(int id) {
	this.id = id;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	return "Personas [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
}





}
