//	slip no:- 13-1

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="slip13_1" width=100 height=100></applet>*/
public class slip13_1 extends Applet implements MouseListener, MouseMotionListener
{
	int x, y;
	String msg = " ";
	TextField tf1;

	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);

		tf1 = new TextField(20);
		add(tf1);
	}

	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}

	public void mouseClicked(MouseEvent me)
	{
		x = 10;
		y = 10;
		msg = "Mouse Clicked.";
		tf1.setText("" + me.getX() + ", " + me.getY());
		repaint();
	}

	public void mouseEntered(MouseEvent me)
	{
		x = 10;
		y = 10;
		msg = "Mouse Entered.";
		repaint();
	}

	public void mouseExited(MouseEvent me)
	{
		x = 10;
		y = 10;
		msg = "Mouse Exited.";
		repaint();
	}

	public void mousePressed(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg = "Mouse Pressed.";
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg = "Mouse Released.";
		repaint();
	}

	public void mouseDragged(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg = "*";
		showStatus("Dragging Mouse at: " + x + ", " + y);
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg = "I am Moving..";
		showStatus("Moving Mouse at: " + x + ", " + y);
		repaint();
	}
}
