package kr.co.gdu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		String key = request.getParameter("key");
		
		Calculator calc = new Calculator();
//		int result = clac.add(a, b);
		int result = 0;
		
		switch (key) {
			case "add":
				result = calc.add(a, b);
				break;
			case "subtract":
				result = calc.substract(a, b);
			case "multiply":
				result = calc.multiply(a, b);
			case "divide":
				result = calc.divide(a, b);
		}
		
		System.out.println("result: "+result);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		doGet(request, response);
	}
}
