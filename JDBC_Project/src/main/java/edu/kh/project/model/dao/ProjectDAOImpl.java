package edu.kh.project.model.dao;
import static edu.kh.project.common.JDBCTemplate.*;

import java.sql.Statement;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.project.model.dto.MovieBooking;


public class ProjectDAOImpl implements ProjectDAO {
	public static PreparedStatement pstmt;
	public static Statement stmt;
	public static ResultSet rs;
	
	public static Properties prop;
	public ProjectDAOImpl() {
		try {
			 prop = new Properties();
			
			String path =ProjectDAOImpl.class.getResource("/edu/kh/project/sql/sql.xml").getPath() ;
			prop.loadFromXML(new FileInputStream(path));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public List<MovieBooking> selectAll(Connection conn) throws SQLException{
		List<MovieBooking> movieLists = new ArrayList<MovieBooking>();
		
		try {
			String sql = prop.getProperty("selectAll");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("NAME");
				int price = rs.getInt("PRICE");
				int ratings = rs.getInt("RATING");
				int sr_no = rs.getInt("SR_NO");
				
				MovieBooking movies = new MovieBooking(name, price, ratings, sr_no);
				
				movieLists.add(movies);
			}
			
		}finally{
			close(rs);
			close(stmt);
		}
		return movieLists;
		
	}

	@Override
	public MovieBooking booking(Connection conn, int srNo) throws SQLException {
		// TODO Auto-generated method stub
		MovieBooking mb = null;
		try {
			String sql = prop.getProperty("getBooking");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, srNo);
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				  mb = new MovieBooking();
				  mb.setName(rs.getString("NAME"));
				  mb.setPrice(rs.getInt("PRICE"));
				  mb.setRatings(rs.getInt("RATING"));
				  mb.setSr_no(rs.getInt("SR_NO"));
			}
			
		
		}finally {
			
			close(pstmt);
		}
		
		return mb;
	}

	
	

}
