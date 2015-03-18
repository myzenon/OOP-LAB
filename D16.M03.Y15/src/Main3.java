import java.awt.*;

/**
 * Created by Zenon on 16/3/2558.
 */
public class Main3 {
    public static void main(String[] args) {
        SetupMarqueeText text =
                new SetupMarqueeText("What you want to scroll", Color.red);
        SetupMarqueeText rText = new SetupMarqueeText(text.hashCode("What you want to scroll"),Color.black);
        MarqueeFrame frame = new MarqueeFrame(rText);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
