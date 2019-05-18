package ch.addr.model;

import java.sql.*;
import java.util.*;

import javax.naming.*;
import javax.sql.DataSource;

class AddrDAO {
	private DataSource ds;
	AddrDAO(){
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/myoracle");	
		}catch(NamingException ne) {	
		}
	}
	ArrayList<AddrDTO> select(){
		System.out.println("select()");
		ArrayList<AddrDTO> list = new ArrayList<AddrDTO>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = ds.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(AddrSQL.sqlS);
			while(rs.next()) {
				int seq = rs.getInt(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				java.sql.Date rdate = rs.getDate(4);
				AddrDTO dto = new AddrDTO(seq, name, addr, rdate);
				list.add(dto);
			}
			return list;
		}catch(SQLException se) {
			System.out.println("se: " + se);
			return null;
		}
	}
	void insert(AddrDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(AddrSQL.sqlI);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.executeUpdate();
		}catch(SQLException se) {}
	}
	void delete(int seq) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(AddrSQL.sqlD);
			pstmt.setInt(1, seq);
			pstmt.executeUpdate();
		} catch (SQLException se) {}
	}
}
