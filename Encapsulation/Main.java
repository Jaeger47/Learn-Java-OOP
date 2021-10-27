
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		members member = new members();
		
		//using function instead of declaration
		member.setName("Erza"); //setters
		//getting data from other class without declaration on the main class
		System.out.println(member.getName()); //getters
		member.setMagic("Requip");
		System.out.println(member.getMagic());
		
		member.setName("Byro Cracy");
		System.out.println(member.getName());
		member.setMagic("Nullification");
		System.out.println(member.getMagic());

	}

}
