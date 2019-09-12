package updatepack;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ErrorWindow extends JFrame
{
	JPanel base;
	JLabel errorstring;

	ErrorWindow(String error)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width-500,Toolkit.getDefaultToolkit().getScreenSize().height-400,500,400);
		add(base = new JPanel());
		base.add(errorstring = new JLabel(error));
	}
}
