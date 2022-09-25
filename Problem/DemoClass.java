import java.util.*;
class A2
{
	public static void main(String arsg[])
	{
		Scanner sc = new Scanner(System.in);

		int i;
		int a[] = new int[5];

		System.out.println("Enter the Element:");

		for(i=0;i<5;i++)
		{
			a[i]= sc.nextInt();
		}

		System.out.println("Array Elements");

		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("To Access third element"+a[2]);
	}
}