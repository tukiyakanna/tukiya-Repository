package updatepack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCardText
{
	File cardfile;
	BufferedReader br;

	int linecounter;

	String [] line;

	ReadCardText(String filepath)
	{
		cardfile = new File(filepath);
		try
		{
			br = new BufferedReader(new FileReader(cardfile));
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("ReadCardTextのBufferedReader作成エラー");
		}

		linecounter=0;
		try
		{
			while(br.readLine() != null)
			{
				linecounter++;
			}
		}
		catch (IOException e)
		{
			System.out.println("ReadCardTextのコンストラクタのreadLineでエラー");
		}
		line = new String[linecounter];
	}

	String[] card_data()
	{
		try
		{
			for(int i =0;(line[i] = br.readLine()) != null || i<line.length;i++){	}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.out.println("ReadCardRext-card_dataでエラー");
		}

		return line;
	}
}
