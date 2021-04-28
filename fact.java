import java.util.Scanner;
class fact
{
	public static void main(String[] args) 
	{
		int f=1;
		int n;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to know its factorial:");
		n = s.nextInt();

		for(int i=1;i<=n;i++)
		{
			f = f*i;
		}

		System.out.println("The factorial of "+n+" is: "+f);
	}
}