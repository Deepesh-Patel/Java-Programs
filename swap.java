class swap
{
	public static void main(String[] args) 
	{
		int a = 20, b = 40;
		int temp ;
		System.out.println("Before Swapping => \n");
		System.out.println("\n a: "+a +"\n b: "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping => \n" );
		System.out.println("\n a: "+a +"\n b: "+b);
	}
}