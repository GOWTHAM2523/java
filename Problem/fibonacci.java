import java.util.*;
class fibonacci
{
	public static void main(String args[])
    {
	Scanner ob=new Scanner(System.in);
	
	int a,b,c,d,i;

	System.out.println(" Enter the numebr ");
	a=ob.nextInt();
	
	b=0;
	c=1;
	d=c+b;
	
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	for(i=0;i<a;i++)
	
	{
		b=c;
		c=d;
		d=c+b;
		System.out.println(d);
	}
  
}  }