import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * A frame with a panel that demonstrates color change actions.
 * @version 1.10 2020-4-8
 * @author 19091
 *
 */

public class ActionFrame extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public ActionFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		buttonPanel = new JPanel();
		
		//define actions
		Action yellowAction = new ColorAction("Yellow", new ImageIcon("yellow-ball.gif"), Color.YELLOW);
		Action blueAction = new ColorAction("blue", new ImageIcon("blue-ball.gif"), Color.BLUE);
		Action redAction = new ColorAction("Red", new ImageIcon("red-ball.gif"), Color.RED);
		
		//add buttons for these actions
		buttonPanel.add(new JButton(yellowAction));
		buttonPanel.add(new JButton(blueAction));
		buttonPanel.add(new JButton(redAction));
		
		//add panel to frame
		add(buttonPanel);
		
		//associate the Y, B and R keys with names
		InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
		imap.put(KeyStroke.getKeyStroke("ctrl B"), "panel.blue");
		imap.put(KeyStroke.getKeyStroke("ctrl R"), "panel.red");
		
		//associate the names with the actions 
		ActionMap amap = buttonPanel.getActionMap();
		amap.put("panel.yellow", yellowAction);
		amap.put("panel.blue", blueAction);
		amap.put("panel.red", redAction);
		
	}
	
	public class ColorAction extends AbstractAction {
		/**
		 * Construction a color action
		 * @param name the name to show on the button
		 * @param icon the icon to distplay on the button
		 * @param c the background color
		 */
		public ColorAction(String name, Icon icon, Color c) {
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "Set panel color to " + name.toLowerCase());
			putValue("color", c);
		}
		
		public void actionPerformed(ActionEvent event) {
			Color c = (Color)getValue("color");
			buttonPanel.setBackground(c);
		}
	}
}
