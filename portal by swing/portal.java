
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import java.nio.file.*;


public class portal implements ActionListener
{
	private JFrame f;
	private JButton b ,login2;
	private JTextArea access;
	private JTextField id;
	private JLabel l ;
	private Cursor cursor;
	 private Container c;
//	 private JButton login2;
	 private ImageIcon logo ,login;
	private JPasswordField pass ;
	public portal()
	{
		//f.getContentPane().setBackground(Color.orange);
		
		 f=new JFrame("Index");
		 c = f.getContentPane();
          pass = new JPasswordField();
		  ImageIcon logo = new ImageIcon("framepic.png");
          f.setIconImage(logo.getImage());
        //  f.setLocationRelativeTo(null);
		  id = new JTextField();
		  // Color color=new Color(255,0,0);  this two line for cng text color
		   // id.setForeground(color);  
		 		access = new JTextArea("Can't access your account?");
		// t.setBackground(new Color(51,204,255));
		 Color color=new Color(51,153,255);
		  access.setForeground(color);
		 
        ImageIcon login = new ImageIcon("hh.png");
        JLabel j = new JLabel(login);
        j.setBounds(1, 1, login.getIconWidth(), login.getIconHeight());
        f.add(j);
			
         ImageIcon huh = new ImageIcon("login.png");
         login2 = new JButton(huh);
         login2.setBounds(1, 1, huh.getIconWidth(), huh.getIconHeight());
		//login2.setBackground(new Color(0, 0, 0, 0));
       // login2.setOpaque(false);
       // login2.setBorder(BorderFactory.createEmptyBorder());
      //login2.setCursor(cursor);
		login2.setBounds(25,350,365,40);
	  l = new JLabel("Sign in with your organizational id number.");
        l.setBounds(86,160,380,40);
        id.setBounds(25,230,365,40);
	    pass.setBounds(25,280,365,40);
       // login.setBounds(
		access.setBounds(70,420,300,40);
		access.setBackground(new Color(255, 255, 255));
		f.setSize(415,515);
		f.add(l);
	    f.add(pass);
		f.add(login2);
		f.add(access);	
		f.setLayout(null);
		
		f.add(id);
		f.setVisible(true);
	
		// login2.addActionListener(this);
		 login2.addActionListener(this);
		 access.addActionListener(this);
	 
	}
	
    public void actionPerformed(ActionEvent e) {
				
         String a =id.getText();
         String b =pass.getText();
		
       
         if(e.getSource()==login2)
		 {			 
	    //  if( a=="2"&&b=="1234")
	     // {
          new nextpage();
		  f.setVisible(false);
		 // }
		//  else
		//  {
		///	  System.out.println("Wrong pass");
		//  }
		
	}
	
         if(e.getSource()==access)
		 {			 
	    //  if( a=="2"&&b=="1234")
	     // {
          new nextpage();
		  f.setVisible(false);
		 // }
		//  else
		//  {
		///	  System.out.println("Wrong pass");
		//  }
		
	}
	
}
}
	
	
