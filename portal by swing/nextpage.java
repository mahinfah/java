import javax.swing.*;
 
 import java.awt.*;
import java.awt.event.*;  
 public class nextpage implements ActionListener
 {
	 private JFrame frame ;
	 private JTextArea text;
	 private JLabel head;
	 
	 private JButton Logout,a,b,c,d,e;
	 private JComboBox ca1;
	  
	  public nextpage()
	  {
		  frame = new JFrame("Portal");
		  ImageIcon logoutpic = new ImageIcon("logout.png");
		  Logout = new JButton(logoutpic);
		  ImageIcon head1 = new ImageIcon("head.1png.png");
		  head = new JLabel(head1);
		  
	     head.setBounds(5,15,850,70);
		 //Logout.setBounds(1, 1, 50,50,);
		  Logout.setBounds(855,24, logoutpic.getIconWidth(), logoutpic.getIconHeight());
		   String a [] = {"Academics","Grades & Reports","Registration","Drop Applications","My Curriculum"};
		 //String a[] = { "a","b","c","d","e"};
		   ca1 =  new JComboBox(a);
		   ca1.setBackground(new Color(	51,153,255));
		  ca1.setBounds(9,100,176,35);
		  frame.add(ca1);
		 Logout.setBackground(new Color(51,204,255));
		 
		 frame.add(head);
		 
		 
		 
		 
		 
		 frame.add(Logout);
		  
		  frame.setSize(950,900);
		  frame.setLayout(null);
		  frame.setVisible(true);
		  
		  
		  
	
 
 Logout.addActionListener(this);
 }
 
  public void actionPerformed(ActionEvent e)
  {
      if(e.getSource()==Logout)
        {
	 
	 new portal();
	 frame.setVisible(false);
        }
 
  }
  
  
 }