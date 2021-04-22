class emp
{
	int id;
 	String name;
 	long salary;
}
class emp1
{
	public static void main(String[] args) 
	{
		emp e = new emp();
		emp e1 = new emp();
		e.id = 12;
		e.name = "Michael";
		e.salary = 15000;
		e1.id = 15;
		e1.name = "John";
		e1.salary = 25000;

		System.out.println("Employee ID: "+e.id);
		System.out.println("Employee Name: "+e.name);
		System.out.println("Employee salary: "+e.salary);
		System.out.println("Employee ID: "+e1.id);
		System.out.println("Employee name: "+e1.name);
		System.out.println("Employee salary: "+e1.salary);
	}
}
