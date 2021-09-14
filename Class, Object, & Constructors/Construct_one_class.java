
public class  Construct_one_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dacer DacerObj1 = new Dacer(18, "Active");;//creating an object of Student  
		Dacer DacerObj2 = new Dacer(24, "AWOL");
		
		//Printing values of the objects  
		System.out.println(DacerObj1.num1);//accessing member through reference variable  
		System.out.println(DacerObj1.status);
		System.out.println(DacerObj2.num1);
		System.out.println(DacerObj2.status);

	}
	
	  //Defining a Dacer class.
     public static class Dacer{
    	//defining fields  
    	 public int num1;//field or data member or instance variable  
    	 public String status;
		
    	//constructor
		Dacer(int num1, String status)
		{
			this.num1 = num1;
			this.status = status;
			
		}
	}

}
