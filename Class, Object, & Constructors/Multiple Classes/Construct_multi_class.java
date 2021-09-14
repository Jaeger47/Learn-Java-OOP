
public class Construct_multi_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee EmpObj = new Employee();
		Employee EmpObj1 = new Employee("Dacer Mark", 'M'); //create object from the constructor
		Employee EmpObj2 = new Employee("Caitlyn Myers", 'F');
		
		//printing object members
		System.out.println(EmpObj1.Emp_name);
		System.out.println(EmpObj1.Emp_sex);
		
		System.out.println(EmpObj2.Emp_name);
		System.out.println(EmpObj2.Emp_sex);

	}

}
