import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class portal
{
	private JFrame f;
	private JButton b;
	private JTextField t;
	private JLabel l;
	 private Container c;
	 private ImageIcon logo ,login;
	
	public portal()
	{
		
		
		f=new JFrame("Index");
		//f.getContentPane().setBackground(Color.orange);
		  c = f.getContentPane();
      //  c.setBackground(Color.decode("#800080"));
		//sum=new JButton("Summation(+)");		       // ImageIcon logo = new ImageIcon("");

		        ImageIcon logo = new ImageIcon("framepic.png");
        f.setIconImage(logo.getImage());
        f.setLocationRelativeTo(null);
		
 ImageIcon login = new ImageIcon("hh.png");
        JLabel j = new JLabel(login);
        j.setBounds(1, 1, login.getIconWidth(), login.getIconHeight());
        f.add(j);
l = new JLabel("Sign in with your organizational id number.");
l.setBounds(86,160,380,40);

		//minus=new JButton("Minus(-)");
//		mult=new JButton("Multiply(*)");
//		div=new JButton("Division(/)");
		
//		num1= new JTextField();
//		num2= new JTextField();
//		solution= new JTextField();
		
//		num1l=new JLabel("Number-1");
//		num2l=new JLabel("Number-2");
//		solutionl=new JLabel("Solution");
		
		f.setSize(415,415);
		
//*num1l.setBounds(100,50,100,100);
	//	num2l.setBounds(300,50,100,100);
	//	num1.setBounds(100,200,100,100);
	//	num2.setBounds(300,200,100,100);
	///	sum.setBounds(100,400,100,100);
		//minus.setBounds(250,400,100,100);
	f.add(l);
		f.setLayout(null);
		
		f.setVisible(true);
	}
	
		public static void main(String [] arg)
	{
		
		new portal();
	}
}	
		
		
		
	
