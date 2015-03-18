

import java.awt.Color;

public class SetupMarqueeText {
	/**
	 * @param marqueeText
	 * @param marqueeColor
	 */
	public SetupMarqueeText(String marqueeText, Color marqueeColor) {
		this.marqueeText = marqueeText;
		this.marqueeColor = marqueeColor;
	}

	String marqueeText;
	Color marqueeColor;
	/**
	 * @return the marqueeText
	 */
	public String getMarqueeText() {
		return marqueeText;
	}
	/**
	 * @return the marqueeColor
	 */
	public Color getMarqueeColor() {
		return marqueeColor;
	}
	
	protected String reverse(String text){
		StringBuffer temp = new StringBuffer(text);
		return temp.reverse().toString();
	}
	
	protected String hashCode(String text){
		return String.valueOf(text.hashCode());
	}
	
}
