package basico;

public class Ram {
	double precio;
	double hz;
	String gb;
	String tipo;

	public String getGb() {
		return gb;
	}

	public void setGb(String gb) {
		this.gb = gb;
	}

	public Ram(double precio, double hz, String gb, String tipo) {
		super();
		this.precio = precio;
		this.hz = hz;
		this.gb = gb;
		this.tipo = tipo;

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
