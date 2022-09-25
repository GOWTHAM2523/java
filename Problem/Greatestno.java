import java.util.*;

class Greatestno
{
	public static void main(String args[])
	
	{
		Scanner ob = new Scanner (System.in);
		
		int a,b,c;
		
		System.out.println("Greatest Amoung Three Number");

		a=ob.nextInt();
		
		b=ob.nextInt();
		
		c=ob.nextInt();
		
		
		if(a>b && a>c)

			{
				System.out.println(" A is greatest");
			}

		else if(b>a && b>c)

			{
				System.out.println("B is greatest");
			}

		else if(c>a && c>a)

			{
				System.out.println("c is greatest");
			}

		else {
				System.out.println(" To Check Data");
			}
	}
}
	
		
		