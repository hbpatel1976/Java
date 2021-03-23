final class car
{
	void run()
	{
		System.out.println("Car is running");
	}
}
class honda extends car
{
	void run()
	{
		System.out.println("Honda Car is running");
	}
}
public class FinalClassTesting
{
	public static void main(String args[])
	{
		honda city = new honda();
		city.run();
	}
}