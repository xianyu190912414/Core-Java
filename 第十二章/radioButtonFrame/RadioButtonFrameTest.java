import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			RadioButtonFrame frame = new RadioButtonFrame();
			frame.setTitle("RadioButtonFrame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
