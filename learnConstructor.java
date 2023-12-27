public class learnConstructor 
{
    int data1, data2;
    public learnConstructor()
    {
        System.out.println("This is a constructor without any argument");
        data1=-1;
        data2=-1;
    }
    public learnConstructor(int a)
    {
        System.out.println("This is a constructor with one any argument");
        data1=a;
        data2=-1;
    }
    public learnConstructor(int a, int b)
    {
        System.out.println("This is a constructor with two arguments");
        data1=a;
        data2=b;
    }
    void show()
    {
        System.out.println("Data 1 = " + data1 + " Data 2 = " + data2);
    }
    public static void main(String args[])
    {
        learnConstructor object1 = new learnConstructor();
        learnConstructor object2 = new learnConstructor(5);
        learnConstructor object3 = new learnConstructor(5,10);
        object1.show();
        object2.show();
        object3.show();
    }
}