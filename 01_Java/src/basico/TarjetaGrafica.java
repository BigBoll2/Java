package basico;

public class TarjetaGrafica {
	double precios;
	String marca;
	String ram;
	String modelo;

	public TarjetaGrafica(double precios, String marca, String ram, String modelo) {
		super();
		this.precios = precios;
		this.marca = marca;
		this.ram = ram;
		this.modelo = modelo;
	}

	public double getPrecios() {
		return precios;
	}

	public void setPrecios(double precios) {
		this.precios = precios;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [precios=" + precios + ", marca=" + marca + ", ram=" + ram + ", modelo=" + modelo + "]";
	}

}
