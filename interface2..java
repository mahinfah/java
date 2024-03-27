import javax.swing.*;
public class test5
{
	private JFrame f;
	private JButton b;
	private JTextField t;
	
	public test5()
	{
		f = new JFrame("example");
		b = new JButton ();
		b.setText("user name");
		b.setBounds(40,100,150,100);
		 t = new JTextField();
		 t.setBounds(150,100,95,30);
		 f.add(b);
		f.add(t);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		
	
	}










}
