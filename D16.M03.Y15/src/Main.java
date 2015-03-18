

import java.awt.Color;

public class Main {
	public static void main(String[] args) {
		SetupMarqueeText text = 
				new SetupMarqueeText("What you want to scroll",Color.blue);
		MarqueeFrame frame = new MarqueeFrame(text);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
