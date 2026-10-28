package StringEX;

public class StringEX {

	public static void main(String[] args) {
		String str="This is java programming language";
		System.out.println(str);
		
		char ch = 'd';
		System.out.println(ch);
		
		String str1= "this is java programming language           ";
		System.out.println(str1);
		
		int a=10;
		int b=20;
		System.out.println(a+b);
		
		String s1="10";
		String s2="20";
		System.out.println(s1+s2);
		System.out.println(str.length());
		System.out.println(str+str1);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("is",3));
		System.out.println(str.substring(7));
		System.out.println(str.substring(10,15));
		System.out.println(str.startsWith("T"));
		System.out.println(str.endsWith("e"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str);
		System.out.println("["+str1+"]");
		System.out.println("["+str1.trim()+"]");
		System.out.println(str.concat(str1).concat(s2));
		
		
		//Special char: backward slash
		
		String data="this is 'java' base language";
		System.out.println(data);
		
		data="this is \"java\" programming language";
		System.out.println(data);
		
		data="this is \"java\" programming language \nit is an object oriented programming language";
		System.out.println(data);
		
		data="\t this is java programming langauge";
		System.out.println(data);
		
		
		
	}
}
