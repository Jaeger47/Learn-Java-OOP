
public class Employee {
	
	public String Emp_name;
	public char Emp_sex;
	
	//constructor without an parameters
	Employee()
	{
		System.out.println("Employee Constructor");
	}
	
	//constructor with parameters
	Employee(String Emp_name, char Emp_sex)
	{
		this.Emp_name = Emp_name;
		this.Emp_sex = Emp_sex;
	}

}
