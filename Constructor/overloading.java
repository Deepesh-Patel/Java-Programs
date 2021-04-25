class over
{
	over()        //default Constructor
	{
		System.out.println("Welcome to constructor");
	}
	over(int a, int b)         //parameterized constructor with integer values
	{
		System.out.println("a: "+a+ "\nb:"+b);
	}
	over(float a, float b)     //parameterized constructor with float values
	{
		System.out.println("a: "+a+ "\nb:"+b);
	}
	over(String a, String b)   //parameterized constructor with string values
	{
		System.out.println("a: "+a+ "\nb:"+b); 
	}
	over(double a, double b)   //parameterized constructor with double values
	{
		System.out.println("a: "+a+ "\nb:"+b); 
	}
	over(int a, float b, char c)       //parameterized constructor  with integer, float and char values
	{
		System.out.println("a: "+a+ "\nb:"+b+ "\nc:"+c);
	}
}
class overloading
{
	public static void main(String[] args) 
	{
		over obj = new over();
		over obj1 = new over(40,60);
		over obj2 = new over(45.6f,25.8f);
		over obj3 = new over("John","Chris");
		over obj4 = new over(1234567,234567);
		over obj5 = new over(456,15.8f,'q');
	}
}