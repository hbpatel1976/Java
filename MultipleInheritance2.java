interface interfaceA
{
	public void methodA();
}
interface interfaceB
{
	public void methodB();
}
class classC implements interfaceA, interfaceB
{
	public void methodA() {System.out.println("This is Method A from class C");}
	public void methodB() {System.out.println("This is Method B from class C");}
}
public class MultipleInheritance2 
{
	public static void main(String args[])
	{
		classC objc = new classC();
		objc.methodA();
		objc.methodB();
	}
}