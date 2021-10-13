package Personajes;

public class Monster {

	 private String name;
	    private int health;
	    private int damage;

	    public int getRandomDamage() {
	    	if() {
	   		 dmg= Math.random()*4+1; 
	   		
	   	 }else {
	   		 dmg= Math.random()*2+1; 
	   	 }
	        return (int)(Math.random() * 5 + 1);
	      }

	    
	    public Monster(String name, int health, int damage) {
	        this.name = "Monster";
	        this.health = 50;
	        this.damage = 2;
	    }
	    
	    public void Fight(Monster opponent) {
	        while (this.health > 0 && opponent.health > 0) {
	          opponent.health -= this.getRandomDamage();
	          this.health -= opponent.getRandomDamage();
	        }
	        if (opponent.health>this.health) {
	          System.out.println(this.name + " lost!");
	        } else {
	          System.out.println(opponent.name + " lost!");
	        }
	      } 
	
	
}
