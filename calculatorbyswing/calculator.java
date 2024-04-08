import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
//import static javax.swing.JOptionPane.showMessageDialog;
public class calculator implements ActionListener
{
	private JFrame f;	
	private JTextArea digit1, digit2;
	private JButton button;
	private JButton sum ,minus,multi,division ;
	private JLabel la ;
	public calculator()
	{
		f = new JFrame("WE DON'T TALK ABOUT CGPA");
f.getContentPane().setBackground(Color.orange);
 	digit1 = new JTextArea("enter :");
    	sum = new JButton("sum");
   
    digit2= new JTextArea("enter :");
	digit2.setBounds(280,50,100,40);
    minus = new JButton("MINUS");
	multi= new JButton("Multi");
	division = new JButton("division");
	la=new JLabel();
    digit1.setBounds(100,50,100,40);
   sum.setBounds(40,160,80,40);
minus.setBounds(120,160,80,40);
multi.setBounds(210,160,80,40);
division.setBounds(300,160,80,40);
la.setBounds(180,210,300,250);
    f.setSize(500,500);
    f.add(digit2);
    f.add(digit1);
	f.add(sum);
	f.add(minus);
	f.add(la);
	f.add(multi);
	f.add(division);
    f.setLayout(null);
    f.setVisible(true);
	f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    f.getContentPane();
	
    	sum.addActionListener(this);
      minus.addActionListener(this);
     multi.addActionListener(this);
     division.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent e)
		{
			
         String a =digit1.getText();
         String b =digit2.getText();
			
		
			if(e.getSource()==sum){
				
			double sum1 =Double.parseDouble(a)+Double.parseDouble(b);
			la.setText("sum is :"+sum1);
			
		
		
	

		}
			if(e.getSource()==minus){
			
			
			
			//if(Double.parseDouble(a)>0&&Double.parseDouble(b)>0)
			{
			double sum2 =Double.parseDouble(a)-Double.parseDouble(b);
			la.setText("minus :"+sum2);
			}
			
		}
		if(e.getSource()==multi)
		{
		double sum3 =Double.parseDouble(a)*Double.parseDouble(b);
		la.setText("multi :"+sum3);
		}
		if(e.getSource()==division)
		{
		double sum4 =Double.parseDouble(a)/Double.parseDouble(b);
		la.setText("division :"+sum4);
		}
		

}
public static void main(String [] args)
{
new calculator();

}


   }

