package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO implements AutoCloseable {

	private Connection con;
	private Users users;
	public UsersDAO() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//return list of users from db
	public List<Users> showAllUser() throws SQLException {
		List<Users> userList = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date sqlDate = rs.getDate("dob");
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					
					java.util.Date uDate=new java.util.Date(sqlDate.getTime());
					SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
					String dob=sdf.format(uDate);
					
					users=new Users(id,fname,lname,email,password,dob,status,role);
					userList.add(users);
				}
			}
		}
		return userList;
	}
	
	//update user by id
	public int updateUser(Users user) throws Exception
	{
		int cnt=-1;
		String sql="UPDATE users SET first_name=?,last_name=?,email=?,password=?,dob=?,status=?,role=? where id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			pstmt.setString(1,user.getFname());
			pstmt.setString(2, user.getLname());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4,user.getPassword());
			
			//Set date from string to sql date
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate=sdf.parse(user.getDob());
			java.sql.Date sDate=new java.sql.Date(uDate.getTime());
			pstmt.setDate(5, sDate);
			
			pstmt.setBoolean(6,user.getStatus());
			pstmt.setString(7,user.getRole());
			pstmt.setInt(8,user.getId());
			cnt=pstmt.executeUpdate();
		}
		return cnt;
	}
	
	//Insert into table
	public int insertUser(Users user) throws Exception
	{
		int rowsAffected=-1;
		String sql="INSERT INTO users VALUES(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt =con.prepareStatement(sql))
		{
			pstmt.setInt(1,user.getId());
			pstmt.setString(2,user.getFname());
			pstmt.setString(3, user.getLname());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5,user.getPassword());
			
			//Set date from string to sql date
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate=sdf.parse(user.getDob());
			java.sql.Date sDate=new java.sql.Date(uDate.getTime());
			pstmt.setDate(6, sDate);
			
			pstmt.setBoolean(7,user.getStatus());
			pstmt.setString(8,user.getRole());
			rowsAffected=pstmt.executeUpdate();
		}
		return rowsAffected;
	}
	
	//delete user from table
	public int deleteUser(int id) throws Exception
	{
		int rowsAffected=-1;
		String sql="DELETE FROM users WHERE id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setInt(1, id);
			rowsAffected=pstmt.executeUpdate();
		}
		return rowsAffected;
	}
}
