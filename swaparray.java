class swaparray
{
	public static void main(String[] args) 
	{
		int a[] = {20,40};
		int b[] = {60,80};
		int c[] = new int[2], i;
		
		System.out.println("Before Swapping arrays =>");
		for(i = 0; i < a.length; i++)
		{										
			System.out.println("a: "+a[i]);
						
		}
		for(i = 0; i < b.length; i++)
		{
			System.out.println("b: "+b[i]);	
		}
		
		System.out.println("After Swapping arrays =>");
		for(i = 0; i < a.length; i++)
		{
			c[i] = a[i];
			a[i] = b[i];
			b[i] = c[i];

			System.out.println("a: "+a[i]);
		}
		for(i = 0; i < b.length; i++)
		{
			System.out.println("b: "+b[i]);
		}
	}
}