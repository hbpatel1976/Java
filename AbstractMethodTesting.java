abstract class bike
{
	abstract void run();
}
class splender extends bike
{
	void run()
	{
		System.out.println("Splender motorcycle is running");
	}
}
public class AbstractMethodTesting 
{
	public static void main(String args[])
	{
		splender s = new splender ();
		s.run();
	}
}