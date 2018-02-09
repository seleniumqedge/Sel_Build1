
public class String_Split {

	public static void main(String[] args) {
		
		String str="one,two,four,six,nine";
		
		String s[]=str.split(",");
		
		int rc= s.length;
		System.out.println(rc);
		
		for (int i = 0; i < rc; i++) 
		{
			if (s[i].equalsIgnoreCase("six")) 
			{
				System.out.println(s[i]);
				break;
			}
			
		}

	}

}
