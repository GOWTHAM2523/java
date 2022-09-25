import java.util.*;
class strikerate 

{
	public static void main(String args[])
	
	{
		Scanner ob = new Scanner (System.in);
		
		int a,b; // a is runs b balls
		String n;
		int c;
	
		System.out.println( "Enter the player Name");

		n=ob.nextLine();

		System.out.println( "Runs");

		a=ob.nextInt();

		System.out.println( "boll");

		b=ob.nextInt();
	
		c=(a+b)/100;

		System.out.println( "Strikerate:"+c);

	}
}

