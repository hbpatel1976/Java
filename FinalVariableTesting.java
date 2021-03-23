class Vehicle
{
	final int speedLimit = 90;
	void run()
	{
		speedLimit = 120;
	}
}
public class FinalVariableTesting 
{
	public static void main(String args[])
	{
		Vehicle desire = new Vehicle();
		desire.run();
	}
}