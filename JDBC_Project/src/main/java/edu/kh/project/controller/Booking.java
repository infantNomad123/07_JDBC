package edu.kh.project.controller;

import java.io.IOException;

import edu.kh.project.model.dto.MovieBooking;
import edu.kh.project.model.service.ProjectService;
import edu.kh.project.model.service.ProjectServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/project/booking")
public class Booking extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProjectService service = new ProjectServiceImpl();
		
		try {
			int srNo = Integer.parseInt(req.getParameter("srNo"));
			
			MovieBooking movie =service.booking(srNo);
			
			req.setAttribute("movie", movie);
			String path = "/WEB-INF/views/booking.jsp";
			req.getRequestDispatcher(path).forward(req,resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
