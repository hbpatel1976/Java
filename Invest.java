import java.io.*;
class Invest
	{
	public static void main(String args[])
		{
		Float principalAmount = new Float(0);
		Float interestRate = new Float(0);
		int numYears=0;
		try
			{
			DataInputStream in = new DataInputStream(System.in);
			System.out.print("Enter Principal Amount : ");
			principalAmount = Float.valueOf(in.readLine());	
			System.out.print("Enter Interest Rate : ");
			String interestString= in.readLine();
			interestRate=Float.valueOf(interestString);
			System.out.print("Enter Number of years: ");
			String yearString= in.readLine();
			numYears=Integer.parseInt(yearString);
			}
		catch(Exception e)
			{
			System.out.println("IO Error");
			System.exit(1);
			}
		float value=calculateInterest(principalAmount.floatValue(),interestRate.floatValue(),numYears);
		System.out.println("Final Value = " + value);
		}
	static float calculateInterest(float p, float r, int n)
		{
		return (p*r*n)/100;
		}
	}