package updatepack;

public class DataBaseUpdate
{
	/*
	 データベースに書くのされているデータの項目
	 card_id card_name card_reading card_race1~10 card_type1~2 card_cost card_color card_power power_plus break_shield card_race card_text
	 */

	CreateConnectStatement ccs;
	ReadCardText rct;

	DataBaseUpdate()
	{
		ccs = new CreateConnectStatement();
		rct = new ReadCardText();
	}
	
	
}
