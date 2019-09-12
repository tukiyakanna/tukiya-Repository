package updatepack;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ErrorWindow extends JFrame
{
	JPanel base;
	JLabel errorstring;

	ErrorWindow(String error,int x,int y)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((Toolkit.getDefaultToolkit().getScreenSize().width-x)/2,(Toolkit.getDefaultToolkit().getScreenSize().height-y)/2,x,y);
		add(base = new JPanel());
		base.add(errorstring = new JLabel(error));
	}
}
