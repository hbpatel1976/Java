class Father
{
    void showF() {System.out.println("This is show function in Father class");}
}
class Child extends Father
{
    void showC() {System.out.println("This is show function in Child class");}
}
public class singleInheritance 
{
    public static void main(String args[])
    {
        Child s = new Child();
        s.showC();
        s.showF();
    }
}