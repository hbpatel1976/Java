import java.util.*;
public class queueInterface 
{
     public static void main(String args[])
    {
        Queue<String> queue = new LinkedList<>();
        queue.add("VSITR");
        queue.add("LDRP");
        queue.add("KSV");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        queue.add("GANDHINAGAR");
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
