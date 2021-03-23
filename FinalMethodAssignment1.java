class result
{
	int dbms, java, os, total;
	result (int a, int b, int c)
	{
		dbms=a;
		java=b;
		os=c;
	}
	final int calculate()
	{
		return dbms + java + os;
	}
}
public class FinalMethodAssignment1 
{
public static void main(String args[])
	{
	result r = new result(78, 89, 86);
	System.out.println(r.calculate());
	}
}