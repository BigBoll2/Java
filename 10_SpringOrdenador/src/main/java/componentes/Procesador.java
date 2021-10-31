package componentes;

public class Procesador {
	private double precio;
	private double hz;
	private String marca;



	
	public Procesador() {
		super();
	}




	public double getPrecio() {
		return precio;
	}




	public double getHz() {
		return hz;
	}




	public String getMarca() {
		return marca;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public void setHz(double hz) {
		this.hz = hz;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	@Override
	public String toString() {
		return "Procesador [precio=" + precio + ", hz=" + hz + ", marca=" + marca + "]";
	}

}
