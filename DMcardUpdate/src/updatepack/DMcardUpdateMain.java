package updatepack;

public class DMcardUpdateMain
{
	public static void main (String [] args)
	{
		CheckFile cf = new CheckFile("newcard.txt");

		boolean exist = cf.check();
		if(exist==true)
		{
			CreateConnectStatement ccs = new CreateConnectStatement();
			ReadCardText rct = new ReadCardText();

		}
		else
		{
			ErrorWindow ew = new ErrorWindow("ファイルが存在しません");
			ew.setVisible(true);
		}
	}

}
