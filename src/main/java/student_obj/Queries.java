package student_obj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionpool.jdbcconnection;

public class Queries {
	public void addStudent(int id,String name,String email,long phone_no) {
		Connection con=jdbcconnection.CreateConnection();
		String insert="INSERT INTO student1 values(?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(insert);
			pstm.setInt(1, id);
			pstm.setString(2, name);
			pstm.setString(3, email);
			pstm.setLong(4, phone_no);
			pstm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet viewStudent() {
		Connection con=jdbcconnection.CreateConnection();
		ResultSet res=null;
		try {
			Statement stm=con.createStatement();
			String fetch="select * from student1"; 
			res=stm.executeQuery(fetch);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	public void deleteStudent(int id) {
		Connection con=jdbcconnection.CreateConnection();
		try {
			String delete="delete from student1 where roll_no=?";
			PreparedStatement pstm=con.prepareStatement(delete);
			pstm.setInt(1, id);
			pstm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
