class Car
{
    void show() {System.out.println("This is a show function of Car class");}
}
class Maruti extends Car
{
    void show() {System.out.println("This is a show function of Maruti class");}
}

class Dezire extends Car
{
    void show() {System.out.println("This is a show function of Dezire class");}
}
public class methodOverriding 
{
    public static void main(String args[])
    {
        Car c = new Car();
        Maruti m = new Maruti();
        Dezire d = new Dezire();
        
        c.show();
        m.show();
        d.show();
    }
}