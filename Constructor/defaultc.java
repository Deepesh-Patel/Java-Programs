class emp
{
	int id;
	String name;
	emp()         //default constructor
	{
		id = 12;
		name = "Chris";
	}
	void display()
	{
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
	}
}
class defaultc
{
	public static void main(String[] args) 
	{
		emp ep = new emp();
		ep.display();
	}
}
