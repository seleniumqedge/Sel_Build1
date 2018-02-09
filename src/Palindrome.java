
public class Palindrome {

	public static void main(String[] args) {
		
		String str="Madam";
		String reverse="";
	
		System.out.println(str.length());
		
		for (int i = str.length()-1; i >= 0; i--) 
		{
			reverse= reverse+ str.charAt(i);
		}
		
		System.out.println(reverse);
		
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println("given string is PALINDROME");
		}
		else
		{
			System.out.println("given string is not PALINDROME");
		}
		
		
	}

}









