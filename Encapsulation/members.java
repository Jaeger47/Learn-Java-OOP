
public class members {
	
	//make variables private, other classes can't access the data inside this class
	
	/*with the use of getters and setters we can transfer data from hidden
	 variables to other classes without changing the access modifiers.
    */
	
	private String name;
	private String magic;
	
	//setter
	public void setName(String name) {
		this.name = "Mage name: "+name;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public void setMagic(String magic) {
		this.magic = "Magic: "+magic;
	}
	
	public String getMagic() {
		return this.magic;
	}
	

}
