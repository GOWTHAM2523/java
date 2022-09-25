import java.util.*;
class Rectangle
{
	public static void main(String args[])
	 {
		Scanner Rectangle = new Scanner(System.in);
		int l;
		int b;
		int p;
		System.out.println("Perimeter of a Rectangle Formula :");
		System.out.println("Length:");
		l=Rectangle.nextInt();
		System.out.println("Breadh:");
		b=Rectangle.nextInt();
		p=(l+b)*2;
		System.out.println("Out Put:"+p);
		
	}
}