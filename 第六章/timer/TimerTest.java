/**
 * @version 1.10 2020-1-23 
 * @author Administrator
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
//to resolve conflict with java.util.Timer.

public class TimerTest {
	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		
		//construct a timer that calls listener
		//once every 10 seconds
		Timer t = new Timer(3000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("At the tone, the time is " + new Date());
		//System.out.println("你是一个大傻瓜！！");
		Toolkit.getDefaultToolkit().beep();
	}
}
