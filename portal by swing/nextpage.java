import javax.swing.*;
 
 import java.awt.*;
import java.awt.event.*;  
 public class nextpage implements ActionListener
 {    
	 private JFrame frame ;
	 private JTextArea text;
	 private JLabel head ,ss;
	 
	 private JButton Logout,reg,identitiy,vaccine,d,e;
	 private JComboBox ca1,ca2,ca3,ca4,ca5;
	  
	  public nextpage()
	  {
		  frame = new JFrame("Portal");
		  ImageIcon logoutpic = new ImageIcon("logout.png");
		  Logout = new JButton(logoutpic);
		  ImageIcon head1 = new ImageIcon("head.1png.png");
		  head = new JLabel(head1);	
		  Color color1=new Color(255,255,255);  //this two line for cng text color
		  String b[] = {"Grade Rports","*By Curriculum","*By Semester"};
		  ca2= new JComboBox(b);
		  ca2.setBounds(9,134,230,30);
		  ca2.setBackground(new  Color(0,0,255));
		  frame.add(ca2);
		  String c [] = {"Library","Search","Borrow book","Financial","Current Borrows"};
		  
		  //buttons
		   Color color2= new Color(255,255,255);
		  reg = new JButton("Go to Registration");
		  reg.setBounds(320,258,140,20);
		  reg.setBackground(new  Color(204,0,0));
		  reg.setForeground(color2);
		  
		  identitiy = new JButton("Submit Information");
		   identitiy.setBounds(464,258,150,20);
		  identitiy.setBackground(new  Color(51,153,255));
		  identitiy.setForeground(color2);
		  
		  vaccine = new JButton("Covid 19 vaccine");
		   vaccine.setBounds(620,258,140,20);
		  vaccine.setBackground(new  Color(51,153,255));
		  vaccine.setForeground(color2);
		  
		  
		  ca3 = new JComboBox(c);
		  ca3.setBounds(9,171,230,30);
		  ca3.setBackground(new Color(0,0,255));
		  frame.add(ca3);
		  String d []= {"Others","Applications","Parking Applications"};
		    ca4 = new JComboBox(d);
		  ca4.setBounds(9,209,230,30);
		  ca4.setBackground(new Color(0,0,255));
		  frame.add(ca4);
		  
		    String e []= {"Message","MailBox"};
		    ca5 = new JComboBox(e);
		  ca5.setBounds(9,248,230,30);
		  ca5.setBackground(new Color(0,0,255));
		  frame.add(ca5);
		  ImageIcon sspic= new ImageIcon("ss.png");
		  ss= new JLabel(sspic);
		  ss.setBounds(255,95,sspic.getIconWidth(),sspic.getIconHeight());
		  
	     head.setBounds(5,15,850,70);
		 //Logout.setBounds(1, 1, 50,50,);
		  Logout.setBounds(875,24, logoutpic.getIconWidth(), logoutpic.getIconHeight());
		   String a [] = {"Academics","Grades & Reports","Registration","Drop Applications","My Curriculum"};
		 //String a[] = { "a","b","c","d","e"};
		   ca1 =  new JComboBox(a);
		   ca1.setBackground(new Color(	0,0,255));
		  ca1.setBounds(9,100,230,30);

		   ca1.setForeground(color1); 
		    ca2.setForeground(color1);  
		   ca3.setForeground(color1);  
		    ca4.setForeground(color1);  
			 ca5.setForeground(color1); 
             			 
		  
		  
		  frame.add(ca1);
		 Logout.setBackground(new Color(51,204,255));
		 
		 frame.add(head);
		 frame.add(identitiy);
		 
		 
		 frame.add(reg);
		  frame.add(ss);
		 frame.add(Logout);
		 frame.add(vaccine);
		  
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
