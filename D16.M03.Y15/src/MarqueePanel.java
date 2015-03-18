

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class MarqueePanel extends JPanel implements Runnable {
	/**
	 * This is the default constructor
	 */
	public MarqueePanel() {
		super();
		initialize();
	}

	private void initialize() {
		this.setSize(300, 200);
		this.setLayout(new GridBagLayout());
		x = getSize().width;
		y = getSize().height / 2;
		setDoubleBuffered(true);

	}
	
	Thread marqueeThread = null;
	String message;
	Color color;
	Font font = new Font("TimesRoman", Font.BOLD, 24);
	int x, y;


	public void start(SetupMarqueeText text) {
		message = text.getMarqueeText();
		color = text.getMarqueeColor();
		start();
	}

	protected void start(){
		if (marqueeThread == null)
		{
			marqueeThread = new Thread(this);
			marqueeThread.start();
		}
	}

	public void run(){
		while (true)
		{
			x = x - 5;
			if (x == 0)
				x = getSize().width;
			repaint();
			try
			{
				Thread.sleep(200);
			}
			catch (InterruptedException e)

			{

			}
		}
	}

	public void paint(Graphics g){
		super.paint(g);
		g.setFont(font);
		g.setColor(color);
		g.drawString(message, x, y);

	}
}
