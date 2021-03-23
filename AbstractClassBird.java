abstract class Animal
{
	boolean vegetarian;
	int runningSpeed;
	String animalName;
	Animal(boolean v, int r, String n)
	{
		vegetarian=v;
		runningSpeed=r;
		animalName=n;
	}
	abstract void display();
}
class Carnivorous extends Animal
{
	Carnivorous(boolean a, int b, String c){super(a,b,c);}
	void display()
	{
		System.out.println("Speed of Carnivorous Animal " + animalName +" is "+runningSpeed);
	}
}
class Vegetarian extends Animal
{
	Vegetarian(boolean a, int b, String c){super(a,b,c);}
	void display()
	{
		System.out.println("Speed of Vegetarian Animal " + animalName + " is "+runningSpeed);
	}
}

public class AbstractClassBird 
{
	public static void main(String args[])
	{
		Carnivorous lion = new Carnivorous (false,100,"LION");
		Vegetarian cow = new Vegetarian (false,30,"COW");
		lion.display();
		cow.display();
	}
}
