import java.util.Scanner;
public class arrayin 
{
	public static void main(String[] args) 
	{
		int n, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the required number of elements: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for(i=0; i<n; i++)
        {
        	a[i] = s.nextInt();
        }
         System.out.println("The array elements you have entered are: ");
        for(i=0; i<n; i++)
        {
        	System.out.println(a[i]);
        }
	}
}