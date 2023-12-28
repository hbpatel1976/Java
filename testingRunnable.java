class runClass implements Runnable
{
       public void run()
        {
            System.out.println("Thread is running");
        }
}
public class testingRunnable
{
    public static void main(String[] args) 
    {
        runClass obj1 = new runClass(); 
        Thread t = new Thread(obj1); 
        t.start();
    }
}