/**
 * @(#)fontdemo.java
 *
 *
 * @author 
 * @version 1.00 2011/2/19
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class fontdemo extends JFrame implements ItemListener
 {
   JLabel l1,l2,l3;
   Choice cfont,csize;
   JCheckBox cbold,citalic;
   JTextField t1;
   Font f;
    public fontdemo() 
    {
    	setVisible(true);
    	setSize(300,300);
    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	setLayout(null);
    	
    	l1=new JLabel("Font");
    	l2=new JLabel("Size");
    	l3=new JLabel("Style");
    	cfont=new Choice();
        csize=new Choice();
        cbold=new JCheckBox("Bold");
        citalic=new JCheckBox("Italic");
        
        t1=new JTextField(15);
        add(l1);
        add(l2);
        add(l3);
        add(cfont);
        add(csize);
        add(cbold);
        add(citalic);
        
        add(t1);
        l1.setBounds(10,10,50,20);
        cfont.setBounds(10,40,100,20);
        l2.setBounds(10,60,50,20);
        csize.setBounds(10,90,100,20);
        l3.setBounds(120,10,50,20);
        cbold.setBounds(120,40,80,20);
        citalic.setBounds(120,70,80,20);
        
        t1.setBounds(40,150,200,30);
        
        cbold.addItemListener(this);
        cfont.addItemListener(this);
        csize.addItemListener(this);
        citalic.addItemListener(this);
        
        
        cfont.add("Arial");
        cfont.add("Times New Roman");
        cfont.add("Monotype Corsiva");
         for(int i=10;i<50;i=i+2)
         {
           csize.add(String.valueOf(i));
         }
        
    }
    public void itemStateChanged(ItemEvent ie)
    {
    	if(ie.getSource()==cbold)
    	{
    		String s=cfont.getSelectedItem();
    		f=new Font(s,Font.BOLD,15); 
    		t1.setFont(f);
    	}
                 if(ie.getSource()==citalic)
    	{
    		String s=cfont.getSelectedItem();
    		f=new Font(s,Font.ITALIC,15); 
    		t1.setFont(f);
    	}
              
    } 
    public static void main(String args[])
    {
    	fontdemo f=new fontdemo();
    }
}