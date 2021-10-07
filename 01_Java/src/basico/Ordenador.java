package basico;

import java.util.List;

public class Ordenador {

	double precio;
	String marca;
	Ram listaRam;
	Procesador procesador;
	TarjetaGrafica tg;
	PlacaBase placabase;

	public Ordenador(String marca, Ram ram, Procesador procesador, TarjetaGrafica tg, PlacaBase placabase) {
		super();
		this.precio = precio;
		this.marca = marca;
		this.listaRam = (Ram) ram;
		this.procesador = procesador;
		this.tg = tg;
		this.placabase = placabase;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Ram> getListaRam() {
		return (List<Ram>) listaRam;
	}

	public void setListaRam(List<Ram> listaRam) {
		this.listaRam = (Ram) listaRam;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public TarjetaGrafica getTg() {
		return tg;
	}

	public void setTg(TarjetaGrafica tg) {
		this.tg = tg;
	}

	public PlacaBase getPlacabase() {
		return placabase;
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
		sumaGPU += tg.getPrecios();
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
