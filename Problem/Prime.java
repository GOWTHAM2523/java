import java.util.*;

class Prime

	{
		public static void main(String args[])
		
		{
			
			Scanner pr = new Scanner (System.in);
			
			int n,i,K;
			
			K=0;
			
			System.out.println("Enter The Prime Number");
			
			n=pr.nextInt();
			
			for(i=1;i<=n;i++)
			
			{

				if(n%i==0)
				K++;
			}	
		
			if(K==2)
			
			{
				System.out.println(" The Given Number Is Prime Numer "+n);
	
			}

			else	
			
			{
	
			System.out.println(" The Given Number Is Prime Not Numer "+n);
			
			}
		}
	}
				