import java.util.Scanner;
class arithmetic
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Emter any 2 number:");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("a+b :"+(a+b));
        System.out.println("a-b :"+(a-b));
        System.out.println("a*b :"+(a*b));
        System.out.println("a%b :"+(a%b));
	}
}