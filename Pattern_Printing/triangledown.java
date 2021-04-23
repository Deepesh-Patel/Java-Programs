class triangledown
{
	public static void main(String[] args) 
	{
		int i, j, r = 6;
		for(i=r-1; i>=0; i--)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}