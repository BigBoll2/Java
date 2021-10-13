package hilos;

import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilos {
	
	private static class Bomba {

        boolean desactivada = false;
        boolean detonada = false;
        int codigo;

        public Bomba(int codigo) {
            this.codigo = codigo;
        }

        public boolean desarmar(int codigoDeprueba) {
            if (codigo == codigoDeprueba) {
                desactivada = true;
                return true;
            }
            return false;
        }
    }

	public static void main(String[] args) {
		 Bomba bomba = new Bomba(362);
	        Scanner sc = new Scanner(System.in);

	        Thread hilo1 = new Thread() {
	            public void run() {
	                for (int i = 10; i >= 0; i--) {
	                    if (bomba.desactivada == true) {
	                        break;
	                    }
	                    System.out.println("Quedan " + i + " segundos");
	                    try {
	                        Thread.sleep(1000);
	                    } catch (InterruptedException ex) {
	                        Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
	                    }
	                }
	                if (!bomba.desactivada) {
	                    bomba.detonada = true;
	                    System.out.println("BOOOM");
	                    System.exit(0);
	                } else {

	                }

	            }
	        };
	        hilo1.start();

	        System.out.println("Lo que sea");
	        Thread hilo2 = new Thread() {
	            public void run() {
	                
	                while (!bomba.desactivada && !bomba.detonada) {
	                    int num;
	                    num = sc.nextInt();

	                    if (bomba.desarmar(num)) {
	                        System.out.println("Desarmada con exito");
	                        break;
	                    } else {
	                        System.out.println("Sigue intentandolo");
	                    }

	                }

	            }
	        };
	        hilo2.start();


	}

}
