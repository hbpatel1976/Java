class Father
{
    void showF() {System.out.println("This is show function in Father class");}
}
class Child extends Father
{
    void showC() {System.out.println("This is show function in Child class");}
}
class grandChild extends Child
{
    void showG() {System.out.println("This is show function in Grand Child class");}
}
public class multilevelInheritance 
{
    public static void main(String args[])
    {
        grandChild g = new grandChild();
        g.showG();
        g.showC();
        g.showF();
    }
}