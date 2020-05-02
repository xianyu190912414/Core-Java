import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;  

import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import 第十二章gridBag.GBC;

/**
 * A frame uses a group layout to arrange font selection components.
 * @version 1.10 2020-4-21
 * @author 19091
 *
 */
public class FontFrame extends JFrame {
	public static final int TEXT_ROWS = 10;
	public static final int TEXT_COLUMNS = 20;
	
	private JComboBox<String> face;
	private JComboBox<Integer> size;
	private JCheckBox bold;
	private JCheckBox italic;
	private JTextArea sample;
	private JScrollPane pane;
	
	
	public FontFrame() {
		
		ActionListener listener = event -> updateSample();
		
		//construct components
		JLabel faceLabel = new JLabel("Face:");
		face = new JComboBox<>(new String[] {"Serif", "SansSerif", 
				"Monospaced", "Dialog", "DialogInput"});
		face.addActionListener(listener);
		
		JLabel sizeLabel = new JLabel("Size:");
		size = new JComboBox<>(new Integer[] {8, 10, 12, 15, 18, 24, 36, 48});
		
		size.addActionListener(listener);
		
		bold = new JCheckBox("Bold");
		bold.addActionListener(listener);
		
		italic = new JCheckBox("Italic");
		italic.addActionListener(listener);
		
		sample = new JTextArea(TEXT_ROWS, TEXT_COLUMNS);
		sample.setText("The quick brown fox jumps over the lazy dog.");
		sample.setEditable(false);
		sample.setLineWrap(true);
		sample.setBorder(BorderFactory.createEtchedBorder());
		
		pane = new JScrollPane(sample);
		
		GroupLayout layout = new GroupLayout(getContentPane());
		setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
								GroupLayout.Alignment.TRAILING, 
								layoutcreateSequentialGroup().addGroup(
										layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(faceLabel).addComponent(sizeLabel))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)))
						.addComponent(italic).addComponent(bold).addPreferredGap(
								LayoutStyle.ComponentPlacement.RELATED).addComponent(pane)
						.addContainerGap()));
	}	
	public void updateSample() {
		String fontFace = (String) face.getSelectedItem();
		int fontStyle = (bold.isSelected() ? Font.BOLD : 0) + (italic.isSelected() ? Font.ITALIC : 0);
		int fontSize = size.getItemAt(size.getSelectedIndex());
		Font font = new Font(fontFace, fontStyle, fontSize);
		sample.setFont(font);
		sample.repaint();
	}
}
