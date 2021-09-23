package package_1;

public class Main_1 {
	//putting static on a global variable will make the variable accessible to the whole class
	static int global = 300; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access_1 myObj = new access_1(); //create an object for access_1 class to access it's members
		
		//printing members of access_1 class from the create "myObj" Object
		System.out.println(myObj.hours);
		System.out.println(myObj.min);
		System.out.println(myObj.num1);
		System.out.println(myObj.num2);
		
		//printing a global variable
		System.out.println(global); 
		

	}

}
