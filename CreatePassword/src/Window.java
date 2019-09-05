import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener
{
	JPanel [] panel;
	
	Window()
	{
		panel = new JPanel[2];
		setSize(500,500);
		setResizable(false);
		
		add(panel[0] = new JPanel(),new GridLayout(2,1));
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

	}

}
