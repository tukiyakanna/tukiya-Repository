package updatepack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateConnectStatement
{
	Statement stmt;
	Connection conn;

	String url,user,password;

	CreateConnectStatement()
	{
		url="";
		user="";
		password="";
	}

	Connection createconnection()
	{
		try//JDBCの指定
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e1)
		{

			e1.printStackTrace();
		}

		try//データベースに接続する
		{
			conn = DriverManager.getConnection(url,user,password);
		}
		catch(SQLException e)
		{
			System.out.println("con is null");
		}

		return conn;
	}

	Statement createstatement(Connection conn)
	{
		try
		{
			stmt = conn.createStatement();//ステートメントを作成する
		}

		catch (SQLException e)
		{
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return stmt;
	}

	void close()//接続をクローズする
	{
		try
		{
			conn.close();//接続切断
			stmt.close();//ステートメントをクローズ
		}
		catch (SQLException e)
		{
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
