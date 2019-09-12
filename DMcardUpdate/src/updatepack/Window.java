package updatepack;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener
{

	Window(int x,int y)
	{
		setBounds((Toolkit.getDefaultToolkit().getScreenSize().width/2)-x,(Toolkit.getDefaultToolkit().getScreenSize().height/2)-y,x,y);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO 自動生成されたメソッド・スタブ

	}

}
