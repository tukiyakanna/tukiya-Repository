import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener
{
	JPanel [] panel;
	JTextField jtf;
	JCheckBox pool_select;

	String[] A = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] num = {"1","2","3","4","5","6","7","8","9","0"};
	String[] a,pool;

	Window()
	{
		tolower();
		panel = new JPanel[3];
		setSize(300,200);
		setResizable(false);
		add(panel[0] = new JPanel());
		panel[0].setLayout(new  GridLayout(2,1));
		panel[0].add(panel[1] = new JPanel(),new GridLayout(1,4));
		panel[0].add(panel[2] = new JPanel(),new GridLayout(1,2));
		panel[1].add(jtf = new JTextField(2));
	}

	void tolower()
	{
		a = new String[A.length];
		for(int i = 0;i<A.length;i++)
		{
			a[i] = A[i].toLowerCase();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

	}

}
