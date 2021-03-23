public class FinalizeMethodTesting 
{
	public static void main (String args[])
	{
		FinalizeMethodTesting d =  new FinalizeMethodTesting(); 
		try
		{
			System.out.println("Testing 1 2 3 ...");
			System.out.println("Testing A B C ...");
			System.out.println("Deleting......");
			d.finalize();
			System.out.println("Deleted......");
		}
		catch(Exception e)
		{
			System.out.println("Exception Printed: "+e);
		}
	}
	protected void finalize()
	{
		System.out.println("Collecting and trashing all the garbage....");
	}
}