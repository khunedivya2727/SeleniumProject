package Basicpgm;

public class ConditionalStmt {
	
	public static void main(String[] args)
	{
		//if stmt
		int a=10;
		if(a==10)  //true
		{
			System.out.println("a is equal");
		}
		
		if(a==20)   //false
		{
			System.out.println("a is not equal");
		}
		
		
		//if-else stmt
		int b=20;
		if(b==20)  //true
		{
			System.out.println("b is equal");
		}
		else 
		{
			System.out.println("b is not equal");
		}
		
		if(b==30)  //true
		{
			System.out.println("b is equal");
		}
		else 
		{
			System.out.println("b is not equal");
		}
		
		int num=30;
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}

}
