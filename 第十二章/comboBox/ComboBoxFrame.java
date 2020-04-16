import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JComboBox.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * A frame with a sample text label and a combo box for selecting font face.
 * @version 1.10 2020-4-16
 * @author 19091
 *
 */

public class ComboBoxFrame extends JFrame {
	private JComboBox<String> faceCombo;
	private JLabel label;
	private static final int DEFAULT_SIZE = 24;
	
	public ComboBoxFrame() {
		//add the sample text label
		label = new JLabel("The quick brown fox jumps over the lazy dog.");
		label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
		add(label, BorderLayout.CENTER);
		setLocationByPlatform(true);
		
		//make a combox and add face names
		faceCombo = new JComboBox<>();
		faceCombo.addItem("Serif");
		faceCombo.addItem("SansSerif");
		faceCombo.addItem("Monospaced");
		faceCombo.addItem("Dialog");
		faceCombo.addItem("DialogInput");
		
		//the combo box listener changes the label font to the selected face name.
		faceCombo.addActionListener(event -> 
				label.setFont(new Font(faceCombo.getItemAt(faceCombo.getSelectedIndex()), 
						Font.PLAIN, DEFAULT_SIZE)));
		
		//add combo box to a panel at the frame's southern border
		//comboBox 和 button有一定的等效性
		JPanel comboPanel = new JPanel();
		comboPanel.add(faceCombo);
		add(comboPanel, BorderLayout.SOUTH);
		pack();
	}
}
