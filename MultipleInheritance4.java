interface Wheeler2
{
	public void show();
}
abstract class Wheeler4
{
	abstract public void show();
}
class myVehicle extends Wheeler4 implements Wheeler2
{
	public void show() {System.out.println("This is my vehicle");}
}
public class MultipleInheritance4 
{
	public static void main(String args[])
	{
		myVehicle m = new myVehicle();
		m.show();
	}
}
