package com.js.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.js.Entity.Pserson;


public class JdbcDemo {
	static Connection conn = null;
	static ResultSet rs = null;
	static PreparedStatement statement = null;
	public static String driver="com.mysql.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/test";
	public static String username="root";
	public static String password="123456";
	public static String sql="select * from person";
	static Pserson person;
	public static void main(String args[]){
		try {
			person = new Pserson();
			/*加载驱动*/
			System.out.println("加载数据库驱动...");
			Class.forName(driver);
			System.out.println("驱动加载成功...");
			System.out.println("连接数据库中...");
			/*连接数据库*/
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("数据库连接成功...");
			System.out.println("创建预编译SQL查询对象...");
			/*创建SQL对象*/
			statement = conn.prepareStatement(sql);
			System.out.println("预编译SQL查询对象创建成功...");
			System.out.println("执行查询...");
			rs = statement.executeQuery();
			System.out.println("查询成功，执行遍历输出，数据为：");
			while(rs.next()){
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				person.setScore(rs.getDouble("score"));
				person.setSex(rs.getString("sex"));
				person.setId(rs.getInt("id"));
				System.out.println(person.toString());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			/*断开数据库连接*/
				try {
					if (rs != null){
						rs.close();
					}
					if (statement != null){
						statement.close();
					}
					if (conn != null){
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}
	}
}
