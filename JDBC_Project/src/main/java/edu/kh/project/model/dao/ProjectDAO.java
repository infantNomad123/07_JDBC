package edu.kh.project.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.kh.project.model.dto.MovieBooking;

public interface ProjectDAO {

	List<MovieBooking> selectAll(Connection conn) throws SQLException;

	

	MovieBooking booking(Connection conn, int srNo) throws SQLException;








	int sendDetail(Connection conn, String name, int total, int person) throws SQLException;



	MovieBooking search(Connection conn, String keyword) throws SQLException;

}
