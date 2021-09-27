
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var1 = 0;
		int var2 = 0;
		
		//using while statement
		while (var1 < 3) {
			System.out.println(var1 + ". Looping with while statement");
			++var1;
		};
		
		//using do while statement
		do {
			System.out.println(var2 + ". Looping with do while statement");
			++var2;
		}
		while (var2 < 3);
		
		//using for statement
		for(int var3 = 0; var3 < 3; ++var3) {
			System.out.println(var3 + ". Looping with for statement");
		}
		

	}

}
