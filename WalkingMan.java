import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class WalkingMan extends JComponent 
{
	private Ellipse2D.Double head;
	private Rectangle leftArm,rightArm,leftLeg,rightLeg,body;
	
	public WalkingMan(int x, int y)
	{
		this.setLocation(x,y);
		this.setSize(50,50);
		head = new Ellipse2D.Double(25,0,15,15);
		body = new Rectangle(30,15,5,18);
		leftArm = new Rectangle(20,16,25,5);
		leftLeg = new Rectangle(26,30,5,15);
		rightLeg = new Rectangle(35,30,5,15);
		
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(body);
		g2.fill(head);
		g2.fill(leftArm);
		g2.fill(leftLeg);
		g2.fill(rightLeg);
		g2.setColor(Color.BLUE);
	}
	
	


		
	

}
