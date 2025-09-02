package day1;

public class Student {
	String StdName="Scott";
	int Regnum=101;
	String Branch="CSE";
public static void main(String[] args) {
	//creating the first object
	Student S1=new Student();
	System.out.println("Student Name : "+S1.StdName);
	System.out.println("Register Num : "+S1.Regnum);
	System.out.println("Branch :"+S1.Branch);
	//creating the second object
	Student S2=new Student();
	System.out.println("Student Name : "+S2.StdName);
	System.out.println("Register Num : "+S2.Regnum);
	System.out.println("Branch :"+S2.Branch);
	
}
}
