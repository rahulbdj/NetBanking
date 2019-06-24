
package application;
import java.sql.*;

public class dbconnection {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(
		"jdbc:mysql://remotemysql.com/gR2fa7dl4U?autoReconnect=true&useSSL=false","gR2fa7dl4U","H8196rO3po");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from banking");
		while(rs.next()){
			System.out.println(rs.getString(5));
		}
	}
		catch (Exception e) {
			// TODO: handle exception
		}

}
}
