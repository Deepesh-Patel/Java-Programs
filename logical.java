import java.util.Scanner;
class logical
{
	public static void main(String[] args) 
	{
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any values for a, b & c: ");
		a =s.nextInt();
		b =s.nextInt();
		c =s.nextInt();
		
		System.out.println("a>b && a>c: "+(a>b && a>c));
		System.out.println("b>a && b>c: "+(b>a && b>c));
		System.out.println("c>a && c>b: "+(c>a && c>b));
		System.out.println("a>b || a>c: "+(a>b || a>c));
		System.out.println("b>a || b>c: "+(b>a || b>c));
		System.out.println("c>a || c>b: "+(c>a || c>b));
	}
}