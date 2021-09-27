import java.util.Scanner;

public class jav_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lastName, firstName;
		
		Scanner myScan = new Scanner(System.in);
		
		
		System.out.print("Enter your Last name: ");
		lastName = myScan.nextLine();
		
		System.out.print("Enter your First name: ");
		firstName = myScan.nextLine();
		
		//using + Operator
		System.out.println("Using + Operator: " + lastName+firstName);
		
		//using concat() method
		System.out.println("using concat method: " + lastName.concat(firstName));
		
		//using format() method
		System.out.println("using format method: " + String.format("%s%s",lastName,firstName));
		
		//using StringBuilder Class
		StringBuilder newLastName = new StringBuilder(lastName);
		StringBuilder newFirstName = new StringBuilder(firstName);
		System.out.println("using StringBuilder Class: " + newLastName.append(newFirstName));
		
	}

}
