import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener
{
	JPanel [] panel;
	JTextField jtf;

	Window()
	{
		panel = new JPanel[2];
		setSize(500,500);
		setResizable(false);
		add(panel[0] = new JPanel());
		panel[0].setLayout(new  GridLayout(2,1));
		panel[0].add(panel[1] = new JPanel(),new GridLayout(1,2));
		panel[1].add(jtf = new JTextField(1));
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

	}

}
