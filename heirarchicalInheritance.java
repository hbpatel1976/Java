class Father
{
    void showF() {System.out.println("This is show function in Father class");}
}
class Child1 extends Father
{
    void showC1() {System.out.println("This is show function in Child 1 class");}
}
class Child2 extends Father
{
    void showC2() {System.out.println("This is show function in Child 2 class");}
}
public class heirarchicalInheritance 
{
 public static void main(String args[])   
 {
     Child1 c1 = new Child1();
     c1.showC1();
     c1.showF();
     Child2 c2 = new Child2();
     c2.showC2();
     c2.showF();
 }
}