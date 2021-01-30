/* CommandLine.java */
class CommandLine
{
public static void main(String args[])
	{
	int count,i=0;
	String string;
	count=args.length;
	System.out.println("Number of arguments = "+count);
	while ( i < count)
		{
		string=args[i];
		i=i+1;
		System.out.println(i+":"+"Hello "+string+"!");
		}
	}
}