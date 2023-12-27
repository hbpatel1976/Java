public class learnStringBuffer 
{
    public static void main(String[] args)
    {
        StringBuffer obj = new StringBuffer();
        obj.append("Vidush");
        obj.append(" ");
        obj.append("Somany");
        System.out.println(obj);
        String message = obj.toString();
        System.out.println(message);
        
        obj.insert(7, "Kadi ");
        System.out.println(obj);
        
        obj.replace(7,11,"Gngr");
        System.out.println(obj);
        
        obj.delete(7,12);
        System.out.println(obj);
        
        obj.reverse();
        System.out.println(obj);
    }
}