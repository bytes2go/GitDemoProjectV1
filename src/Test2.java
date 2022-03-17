
public class Test2 {

	public static void main(String[] arts) {
		
		String hungry = "yes";
		
		if (hungry == "yes" || hungry == "Yes" || hungry == "YES" || hungry == "Y" || hungry == "y") 
			System.out.println("eat something...");
		else {
			System.out.println("Do work.....");
		}
	}
}
