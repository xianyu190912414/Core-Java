import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a simple text label and radio buttons for selecting font size.
 * @version 2020-4-16
 * @author 19091
 *
 */

public class RadioButtonFrame extends JFrame{
	private JPanel buttonPanel;
	private ButtonGroup group;
	private JLabel label;
	private static final int DEFAULT_SIZE = 36;
	
	public RadioButtonFrame() {
		//add the sample text label.
		label = new JLabel("The quick brown fox jumps over the lazy dog.");
		label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
		add(label, BorderLayout.CENTER);
		
		//add the radio buttons
		buttonPanel = new JPanel();
		group = new ButtonGroup();
		
		addRadioButton("small", 8);
		addRadioButton("medium", 12);
		addRadioButton("large", 18);
		addRadioButton("Extra large", 36);
		
		add(buttonPanel, BorderLayout.SOUTH);
		setLocationByPlatform(true);
		pack();
	}
	
	/**
	 * Adds a radio button that sets the font size of the sample text.
	 * @param name the string to appear on the button
	 * @param size the font size that the button sets
	 */
	public void addRadioButton(String name, int size) {
		boolean selected = size == DEFAULT_SIZE;
		JRadioButton button = new JRadioButton(name, selected);
		group.add(button);
		buttonPanel.add(button);
		
		//this listener sets the label font size
		
		ActionListener listener  = event -> {
			 label.setFont(new Font("Serif", Font.PLAIN, size));
		};
		
		button.addActionListener(listener);
	}
}
