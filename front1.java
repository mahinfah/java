import javax.swing.*;
import java.awt.*;
public class front1
{  

private JFrame f ;
private JLabel t1,t2,t3;
private JTextField  u1;
private JPasswordField p1;
private JButton b1,b2;

	public front1()
	{ 
	f = new JFrame("WE DON'T TALK ABOUT CGPA");
	t3 = new JLabel("   user name");
	t1 = new JLabel("L O G I N");
    t2 = new JLabel("   password");
    p1 = new JPasswordField();
	b1= new JButton("login");
	b2= new JButton("Exit");
	u1 = new JTextField();
  f.getContentPane().setBackground(Color.GRAY);	
  t1.setBounds(200,30,120,130);
t2.setBounds(100,220,100,40);
p1.setBounds(230,220,180,40);
t3.setBounds(100,140,100,40);
u1.setBounds(230,140,180,40);
t1.setForeground(Color.pink);
b1.setBounds(100,330,90,30);
b2.setBounds(300,330,90,30);
f.setSize(500,500);
f.add(b2);
f.add(t1);	
f.add(t2);		
f.add(p1);
f.add(t3);
f.add(u1);
f.add(b1);
f.setLayout(null);
f.setVisible(true);

}	
	public static void main( String [] args)
	
	{
		new front1();
	}
	  }
