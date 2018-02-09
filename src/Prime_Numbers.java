
public class Prime_Numbers {

	
	public static void main(String[] args) {
		
		int i;
		
		for(i=1;i<=100;i++)
		{
			int j;
		
			for(j=2;j<=i;j++)
			{
				if( i%j==0)
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.println(" "+i);
			}
		}
		
	}

}
