package com.mycompany.mavenproject1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class citySelection extends JFrame implements ItemListener 
{
	static JFrame f;
	static JLabel l;
	static JComboBox c;
	public static void main(String[] args)
	{
		f = new JFrame("frame");
		citySelection s = new citySelection();
		f.setLayout(new FlowLayout());
		String s1[] = { "","Gandhinagar", "Kadi", "Visnagar", "Ahmedabad", "Surat" };

		c = new JComboBox(s1);c.addItemListener(s);
		l = new JLabel("select your city ");
		l.setForeground(Color.red);
		JPanel p = new JPanel();
		p.add(l);
		p.add(c);
		f.add(p);
		f.setSize(400, 300);
		f.show();
	}
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getSource() == c) {l.setText(c.getSelectedItem() + " selected");}
	}
}