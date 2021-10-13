package Base;

import java.util.Random;

import Personajes.Archero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Archero archer = new Archero("Bob", 20, 10);
		
		Archero archer2 = new Archero("Jhon", 20, 10);
		
		
		boolean ganado = false;
		while(ganado == false) {
			
			int vida= archer.getVida();
			int vida2 = archer2.getVida();
			int attack = archer.archeroAttack();
			while(vida > 0 && vida2 >0) {
				int ronda = (int) (Math.random()*2);
				System.out.println(ronda);
				if(ronda == 0) {
					vida2 -= attack;
					System.out.println(archer2.getNombre().toString() + " fue dañado " + attack + " su vida es de "+ vida2);
				}else {
					vida -= attack;
					System.out.println(archer.getNombre().toString() + " fue dañado " + attack + " su vida es de "+ vida);
				}
				if(vida <= 0) {
					System.out.println("El "+ archer2.getNombre().toString() + " ha ganado");
					ganado = true;
				}else if(vida2 <=0){
					System.out.println("El "+ archer.getNombre().toString() + " ha ganado");
					ganado = true;
				}
			}
			
		}
		
		

	}

}
