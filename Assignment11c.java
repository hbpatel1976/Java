import java.io.DataInputStream;
public class Assignment11c
{
	public static void main(String args[])
	{
		int n=0,fact=1,i;
		DataInputStream in=new DataInputStream(System.in);
		try
			{
			System.out.print("Enter the number for which you wish to find factorial: ");
			n=Integer.parseInt(in.readLine());
			}
		catch(Exception e) {System.out.println("This is my message when exception is generated");}
		for(i=1; i<=n; ++i)
		{
			fact=fact*i;
		}
		System.out.println("Answer="+fact);
	}
}