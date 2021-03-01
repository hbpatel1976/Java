class NumberSorting
{
public static void main(String args[])
	{
	int number[] = { 55,40,80,65,71};
	int n=number.length,i,j;
	System.out.println("Given List : ");
	for (i=0; i<n; ++i)
		{
		System.out.print(" "+number[i]);
		}
	System.out.println("\n");
	for(i=0; i<n; ++i)
		{
		for(j=i+1; j<n; ++j)
			{
			if(number[i]<number[j])
				{
				int temp=number[i];
				number[i]=number[j];
				number[j]=temp;
				}
			}
		}
	System.out.println("Sorted List:");
	for(i=0; i<n; ++i)
		{
		System.out.print("  "+number[i]);
		}
	}
}