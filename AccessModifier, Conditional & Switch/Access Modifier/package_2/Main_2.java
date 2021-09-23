package package_2;

import package_1.access_1; //importing the package and class to gain access

public class Main_2 extends access_1{//give this class a inheritance of access_1 class from other package

	public static void main(String[] args) {
		
		//create an object itself, so we can access the inherited members from access_1 class
		Main_2 myObj = new Main_2();
		
		//printing from the create "myObj" object
		System.out.println(myObj.hours); 
		System.out.println(myObj.min);
		

	}

}
