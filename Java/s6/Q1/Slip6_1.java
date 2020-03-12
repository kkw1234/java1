import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

class Slip6_1
{
	public static void main(String args[])
    {
    	frame4_1 obj=new frame4_1();
    }
}
class frame4_1 extends JFrame implements ActionListener
{
   panel4_1 p1;
   frame4_1()
   {
		setSize(600,300);

		Container c1=getContentPane();
     	c1.setLayout(new BorderLayout());
     	p1=new panel4_1();
     	c1.add(p1,"Center");
     	//this.addWindowListener(new WindowCloser());
     	p1.b1.addActionListener(this);
     	setVisible(true);
 	}
    public void actionPerformed(ActionEvent ae)
    {
    	int decimal =Integer.parseInt(p1.tf1.getText());

        get_bin(decimal);
        get_octal(decimal);
        get_hex(decimal);
    }
    void get_bin(int temp)
	{
    	int i=0,bin=0;
        int array[]=new int[10];

        while(temp!=0)
        {
	        array[i++]=temp % 2;
            temp= temp /2;
        }           
        while(i>=0)
        bin=(bin * 10)+array[i--];
        p1.tf2.setText("" + bin);
	}

    void get_octal(int temp)
    {
	    int i=0,oct=0;
        int array[]=new int[10];
		{        
        	array[i++]=temp % 8;
            temp=temp / 8;
        }
        while( i>=0)
        	oct=(oct * 10)+array[i--];
        p1.tf3.setText(""  +oct);
	}
    void get_hex(int temp)                                
    {
    	int i=0;
        int array[]=new int[10];
        String hex="";

        while(temp!=0)
        {
       	 	array[i++]=temp  %16;
            temp=temp  /16;
        }
        i--;
        while(i >=0)
        {
            if(array[i] >= 10)
            	hex=hex+get_char(array[i]);
            else
                hex = hex + array[i];
                i--;
        }
        p1.tf4.setText(hex);
	}
    char get_char(int a)
    {
    	switch(a)
        {
        	case 10:  return 'A';
            case 11:  return 'B';
            case 12:  return 'C';
            case 13:  return 'D';
            case 14:  return 'E';
            case 15:  return 'F';
        }
        return 0;
	}
}

class panel4_1 extends JPanel
{
	JTextField tf1, tf2, tf3, tf4;
    JButton b1;

    panel4_1()
    {                                                
		JLabel l1, l2, l3, l4;
	    
	    setLayout(null);
        
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        tf4=new JTextField(20);
                                                        
        l1=new JLabel("DECIMAL NUMBER:");
        l2=new JLabel("BINARY NUMBER:");             
        l3=new JLabel("OCTAL NUMBER:");
        l4=new JLabel("HEXADECIMAL NUMBER:");

        b1=new JButton("CALCULATE");
        l1.setBounds(150,20,150,20);
        l2.setBounds(150,50,150,20);
        l3.setBounds(150, 80, 150, 20);
        l4.setBounds(150, 110, 150, 20);
        tf1.setBounds(300, 20, 100, 20);
        tf2.setBounds(300, 50, 100, 20);
        tf3.setBounds(300, 80, 100, 20);
        tf4.setBounds(300, 110, 100, 20);
        b1.setBounds(200, 150, 130, 25);
        
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(b1);
	}
}