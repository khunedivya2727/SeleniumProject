package PolymorphismEX;

public class Dog extends PolyAnimals{
	
	public void AnimalSounds()
	{
		System.out.println("Bhoo Bhooo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyAnimals Animals=new PolyAnimals();
		PolyAnimals Cat=new Cat();
		PolyAnimals Dog=new Dog();
		
		Animals.AnimalSounds();
		Dog.AnimalSounds();
		Cat.AnimalSounds();
	}

}
