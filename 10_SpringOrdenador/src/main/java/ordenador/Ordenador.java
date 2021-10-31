package ordenador;




import componentes.PlacaBase;
import componentes.Procesador;
import componentes.Ram;
import componentes.TarjetaGrafica;

public class Ordenador {

	double precio;
	String marca;
	Ram listaRam;
	Procesador procesador;
	TarjetaGrafica tg;
	PlacaBase placabase;





	

	public Ordenador() {
		super();
	}

	public double getPrecio() {
		return precio;
	}

	public String getMarca() {
		return marca;
	}

	public Ram getListaRam() {
		return listaRam;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public TarjetaGrafica getTg() {
		return tg;
	}

	public PlacaBase getPlacabase() {
		return placabase;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setListaRam(Ram listaRam) {
		this.listaRam = listaRam;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public void setTg(TarjetaGrafica tg) {
		this.tg = tg;
	}

	public void setPlacabase(PlacaBase placabase) {
		this.placabase = placabase;
	}

	public double sumaTotal() {
		double suma;
		double sumaRam = 0;
		double sumaPB = 0;
		double sumaGPU = 0;
		double sumpaCPU = 0;

		sumaRam += listaRam.getPrecio();
		sumaPB += placabase.getPrecio();
		sumaGPU += tg.getPrecio();
		sumpaCPU += procesador.getPrecio();

		suma = sumaRam + sumaPB + sumaGPU + sumpaCPU;
		return suma;

	}

	@Override
	public String toString() {
		return "Ordenador [ Marca=" + marca + ", Memoria Ram= " + listaRam.getGb() + ", Procesador="
				+ procesador.getMarca() + " "+ procesador.getHz() + ", Tarjeta Grafica=" + tg.getMarca() +" "+tg.getModelo() + ", Placabase=" + placabase.getMarca()+" "+ placabase.getModelo() + ", Precio= " + sumaTotal() +  "€]";

	}

}
