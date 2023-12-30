import java.io.*; 
public class ioProgramming02
{ 
public static void main(String[] args) throws IOException 
    { 
        FileReader sourceStream = null;
        FileWriter targetStream = null;
        try { 
                sourceStream = new FileReader("C:\\Users\\VSITR\\Documents\\NetBeansProjects\\input.txt"); 
                targetStream = new FileWriter("C:\\Users\\VSITR\\Documents\\NetBeansProjects\\output.txt"); 
                int temp; 
                while ((temp = sourceStream.read()) != -1) targetStream.write((byte)temp); 
            } 
        catch(Exception e) {System.out.println(e);}
        finally { 
                if (sourceStream != null)sourceStream.close(); 
                if (targetStream != null) targetStream.close(); 
                } 
    } 
}