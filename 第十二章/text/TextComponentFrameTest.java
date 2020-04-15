import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

public class TextComponentFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			TextComponentFrame frame = new TextComponentFrame();
			frame.setTitle("TextComponentFrame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
