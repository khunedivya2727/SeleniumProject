package InheritanceEx;

public class RunInheritanceEx extends FirstInheritanceEx{
	
	public void run()
	{
		System.out.println("run method");
	}	
	public static void main(String[] args) {
		
		RunInheritanceEx objEx=new RunInheritanceEx();
		objEx.firstclass();
		System.out.println(objEx.a=10);
		objEx.run();
		
	}

}
