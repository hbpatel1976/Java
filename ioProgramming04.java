import java.io.IOException;
import java.io.RandomAccessFile;
public class ioProgramming04 
{
    public static void main(String[] args) throws IOException
        {
        RandomAccessFile file = new RandomAccessFile("C:\\Users\\VSITR\\Documents\\NetBeansProjects\\file.txt", "rw");

        file.writeChar('V');
        file.writeInt(1023);
        file.writeDouble(49.22);
   
        file.seek(0);
   
        System.out.println(file.readChar());  // 0
        System.out.println(file.readInt());   // 1
        System.out.println(file.readDouble());// 2
   
        file.seek(2);
        System.out.println(file.readInt());  // 2
 
        file.seek(file.length());            // 3
        file.writeBoolean(true);             // 4

        file.seek(4); 
        System.out.println(file.readBoolean());  // 4
        file.close();
        }
}