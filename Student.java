package day2;

public class Student {
	// Declaration of states
	String StdName;
	int RegNum;
	String Branch;
	double percentage;
	public static void main(String[] args) {
	Student S1=new Student();
	S1.StdName="Scott";
	S1.RegNum=1001;
	S1.Branch="CSE";
	S1.percentage=89.9;
	System.out.println("Student Name :"+S1.StdName);
	System.out.println(" Register Number :"+S1.RegNum);
	System.out.println("Branch :"+S1.Branch);
	System.out.println("percentage :"+S1.percentage);
	Student S2=new Student();
	S2.StdName="Siri";
	S2.RegNum=1234;
	S2.Branch="CSD";
	S2.percentage=90.9;
	System.out.println("Student Name :" +S2.StdName);
	System.out.println("Register Number :" +S2.RegNum);
	System.out.println("Branch :" +S2.Branch);
	System.out.println("percentage :" +S2.percentage);
	

}
}
