package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBTesting1 {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="test";
		String DBdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="krishna";
		Class.forName(DBdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,userName,password);
		
		PreparedStatement psmt=conn.prepareStatement("select * from emp where deptno=? and sal>?");
		psmt.setString(1,"20");
		psmt.setString(2,"2000");
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=8;i++)
			{
				System.out.print(rs.getString(i)+"   ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
