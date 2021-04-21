import java.util.Scanner;
class palindrome
{
	public static void main(String[] args) 
	{
		int r, n, sum=0, temp;Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		n =s.nextInt();
		temp = n;
		while(n>0)
		{
			r = n%10;
			sum= (sum * 10)+r;
			n=n/10;
		}

		if(temp == sum)
		{
			System.out.println("The Number you entered is palindrome number.");
		}
		else
		{
			System.out.println("The Number you entered is not a palindrome number.");
		}
	}
}