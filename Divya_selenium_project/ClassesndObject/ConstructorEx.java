package ClassesndObject;

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorEx Obj=new ConstructorEx();
		ConstructorEx Obj1=new ConstructorEx(9,18);
		ConstructorEx Obj2=new ConstructorEx("Divya");
		Obj.test();
		
		
		
	}
	
	public void test()
	{
		System.out.println("test");
	}
	
	public ConstructorEx()
	{
		System.out.println("Constructor");
	}
	
	public ConstructorEx(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public ConstructorEx(String name)
	{
		System.out.println(name);
	}
}
