import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorderFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			BorderFrame frame = new BorderFrame();
			frame.setTitle("BorderFrame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
