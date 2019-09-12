package updatepack;

public class DMcardUpdateMain
{
	public static void main (String [] args)
	{
		CreateConnectStatement ccs = new CreateConnectStatement();
		ReadCardText rct = new ReadCardText();
		CheckFile cf = new CheckFile("newcard.txt");
		
		boolean exist = cf.check();
		if(exist==true)
		{
			
		}
	}
	
}
