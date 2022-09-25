import java.util.*;
class Studentmarksheet
{
	public static void main(String args[])
	{
	Scanner sa = new Scanner(System.in);
	int a,b,c,d,e;
	int sum;
	int avg;
	
	System.out.println("Enter HTML mark: ");
	a=sa.nextInt();
	System.out.println("Enter CSS mark: ");
	b=sa.nextInt();
	System.out.println("Enter JS mark: ");
	c=sa.nextInt();
	System.out.println("Enter JAVA mark: ");
	d=sa.nextInt();
	System.out.println("Enter Mysql mark: ");
	e=sa.nextInt();
	
	sum=a+b+c+d+e;
	System.out.println("Total :"+sum);

	avg=sum/5;
	System.out.println("Average :"+avg);
	
	if(avg>=85)
		{
			System.out.println("Distinction with 'O'");
		}
	else if(avg>=75)
		{
			System.out.println("A+");
		}
	else if(avg>=60)
		{
			System.out.println("A");
		}
	else if(avg>=50)
		{
			System.out.println("B+");
		}
	else if(avg>=50)
		{
			System.out.println("B+");
		}
	else if(avg>=40)
		{
			System.out.println("B");
		}
	else 
		{
			System.out.println("Not Pass The Exam");
		}
	}
	
}