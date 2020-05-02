import java.awt.BorderLayout;

import javax.swing.*;



public class ColorChooserPanelTest {
	public static void main(String[] args) {
		ColorChooserFrame frame = new ColorChooserFrame();
		frame.setTitle("ImageViewerFrameTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class ColorChooserFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	private JPanel panel;
	
	public ColorChooserFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		panel = new ColorChooserPanel();
		add(panel);
	}
}
