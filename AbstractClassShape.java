abstract class shape
{
	int radius, length, width;
	abstract void showArea();
}

class rectangle extends shape
{
	rectangle(int a, int b){length=a; width=b;}
	void showArea() {System.out.println("Area of Rectangle = " + length*width);}
}

class circle extends shape
{
	circle(int a){radius=a;}
	void showArea() {System.out.println("Area of Rectangle = " + 3.14 * radius * radius);}
}


public class AbstractClassShape 
{
	public static void main (String args[])
	{
	rectangle r = new rectangle(10, 20);
	circle c = new circle (10);
	r.showArea();
	c.showArea();
	}
}
