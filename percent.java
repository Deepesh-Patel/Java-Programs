import java.util.Scanner;
class percent
{
	public static void main(String[] args) 
	{
		int per;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your percentage: ");
		per = s.nextInt();
        if (per <= 45) 
        {
        	System.out.println("Fail");
        }
        else if(per > 45 && per < 50)
        {
        	System.out.println("Pass");
        }
        else if(per > 50 && per<65)
        {
        	System.out.println("Second Class");
        }
        else if(per > 65 && per < 75)
        {
        	System.out.println("First Class");
        }
        else if(per >= 75 && per <= 100)
        {
        	System.out.println("Distinction");
        }
        else
        {
        	System.out.println("Invalid input");
        }
	}
}