import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class Slip22_1 extends JFrame implements ActionListener
{
	private JMenu m1,m2;
	private JMenuBar mb;
	private JMenuItem m[];
	StringBuffer ss=new StringBuffer();
	int x,y;
	int arr[]=new int [20];
	double res;
	public Slip22_1(String s)
	{
		super(s);
		mb=new JMenuBar();
		m1=new JMenu("Operation");
		m2=new JMenu("Compute");
		String str[]={"Accept","Exit","GCD","Power"};
		m=new JMenuItem[str.length];
		for(int i=0;i<str.length;i++)
		{
			m[i]=new JMenuItem(str[i]);
			m[i].addActionListener(this);
		}
		mb.add(m1);
		mb.add(m2);

		m1.add(m[0]);
		m1.add(m[1]);
		m2.add(m[2]);
		m2.add(m[3]);

		setLayout(new BorderLayout());
		add(mb,BorderLayout.NORTH);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("Exit"))
		{
			System.exit(0);
		}
		else
		if(s.equals("Accept"))
		{
			x=Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
			y=Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
		}
		else 
		if(s.equals("GCD"))
		{
			int r=0;
			while(y!=0)
			{
				r=x%y;
				x=y;
				y=r;
				/*
				 * if(x>y)
				 *    x=x-y;
				 *    else
				 *    y=y-x;
				 */
			}
			JOptionPane.showMessageDialog(this,"GCD is "+x);
		}
		if(s.equals("Power"))
		{
			int res=1;
			for(int i=1;i<=y;i++)
			{
				res=res*x;
			}
			JOptionPane.showMessageDialog(this,"Power is "+res);
		}
									
	}																				 							
	
	public static void main(String arg[])
	{
		Slip22_1 c =new Slip22_1("My Computation");
		c.setSize(300,150);
		c.setVisible(true);
		c.setLocation(500,200);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}