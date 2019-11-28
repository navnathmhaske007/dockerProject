package com.simple.webapp;

import javax.servlet.http.HttpServlet;

@WebServlet("/hello")
public class SimpleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		resp.getWriter().write("Hello World! Maven Web Project Example.");
	}
}
