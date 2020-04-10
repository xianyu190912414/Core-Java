import javax.swing.*;

/**
 * A frame containing a panel for testing mouse operations
 * @version 1.10 2020-4-9
 * @author 19091
 *
 */

public class MouseFrame extends JFrame{
	public MouseFrame() {
		add(new MouseComponent());
		pack();
	}
}
