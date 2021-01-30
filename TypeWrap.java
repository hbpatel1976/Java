/* TypeWrap.java */
class TypeWrap
{
public static void main(String args[])
	{
	System.out.println("Variables Created");
	char c='x';
	byte b=50;
	short s=1996;
	int i=123456789;
	long l=1234567654321L;
	float f1=3.142f;
	float f2=1.2e-5f;
	double d2=0.000000987;
	System.out.println("c = " + c);
	System.out.println("b = " + b);
	System.out.println("s = " + s);
	System.out.println("i = " + i);
	System.out.println("l = " + l);
	System.out.println("f1 = " + f1);
	System.out.println("f1 = " + f2);
	System.out.println("d2 = " + d2);
	System.out.println(" ");
	System.out.println("Types Converted");
	short s1=(short)b;
	short s2=(short)i;
	float n1=(float)i;
	int m1=(int)f1;
	System.out.println("(short)b = " + s1);
	System.out.println("(short)i = " + s2);
	System.out.println("(float)l = " + n1);
	System.out.println("(int)f1 = " + m1);
	}
}