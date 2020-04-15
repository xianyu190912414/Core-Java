import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.BorderLayout;

public class CalculatorPanelTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			CalculatorPaneFrame frame = new CalculatorPaneFrame();
			frame.setTitle("CalculatorPaneTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setLocationByPlatform(true);
		});
	}
}

class CalculatorPaneFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 900;
	private static final int DEFAULT_HEIGHT = 600;
	
	public CalculatorPaneFrame() {
		add(new CalculatorPanel(), BorderLayout.SOUTH);
		pack();
	}	
}
