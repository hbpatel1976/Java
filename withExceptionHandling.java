public class withExceptionHandling 
{
    public static void main(String args[])
    {
        try
        {
            int marks[] = {89, 58, 91};
            System.out.println(marks[10]);
        }
        catch(Exception e)
        {
            System.out.println("Something is wrong");
        }
        finally
        {
            System.out.println("Have a great day");
        }
    }   
}