
abstract class Esper { //abstract 
	public void desc() {
		System.out.println("An esper is an individual who uses "
				+ "scientifically based supernatural powers and emits AIM. ");
	}
	
	public abstract void users(String names[]);
}

class Electro extends Esper{
	
	public void users(String names[]) {
		System.out.println("\n[Known Users of Electro Master]");
		for(int i=0;i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}

class Teleport extends Esper{
	public void users(String names[]) {
		
		System.out.println("\n[Known Users of Teleport]");
		for(int i=0;i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String users_e[] = {"Misaka","Last Orde","Dolly","Misaka Worst"}; 
		String users_t[] = {"Shirai","Musujime", "Saraku"};
		
		Electro ElectroObj = new Electro();
		Teleport TeleObj = new Teleport ();
		
		ElectroObj.desc();
		TeleObj.desc();
		
		ElectroObj.users(users_e);
		TeleObj.users(users_t);
		
	}

}
