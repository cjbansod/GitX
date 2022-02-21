package other;

public class ExampleProject {

	public static void main(String[] args) {
		
		System.out.println("Hello There....!");
		
		System.out.println(getLengthOfString("This"));

	}

	
	public static int getLengthOfString(String s) 
	{
		
		int i=0;
		try 
		{
		for(i=0;;i++) 
		{
		   s.charAt(i);
		}
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		return i;
		
	}
	
}
