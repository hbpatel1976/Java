import java.io.*; 
import java.nio.CharBuffer; 
import java.util.Arrays; 

class ioProgramming03
{ 
	public static void main(String[] args) throws IOException 
	{ 
		Reader r = new FileReader("C:\\Users\\VSITR\\Documents\\NetBeansProjects\\file.txt"); 
		PrintStream out = System.out; 
		char c[] = new char[20]; 
		CharBuffer cf = CharBuffer.wrap(c); 
		if (r.ready()) 
		{ 
			r.read(c, 0, 15); 
			out.println(Arrays.toString(c)); 
			r.read(cf); 
			out.println(Arrays.toString(cf.array())); 
		} 
		r.close(); 
	} 
}