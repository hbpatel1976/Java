public class methodOverloading 
{
    static void sum() {System.out.println("No data for summation");}
    static int sum(int p) {return p;}
    static int sum(int p, int q) {return p+q;}
    static int sum(int p, int q, int r) {return p+q+r;}
    public static void main(String args[])
    {
        sum();
        System.out.println(sum(10));
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
    }
}