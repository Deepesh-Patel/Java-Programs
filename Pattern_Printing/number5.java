import java.util.Scanner;
class number5
{
	public static void main(String[] args) 
	{
		int i, j, n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		n = s.nextInt();
		for(i=1; i<=n; i++)
		{
			for(j=i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}