import java.util.Random;

import javax.swing.JFrame;

public class createpass {

	public static void main(String[] args)
	{
		Window ww = new Window();
		ww.setTitle("CreatePassWord");
		ww.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ww.setVisible(true);

		String[] str = {"1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
				"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","-","_"};

		int Length = 5;//パスワードの長さを決めてね
		String pass = "";
		Random rnd = new Random();
		int pos;
		for(int i = 0;i<Length;i++)
		{
			pass = pass + str[pos = rnd.nextInt(str.length)];
		}
		System.out.println("パスワードは:"+pass);
	}

}
