/* ElseIfLadder.java */
class ElseIfLadder
{
public static void main(String args[])
	{
	int rollno[] = { 111,222,333,444 };
	int marks[] = {81,75,43, 58};
	for(int i=0; i<rollno.length; ++i)
		{
		if(marks[i] > 79)System.out.println(rollno[i]+" - Honours");
		else if(marks[i] > 59)System.out.println(rollno[i]+" - I division");
		else if(marks[i] > 49)System.out.println(rollno[i]+" - II division");
		else System.out.println(rollno[i]+" - III division");
		}
	}
}
