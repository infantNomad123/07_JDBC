package edu.kh.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import edu.kh.project.model.dto.MovieBooking;
import edu.kh.project.model.service.ProjectService;
import edu.kh.project.model.service.ProjectServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/project/search")
public class SearchMovies extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProjectService service = new ProjectServiceImpl();
		
		
		try {
			String keyword = req.getParameter("keyword");
			
			
			MovieBooking mb = service.search(keyword);
			String path = "/WEB-INF/views/search.jsp";
			req.setAttribute("name", keyword);
		
			
			req.getRequestDispatcher(path).forward(req,resp);
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
