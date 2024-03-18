package edu.kh.project.model.service;

import java.sql.SQLException;
import java.util.List;

import edu.kh.project.model.dto.MovieBooking;

public interface ProjectService {

	List<MovieBooking> selectAll() throws SQLException;

	MovieBooking booking(int srNo) throws SQLException;



}
