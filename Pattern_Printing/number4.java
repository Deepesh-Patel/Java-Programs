import java.util.Scanner;
class number4
{
	public static void main(String[] args) 
	{
		int i, j, rows;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		rows = s.nextInt();
		for(i=rows; i>=1; i--)
		{
			for(j=rows; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}