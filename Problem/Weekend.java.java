class Weekend
{
	public static void main(String [] args)
	{

		Scanner sc = new Scanner(System.in)
		char c;

		System.out.println("Enter the any Character:");
		c = next();

		switch(c)
		{

			case 'm':
			case 'M':

					System.out.println("Monday");
					break;

			case 'T':
			case 't':

					System.out.println("Tuesday");
					break;


			case 'w':
			case 'W':

					System.out.println("Wednesday");
					break;

			case 'Th':
			case 'th':

					System.out.println("Thursday");
					break;

			case 'f':
			case 'F':

					System.out.println("Friday");
					break;

			case 'Sa':
			case 'sa':

					System.out.println("Saturday");
					break;

			case 'Su':
			case 'Su':

					System.out.println("Saturday");
					break;

			default:
					System.out.println("Enter only Characters);
		}
	}
}
					