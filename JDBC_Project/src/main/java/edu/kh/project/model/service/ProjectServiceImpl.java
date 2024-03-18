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

	

}
