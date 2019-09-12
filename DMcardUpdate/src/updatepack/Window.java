package updatepack;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener
{
	JPanel base,buttonp;
	JLabel[] label;
	JButton[] button;
	CreateConnectStatement css;
	ReadCardText rct;

	Window(int x,int y)
	{
		setBounds((Toolkit.getDefaultToolkit().getScreenSize().width-x)/2,(Toolkit.getDefaultToolkit().getScreenSize().height-y)/2,x,y);
		label = new JLabel[3];
		button = new JButton[2];
		add(base = new JPanel(),new GridLayout(2,1));
		base.add(label[0] = new JLabel("<html>更新データがあります<br>更新しますか?</html>"));
		label[0].setHorizontalAlignment(JLabel.CENTER);
		add(buttonp = new JPanel(),new GridLayout(1,2));
		buttonp.add(button[0] = new JButton("YES"));
		buttonp.add(button[1] = new JButton("NO"));
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO 自動生成されたメソッド・スタブ

	}

}
