class addarray
{
	public static void main(String[] args) 
	{
		int a[] = {1,5};
		int b[] = {2,8};
		int i,c[] = new int[a.length];
		for(i=0;i<2;i++)
		{
			c[i] = a[i] + b[i];
			System.out.println("c => "+c[i]);
		}
	}
}