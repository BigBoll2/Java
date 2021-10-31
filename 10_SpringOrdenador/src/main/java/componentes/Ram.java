package componentes;

public class Ram {
	private double precio;
	private double hz;
	private String gb;
	private String tipo;

	
	public Ram() {
		super();
	}

	public String getGb() {
		return gb;
	}

	public void setGb(String gb) {
		this.gb = gb;
	}

	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getHz() {
		return hz;
	}

	public void setHz(double hz) {
		this.hz = hz;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ram [precio=" + precio + ", hz=" + hz + " Gb = " + gb + ", tipo=" + tipo + "]";
	}

}
