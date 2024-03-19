package edu.kh.project.controller;

import java.io.IOException;
import java.sql.SQLException;

import edu.kh.project.model.service.ProjectService;
import edu.kh.project.model.service.ProjectServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/project/update")
public class Update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			ProjectService service = new ProjectServiceImpl();
			
			String name = req.getParameter("h1");
			int total = Integer.parseInt(req.getParameter("total"));
			int person = Integer.parseInt(req.getParameter("person"));
			
			int m = service.sendDetail(name, total, person);
			
			String message = null;
			if(m > 0)  message = "성공적으로 예매 되었습니다";
			else       message = "실패입니다";
			
			req.getSession().setAttribute("message", message);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
