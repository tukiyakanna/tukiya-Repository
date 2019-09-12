package updatepack;

public class DMcardUpdateMain
{
	public static void main (String [] args)
	{
		CheckFile cf = new CheckFile("newcard.txt");

		boolean exist = cf.check();
		if(exist==true)
		{
			Window w = new Window(800,600);
			w.setVisible(true);
		}
		else
		{
			ErrorWindow ew = new ErrorWindow("ファイルが存在しません",200,100);
			ew.setVisible(true);
		}
	}

}
