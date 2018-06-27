package com.neuedu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	//��ȡ���ݿ������
		public static Connection getConn(){
			Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://123.207.142.177:3306/dzd?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "root");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
		
		//��������
		public static void beginTransaction(Connection conn){
			try {
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//�ύ����
		public static void commit(Connection conn){
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//�ع�
		public static void rollback(Connection conn){
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//�ر�����
		public static void closeConn(Connection conn){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//�ر�PS
		public static void closePS(PreparedStatement ps){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public static void main(String []args) {
			getConn();
		}
}
