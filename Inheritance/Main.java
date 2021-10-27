
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dogs dogObj = new Dogs();
		//Cats catObj = new Cats();
		
		Shop ShopObj = new Shop();
		
		//We can use Shop class to access dogs class
		for(int i = 0; i < ShopObj.dogs.length;i++) {
		System.out.println(ShopObj.dogs[i]);
		}
		
		ShopObj.sound(); //using shop to class a method from dogs
		ShopObj.call();
		
		

	}

}
