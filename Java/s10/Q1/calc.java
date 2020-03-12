import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class calc extends JFrame implements ActionListener
{
 JTextField t1;
 Font f;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 String flag;
 int a,b;
 calc(String title)
 {
  super(title);
  setVisible(true);
  setSize(320,250);
  setLayout(null);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f=new Font("Times New Roman",Font.BOLD,25);
  t1=new JTextField(15); 
  t1.setBounds(30,20,250,30);
  add(t1);
  b1=new JButton("1");
  b1.setBounds(20,60,60,25);
  b1.setFont(f);
  add(b1);
  b1.addActionListener(this);
  b2=new JButton("2");
  b2.setBounds(90,60,60,25);
  b2.setFont(f);
  b2.addActionListener(this);
  add(b2);
  b3=new JButton("3");
  b3.setBounds(160,60,60,25);
  b3.setFont(f);
  add(b3);
  b3.addActionListener(this);
  b4=new JButton("4");
  b4.setBounds(20,95,60,25);
  b4.setFont(f);
  add(b4);
  b4.addActionListener(this);
  b5=new JButton("5");
  b5.setBounds(90,95,60,25);
  b5.setFont(f);
  add(b5);
  b5.addActionListener(this);
  b6=new JButton("6");
  b6.setBounds(160,95,60,25);
  b6.setFont(f);
  add(b6);
  b6.addActionListener(this);
  b7=new JButton("7");
  b7.setBounds(20,130,60,25);
  b7.setFont(f);
  add(b7);
  b7.addActionListener(this);  
  b8=new JButton("8");
  b8.setBounds(90,130,60,25);
  b8.setFont(f);
  add(b8);
  b8.addActionListener(this);
  b9=new JButton("9");
  b9.setBounds(160,130,60,25);
  b9.setFont(f);
  add(b9);
  b9.addActionListener(this);
  b10=new JButton("0");
  b10.setBounds(20,165,60,25);
  b10.setFont(f);
  add(b10);
  b10.addActionListener(this);
  b11=new JButton("+");
  b11.setBounds(230,60,60,25);
  add(b11);
  b11.addActionListener(this);
  b12=new JButton("-");
  b12.setBounds(230,95,60,25);
  b12.setFont(f);
  add(b12);
  b12.addActionListener(this);
  b13=new JButton("*");
  b13.setBounds(230,130,60,25);
  b13.setFont(f);
  add(b13);
  b13.addActionListener(this);
  b14=new JButton("/"); 
  b14.setBounds(230,165,60,25);
  b14.setFont(f);
  add(b14);
  b14.addActionListener(this);
  b15=new JButton("=");
  b15.setBounds(160,165,60,25);
  b15.setFont(f);
  add(b15);
  b15.addActionListener(this);
  b16=new JButton("Ac");
  b16.setBounds(90,165,60,25);
 Font f1=new Font("Times new Roman",Font.BOLD,15);
  b16.setFont(f1);
  add(b16);
  b16.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
   if(e.getSource()==b1)
   {
   	  t1.setText(t1.getText()+"1");
   }
  if(e.getSource()==b2)
   {
    t1.setText(t1.getText()+"2");
   }
  if(e.getSource()==b3)
   {
    t1.setText(t1.getText()+"3");
   }
  if(e.getSource()==b4)
   {
    t1.setText(t1.getText()+"4");
   }
  if(e.getSource()==b5)
   {
    t1.setText(t1.getText()+"5");
   }
  if(e.getSource()==b6)
   {
    t1.setText(t1.getText()+"6");
   }
  if(e.getSource()==b7)
   {
    t1.setText(t1.getText()+"7");
   }
  if(e.getSource()==b8)
   {
    t1.setText(t1.getText()+"8");
   }
  if(e.getSource()==b9)
   {
    t1.setText(t1.getText()+"9");
   }
  if(e.getSource()==b10)
   {
    t1.setText(t1.getText()+"0");
   }
  if(e.getSource()==b11)
   {
   	  a=Integer.parseInt(t1.getText());
      t1.setText("");
      flag="a";
   }
  if(e.getSource()==b12)
   {
   	a=Integer.parseInt(t1.getText());
      t1.setText("");
      flag="m";
    //t1.setText("-");
   }
  if(e.getSource()==b13)
   {
   	a=Integer.parseInt(t1.getText());
      t1.setText("");
      flag="mult";
   // t1.setText(t1.getText()+"*");
   }
  if(e.getSource()==b14)
   {
   	 a=Integer.parseInt(t1.getText());
      t1.setText("");
      flag="d";
    //t1.setText(t1.getText()+"/");
   }
  if(e.getSource()==b16)
   {
    t1.setText("");
   }
   if(e.getSource()==b15)
   {
     if(flag=="a")
     {
     	b=Integer.parseInt(t1.getText());
     	a=a+b;
     	t1.setText(""+a);
     }
     if(flag=="m")
     {
     	b=Integer.parseInt(t1.getText());
     	a=a-b;
     	t1.setText(""+a);
     }
     if(flag=="mult")
     {
     	b=Integer.parseInt(t1.getText());
     	a=a*b;
     	t1.setText(""+a);
     }
     if(flag=="d")
     {
     	b=Integer.parseInt(t1.getText());
     	if(b==0)
     	{
     		t1.setText("Error");
     	}
     	else
     	{
         	a=a/b;
         	t1.setText(""+a);
                  	}
         
     }
   }
 }
 
 public static void main(String args[])
 {
   calc c1=new calc("Calculator");
 }

}
