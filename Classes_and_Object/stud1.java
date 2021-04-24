import java.util.Scanner;
class stud
{
	int rollno;
	String name;
	void insert(int i, String n)
	{
		rollno = i;
		name = n;
	}
	void display()
	{
		System.out.println("Roll no: "+rollno);
		System.out.println("Name: "+name);
	}
}
class stud1
{
	public static void main(String[] args) 
	{
		stud se = new stud();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name = s.nextLine();
		System.out.println("Enter thr Roll no:");
		int rollno = s.nextInt();
		se.insert(rollno, name);
		se.display();
	}
}