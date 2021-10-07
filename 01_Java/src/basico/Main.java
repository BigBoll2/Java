package basico;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Ram ram = new Ram(134.00,4200, "32Gb","DDR4");
		Procesador procesor = new Procesador(479.99, 4.70, "AMD 7 5800x");
		TarjetaGrafica tg = new TarjetaGrafica(1399.99, "RTX", "12GB", "3080" );
		PlacaBase placabase= new PlacaBase(160.00, "MSI 570x", "AM4");
		
		
		
		

		Ordenador ordenador = new Ordenador("Alien", ram , procesor, tg, placabase);
		System.out.println(ordenador);
		
	}

}
