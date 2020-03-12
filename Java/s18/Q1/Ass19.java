
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ass19 extends JFrame implements ActionListener,Runnable
{char ch;
    JButton b1; int j1;  Thread th; float c1=10,c2=10,c3=10;
   public JTextArea ta;int i=0;
    int cnt; int a,k,k1=0,pos[]= new int[100]; JTextField lab[]=new JTextField[1000];;
 JTextField osim;
 char chara[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};// extra than slip 5
   public Ass19()
   {  super("osim");
         setLayout(null);
         ta=new JTextArea();
         ta.setLayout(null);
         ta.setEditable(false);
         b1=new JButton("Start");
      
         ta.setBounds(50,50,30,500);
         
         b1.setBounds(95,250,100,30);
       
       add(ta);
   
        b1.addActionListener(this);
       
        add(b1);
     k=0;
      th= new Thread(this,"osim");
		th.start();

     
        setSize(230,650);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent ae)
    {
           String str;
           str=ae.getActionCommand();
           if(str.equals("Start"))
          {      
                    Random rs = new Random();
                   
                    a=rs.nextInt()%100;     
          
          if(a<0) a*=-1; // EXTRA than slip 5 these 3 lines
          a=a%26; // for getting index of alphabets that are from 0 to 25 (since 26 number of alphabets)
                     ch=chara[a];                            
                           
   osim= new JTextField(""+ch);
   osim.setEditable(false);
   osim.setOpaque(false);
	osim.setFont(new Font("",Font.BOLD,20));
	osim.setForeground(Color.getHSBColor(c1,c2,c3));	
				
    osim.setBounds(0,pos[k1++],100,20);
    ta.add(osim);    
    
    	add(ta);     //j+=20;
    	c1+=1.3f;	c2+=1.3f;	c3+=1.3f;
    	
    		if(k1-1>24)
    			{
    			 dispose();
    		    new Ass19().show(); 
    		    	
    			}          
          }
        
     }
   public void run()  {
  
   	
                        for(j1=0;j1<=480;j1+=20)
                        {
                               
                               pos[k++]=j1; 
                                
                        }
                        
                        
   	}
                        
                         
            
   
    public static void main(String args[])
        {
            new Ass19().show();      
        }
}

              