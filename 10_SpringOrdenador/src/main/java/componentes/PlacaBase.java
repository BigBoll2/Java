package componentes;

public class PlacaBase {
	private double precio;
	private String marca;
	private String modelo;

	
	

	public PlacaBase() {
		super();
	}




	public double getPrecio() {
		return precio;
	}




	public String getMarca() {
		return marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	@Override
	public String toString() {
		return "PlacaBase [precio=" + precio + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
