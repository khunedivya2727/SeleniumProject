package InheritanceEx;

public class DogEx extends CatsEx{
	
	public void Dog()
	{
		System.out.println("Dog");
	}
	
	public static void main(String[] args) {
		
		DogEx obj=new DogEx();
		obj.Dog();
		obj.Cat();
		obj.Animal();
		
		
	}

}
