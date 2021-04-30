//Single Inheritance

import java.util.Scanner;
class emp
{
	int eid;
	int salary;
	String name;
}
class singlein extends emp
{
	int bonus;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		emp e = new emp();
		singlein ss = new singlein();
		
		System.out.println("Enter the employee name: ");
		e.name = s.nextLine();
		System.out.println("Enter the employee id: ");
		e.eid = s.nextInt();
		System.out.println("Enter employee salary: ");
		e.salary = s.nextInt();
		System.out.println("Enter employee bonus: ");
		ss.bonus = s.nextInt();
		System.out.println("\n");

		System.out.println("Employee id: "+e.eid+ "\nEmployee Name: "+e.name+ "\nEmployee Salary: "+e.salary+ "\nEmployee Bonus: "+ss.bonus);
	}
}
