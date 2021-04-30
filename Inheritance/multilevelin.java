//Multilevel Inheritance

import java.util.Scanner;
class stud
{
	int roll;
	String name;
	int m1,m2,m3;
	float avg;
}
class stud1 extends stud
{
	Scanner s = new Scanner(System.in);
	stud ss = new stud();

	void get()
	{
		System.out.println("Enter Student name: ");
		ss.name = s.nextLine();
		System.out.println("Enter Student Roll no: ");
		ss.roll = s.nextInt();
		System.out.println("Enter Three subject marks for m1, m2 & m3: ");
		ss.m1= s.nextInt();
		ss.m2= s.nextInt();
		ss.m3= s.nextInt();
		System.out.println("\n");
	}
	void put()
	{
		System.out.println("Student Roll no: "+ss.roll);
        System.out.println("Student Name: "+ss.name);
        System.out.println("Marks of Three subject=> ");
        System.out.println("m1: "+ss.m1+ "\nm2: "+ss.m2+ "\nm3: "+ss.m3);
        ss.avg = (ss.m1+ss.m2+ss.m3)/3;
        System.out.println("Average marks of three subjects: "+ss.avg);
	}	
}
class multilevelin extends stud1
{
	public static void main(String[] args) 
	{
		stud1 s1 = new stud1();
        s1.get();
        s1.put();
	}
}