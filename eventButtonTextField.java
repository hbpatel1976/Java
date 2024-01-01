import java.awt.*;
import java.awt.event.*;
class eventButtonTextField extends Frame implements ActionListener
{
    TextField textBox;
    eventButtonTextField()
    {
        textBox=new TextField();
        textBox.setBounds(60,50,170,20);
        Button btn=new Button("Click Here");
        btn.setBounds(100,120,80,30);

        btn.addActionListener(this);//passing current instance

        add(btn);add(textBox);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){textBox.setText("VSITR Kadi");}
    public static void main(String args[]){new eventButtonTextField();}
} 