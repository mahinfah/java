
import javax.swing.*; 
import java.awt.*; 
public class firstswingexample {  
    firstswingexample(){

JFrame f=new JFrame("we don't talk about cgpa");//creating instance of JFrame  

f.getContentPane().setBackground(Color.LIGHT_GRAY);          
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(30,100,100, 40);//x axis, y axis, width, height  
          JTextField t = new JTextField("Here");
          t.setBounds(150, 100, 100, 40);
f.add(b);//adding button in JFrame  
f.add(t);
          
f.setSize(500,500); 
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
//text.setForeground(Colour.red);
    }



  public static void main(String[] args) 
  {  
new firstswingexample() ;

  }
}