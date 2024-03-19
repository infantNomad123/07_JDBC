package edu.kh.project.model.service;
import static edu.kh.project.common.JDBCTemplate.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.kh.project.model.dao.ProjectDAO;
import edu.kh.project.model.dao.ProjectDAOImpl;
import edu.kh.project.model.dto.MovieBooking;

public class ProjectServiceImpl implements ProjectService{
	
	private static ProjectDAO dao = new ProjectDAOImpl();

	@Override
	public List<MovieBooking> selectAll() throws SQLException {
		Connection conn = getConnection();
		List<MovieBooking> movies = dao.selectAll(conn);
		return movies;
	}


	@Override
	public MovieBooking booking(int srNo) throws SQLException {
		
		Connection conn =  getConnection();
		MovieBooking booking = dao.booking(conn, srNo);
		return booking;
		
		
	}


	@Override
	public int sendDetail(String name, int total, int person) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		int result = dao.sendDetail(conn,name, total,person);
		
		if(result > 0) commit(conn);
		else           rollback(conn);
		
	
		close(conn);
		return result;
	}


	@Override
	public MovieBooking search(String keyword) throws SQLException {
		Connection conn = getConnection();
		MovieBooking result = dao.search(conn, keyword);
		return result;
	}

	

}
