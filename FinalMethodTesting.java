class Car
{
	final void run()
	{
		System.out.println("Car is running");
	}
}
class Honda extends Car
{
	void run()
	{
		System.out.println("Honda Car is running");
	}
}
public class FinalMethodTesting 
{
	public static void main(String args[])
	{
		Honda city = new Honda();
		city.run();
	}
}