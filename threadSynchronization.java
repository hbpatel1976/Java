import java.io.*;
import java.util.*;
class classSender
{   public void send(String msg)
	{   System.out.println("Sending...." + msg);
	    try {Thread.sleep(1000);}
            catch (Exception e) {System.out.println("Thread interrupted.");}
	    System.out.println(msg + "....Sent");
	}
}
class ThreadedSend extends Thread 
{   private String msg;
    classSender sender;
    ThreadedSend(String m, classSender obj)
	{   msg = m;
            sender = obj;
	}
	public void run()
	{   synchronized (sender)
		{
                    sender.send(msg);
		}
	}
}
class threadSynchronization 
{   public static void main(String args[])
	{   classSender send = new classSender();
            ThreadedSend S1 = new ThreadedSend("Welcome", send);
            ThreadedSend S2 = new ThreadedSend("Bye", send);
            S1.start();
            S2.start();
            try {
                    S1.join();
                    S2.join();
                }
	catch (Exception e) {System.out.println("Interrupted");}
	}
}