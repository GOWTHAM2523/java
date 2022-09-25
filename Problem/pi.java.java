import java.util.*;
class pi
	{
		public static void main(String[] args)
		{
			Scanner ob = new Scanner(System.in);
			double pi=3.14;
			double r;
			double area;
			System.out.println("Enter radius:");
			r=ob.nextInt();
			area=pi*r*r;
			System.out.println("Area of circle:"+area);
		}
	}
		
			
			