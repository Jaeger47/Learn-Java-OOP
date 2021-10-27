class Spells {
	
	public void cast() {
		System.out.println("They are Lina Inverse's Inverse Spells");
		
	}
}

class LagunaBlade extends Spells {
	
	public void desc() {
	System.out.println("\nLaguna Blade or Ragna Blade is one of Lina's strongest \nspell, it's so powerful it"
			+ "can cut through the Astral Plane \nand can even cut gods themselves\n");
	
	}

}

class GigaSlave extends Spells{
	public void desc() {
		System.out.println("\nGiga Slave is Lina's powerful spell, which she summons the \nlord of Nightmares"
				+ "The Creator of everything, The Omniscient, The Source\n");
			
		}
	}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LagunaBlade laguna = new LagunaBlade();
		GigaSlave slave = new GigaSlave();
		
		laguna.cast();
		slave.cast();
		
		laguna.desc();
		slave.desc();
		

	}

}
