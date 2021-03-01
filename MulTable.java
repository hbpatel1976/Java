class MulTable
{
final static int Rows=20;
final static int  Columns=20;
public static void main(String args[])
	{
	int product[][]= new int[Rows][Columns];
	System.out.println("MULTIPLICATION TABLE");
	System.out.println(" ");
	int i,j;
	for(i=10; i<Rows; ++i)
		{
		for(j=10; j<Columns; ++j)
			{
			product[i][j]=i*j;
			System.out.print("  "+product[i][j]);
			}
		System.out.println(" ");
		}
	}
}