package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	private static MemberDao instance;
	private MemberDao() {}
	
	public static MemberDao getInstance() {
		if(instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public int idfind(String m_name, String m_email) throws SQLException {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select m_name, m_email from member where m_name=? and m_email=?";
		System.out.println("m_name->" + m_name);
		System.out.println("m_email ->" + m_email);
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m_name);
			pstmt.setString(2, m_email);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String dbname = rs.getString(1);
				String dbemail = rs.getString(2);
				System.out.println("check m_name ->" + dbname);
				System.out.println("check m_email ->" + dbemail);
				if(dbname.equals(m_name) && dbemail.equals(m_email)) {
					result = 1; 
					
				}  else {
					result = 0; 
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
		}
		
		System.out.println("result ->" + result);
		return result;
	}	
	
	public String idGet(String m_name, String m_email) throws SQLException {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select m_id from member where m_name=? and m_email=?";
		ResultSet rs = null;
		String m_id = "";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m_name);
			pstmt.setString(2, m_email);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				m_id = rs.getString(1);
				System.out.println("m_id->" + m_id);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
		}
		
		System.out.println("result ->" + result);
		return m_id;
	}

}