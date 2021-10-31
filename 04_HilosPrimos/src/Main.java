import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduzca 3 numeros para comprobar si son primos");
		System.out.println("Primer numero: ");
		int num1 = sc.nextInt();
		System.out.println("Segundo numero: ");
		int num2 = sc.nextInt();
		System.out.println("Tercero numero: ");
		int num3 = sc.nextInt();

		Hilo hilo1 = new Hilo(num1);
		Thread t1 = new Thread(hilo1, "Hilo1");

		Hilo hilo2 = new Hilo(num2);
		Thread t2 = new Thread(hilo2, "Hilo2");

		Hilo hilo3 = new Hilo(num3);
		Thread t3 = new Thread(hilo3, "Hilo3");

		t1.start();
		t2.start();
		t3.start();

	}

}
