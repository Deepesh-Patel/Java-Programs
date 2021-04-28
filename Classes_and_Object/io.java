class outer     //outer class
{
	int rollno = 10;     //outer class variable
	String name = "Chris";

	class inner       //inner class
	{
		void get()     //inner class method
		{
			float avg = 78.96f;   //inner class variable
			System.out.println("roll no: "+rollno+ "\nname: "+name+ "\navg: "+avg);
		}
	}     
}
class io
{
	public static void main(String[] args) 
	{
		outer o = new outer();               //outer class object
		outer.inner i = o.new inner();       //inner class object
		i.get();                             //call inner class method
	}
}