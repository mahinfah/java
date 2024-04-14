import javax.swing.*;

import java.awt.*;

//import java.awt.event.*;

class BackgroundImageJFrame extends JFrame   // adding background pic
{

    JButton b1;
    JLabel l1;

    public BackgroundImageJFrame() {

        setSize(800,800);
        setVisible(true);

     setLayout(new BorderLayout());

        JLabel background=new JLabel(new ImageIcon("swing/picfortest.png"));

        add(background);

       // background.setLayout(new FlowLayout());

        l1=new JLabel("Here is a button");
        b1=new JButton("I am a button");
                                          
        background.add(l1);                
        background.add(b1);
        setSize(801,801); // for refreshing screen
    }

    public static void main(String args[]) 
    {
        new BackgroundImageJFrame();
    }
}
