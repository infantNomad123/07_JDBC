package edu.kh.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static edu.kh.project.common.JDBCTemplate. *;

import edu.kh.project.model.dto.MovieBooking;
import edu.kh.project.model.service.ProjectService;
import edu.kh.project.model.service.ProjectServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("")
public class SelectAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProjectService service = new ProjectServiceImpl();
		
		
		try {
			List<MovieBooking> movies = service.selectAll();
			req.setAttribute("movies", movies);
			String path = "/index.jsp";
			req.getRequestDispatcher(path).forward(req,resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}	
