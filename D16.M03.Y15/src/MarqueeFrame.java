

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;

public class MarqueeFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JPanel marqueePane = null;

	/**
	 * This is the default constructor
	 */
	public MarqueeFrame(SetupMarqueeText text) {
		super();
		initialize(text);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize(SetupMarqueeText text) {
		this.setSize(600, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		((MarqueePanel)getMarqueePane()).start(text);
	}

	/**
	 * This method initializes jContentPane
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());			
			jContentPane.add(getMarqueePane(), BorderLayout.CENTER);
			
		}
		return jContentPane;
	}

	/**
	 * This method initializes marqueePane	
	 */
	private JPanel getMarqueePane() {
		if (marqueePane == null) {
			try {
				marqueePane = new MarqueePanel();
				marqueePane.setLayout(new GridBagLayout());
			} catch (java.lang.Throwable e) {
				// TODO: Something
			}
		}
		return marqueePane;
	}	
}
