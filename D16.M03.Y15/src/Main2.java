import java.awt.*;

/**
 * Created by Zenon on 16/3/2558.
 */
public class Main2 {
    public static void main(String[] args) {
        SetupMarqueeText text =
                new SetupMarqueeText("What you want to scroll", Color.red);
        SetupMarqueeText rText = new SetupMarqueeText(text.reverse("What you want to scroll"),Color.red);
        MarqueeFrame frame = new MarqueeFrame(rText);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
