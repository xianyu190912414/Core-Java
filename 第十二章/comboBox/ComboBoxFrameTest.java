import java.awt.*;
import javax.swing.*;

public class ComboBoxFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			ComboBoxFrame frame = new ComboBoxFrame();
			frame.setTitle("ComboBoxFrame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
