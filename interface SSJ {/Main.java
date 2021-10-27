interface SSJ { //outline of the class inside the main function;
	String name = "Goku";
	void transform(boolean rage, int power);
}


public class Main implements SSJ{
	public static void main(String[] args) {
		System.out.println(name + " is ");
		
		Main ssj = new Main();
		ssj.transform(false,160);
	}
	
	public void transform(boolean rage, int power) {
		if(rage == true && power >= 150) {
			System.out.println("Currently on SSJ form");
		}
		else {
			System.out.println("Currently on Base form");
		}
	}

}
