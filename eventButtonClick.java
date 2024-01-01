import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class eventButtonClick  
{
    public eventButtonClick(){

        Frame frame = new Frame("Vidush Somany Institute of Technology and Research");

        Button btn = new Button("Click Here");
        btn.setBounds(100,100,150,50);
        btn.setBackground(Color.red);
        btn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();

                btn.setBackground(new Color(r,g,b));
                r = rand.nextFloat();
                g = rand.nextFloat();
                b = rand.nextFloat();

                btn.setForeground(new Color(r,g,b));

                btn.setFont(new Font("Arial", Font.BOLD, 18));
            }
        });
        frame.add(btn);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) {frame.dispose();}
        });
    }
    public static void main(String[] args) {eventButtonClick f = new eventButtonClick();}
}