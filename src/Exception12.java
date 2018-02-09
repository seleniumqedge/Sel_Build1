import java.io.IOException;

public class Exception12 {

	public static void ff()
	{
		
	}
	
	public static void main(String[] args) {
		
		
		Exception12.ff(); 
		
		try 
		{
			System.out.println(100/0);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		finally 
		{
			System.out.println("TC DONE");
		}
		
		
	}

}
