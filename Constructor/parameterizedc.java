class stud
{
	int id;
	String name;
	stud(int i, String s)    //parameterized constructor
	{
		id = i;
		name = s;
	}
	void display()
	{
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
	}
}
class parameterizedc
{
	public static void main(String[] args) 
	{
		stud s = new stud(16,"George");
		s.display();
	}
}