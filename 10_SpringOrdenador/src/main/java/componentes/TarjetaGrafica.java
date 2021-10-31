package componentes;

public class TarjetaGrafica {
	private double precio;
	private String marca;
	private Ram ram;
	private String modelo;

	


	public TarjetaGrafica() {
		super();
	}




	public double getPrecio() {
		return precio;
	}




	public String getMarca() {
		return marca;
	}




	public Ram getRam() {
		return ram;
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




	public void setRam(Ram ram) {
		this.ram = ram;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	@Override
	public String toString() {
		return "TarjetaGrafica [precios=" + precio + ", marca=" + marca + ", ram=" + ram + ", modelo=" + modelo + "]";
	}

}
