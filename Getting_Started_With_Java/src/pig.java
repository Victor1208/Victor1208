
public class pig  extends animal{
	public static int numflimbs = 4 ;
	public static String food = "oats";
	public static String name ="piggy";
	public String breed ;
	public pig (int age, String breed){
		super (age) ;
		this.breed= breed;
		
	}
public void makeSound(){
	System.out.println("Oink!");
	
}
public boolean isCute(){
	return (breed.toLowerCase()=="guinea");
}
}
