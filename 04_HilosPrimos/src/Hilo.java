
public class Hilo implements Runnable {
	private int num;

	

	public Hilo(int num) {
		super();
		this.num = num;
	}



	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());

		
		boolean primo = false;
		
	
			if (num % 2 == 0)
				primo = true;
			
		

		if (primo == true) {
			System.out.println("El numero " + num + " es primo");
		} else {
			System.out.println("El numero " + num + " no es primo");
		}

	
	}
	
}
