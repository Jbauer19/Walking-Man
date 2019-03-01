import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManFrame extends JFrame 
{
	public WalkingManFrame()
	{
		setLayout(null);
		setBounds(50,50,100,300);
		setName("Walking Man");
		WalkingMan man = new WalkingMan(50,50);
		add(man);
		this.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == KeyEvent.VK_UP)
				{
					setLocation(man.getX() ,man.getY() + 2);
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN)
				{
					setLocation(man.getX() ,man.getY() - 2);
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT)
				{
					setLocation(man.getX() - 2 ,man.getY());
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				{
					setLocation(man.getX() + 2 ,man.getY());
				}
				
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
		});
		
		Timer time = new Timer(10,new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				repaint();
			}

		});
			time.start();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new WalkingManFrame();
	}
	
	

}
