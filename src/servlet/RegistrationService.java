package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentBean;
import service.StudentService;

@WebServlet("/register")
public class RegistrationService extends HttpServlet {
	private StudentService service;

	@Override
	public void init() throws ServletException {
		service = new StudentService();
	};

	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get input
		StudentBean input = new StudentBean();
		input.setFirstName(req.getParameter("firstName"));
		input.setLastName(req.getParameter("lastName"));
		
		try {
			service.registerStudent(input);
			req.setAttribute("register", service.getRegister());
			req.setAttribute("student", input);
			RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/overview.jsp");
			dis.forward(req, resp);
		} catch (Exception e) {
			req.setAttribute("exception", e);
			RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/displayError.jsp");
			dis.forward(req, resp);
		}
		
	}

}
