import java.util.Scanner;
class evenodd
{
	 public static void main(String[] args) 
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		n =s.nextInt();
		if(n%2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}