import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 class gui extends JFrame implements ActionListener
{
	String s;
	JTextField a,b,c,d; ButtonGroup bg;
	JRadioButton rb1,rb2,rb3;
	JCheckBox cb1,cb2,cb3;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6;
	public gui(String s)
	{
		super(s);
		setLayout(new FlowLayout());
		lb1=new JLabel("your name");
		lb4=new JLabel(" name");
		lb5=new JLabel("class");
		lb6=new JLabel("hobbies");
		a=new JTextField(10);
		b=new JTextField(5);
		c=new JTextField(5);
		d=new JTextField(5);

		lb2=new JLabel("your class");
		rb1=new JRadioButton("fy");
		rb2=new JRadioButton("sy");
		rb3=new JRadioButton("ty");

		lb3=new JLabel("your hobbies");
		cb1=new JCheckBox("music");
		cb2=new JCheckBox("dance");
		cb3=new JCheckBox("sports");
 bg= new ButtonGroup();
 bg.add(rb1);
 bg.add(rb2);
 bg.add(rb3);
		add(lb1);
		add(a);
		setLayout(new GridLayout(9,2));
		add(lb2);
		add(lb3);
		add(rb1);
		add(cb1);
		add(rb2);
		add(cb2);
		add(rb3);
		add(cb3);
		add(lb4);
		add(b);
		add(lb5);
		add(c);
		add(lb6);
		add(d);

		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);

		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String msg=" ";
		String s1; 
		d.setText("");
		s1=a.getText();
		b.setText(s1);
		if(ae.getSource()==rb1)
		{
			c.setText(msg + "fy");
		
		}
		if(ae.getSource()==rb2)
		{
			c.setText(msg + "sy");

		}
		if(ae.getSource()==rb3)
		{
			c.setText(msg + "ty");
			
		}
		
		if(cb1.isSelected())
		{
			d.setText(d.getText() + "music");
		}
		if(cb2.isSelected())
		{
			d.setText(d.getText() + "dance");
		}
		if(cb3.isSelected())
		{
			d.setText(d.getText() + "sports");
		}
	}
	public static void main(String args[])
	{
		new gui ("student information");
	}
}
