import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * A sample  modal dialog that plays a message and waits for the user to click the OK button.
 * @version 1.10 2020-4-22
 * @author 19091
 *
 */
public class AboutDialog extends JDialog {
	public AboutDialog(JFrame owner) {
		super(owner, "About DialogTest", true);
		
		//add HTML label to center
		add(
				new JLabel(
						"<html><h1><i>Core Java</i></h1><hr>By Cay Horstman</html>"), 
				BorderLayout.CENTER);
		
		//OK button closes the dialog
		JButton ok = new JButton("OK");
		ok.addActionListener(event -> setVisible(false));
		
		//add OK button to south border
		JPanel panel = new JPanel();
		panel.add(ok);
		add(panel, BorderLayout.SOUTH);	
		
		pack();
	}
}
