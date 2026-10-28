package ClassesndObject;

public class StudentDetails {
	
	int rollno;
	String fname;
	static String clgname="B.N.Bandodkar college";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StudentDetails Obj=new StudentDetails(101,"Divya");
	StudentDetails Obj1=new StudentDetails(102,"Hiteesha");
	Obj.display();
	Obj1.display();

	}
	
	
	public StudentDetails(int r,String f)
	{
		rollno=r;
		fname=f;
	}
	public void display()
	{
		System.out.println("Student roll no: "+rollno);
		System.out.println("Student name: "+fname);
		System.out.println("Student college name: "+clgname);
	}
	

}
