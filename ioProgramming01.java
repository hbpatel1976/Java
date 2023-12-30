import java.io.*; 
public class ioProgramming01 
{ 
public static void main(String[] args) throws IOException 
    { 
        FileInputStream source = null; 
        FileOutputStream target = null; 
        try { 
                source = new FileInputStream("C:\\Users\\VSITR\\Documents\\NetBeansProjects\\input.txt"); 
                target = new FileOutputStream("C:\\Users\\VSITR\\Documents\\NetBeansProjects\\output.txt"); 
                int temp; 
                while ((temp = source.read()) != -1) target.write((byte)temp); 
            } 
        finally { 
                if (source != null)source.close(); 
                if (target != null) target.close(); 
                } 
    } 
}