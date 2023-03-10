package och01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuGu
 */
//@WebServlet("/GuGu") // xml에서도 설정가능.
public class GuGu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuGu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. parameter -> num
		// 2. 구구다 출력 
		int num = Integer.parseInt(request.getParameter("gugu"));
		request.setCharacterEncoding("utf-8"); // html에 한글이 없으면 생략가능
		response.setContentType("text/html;charset=utf-8");// java파일(서블릿)에 한글이 없으면 생략 
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1>%d단</h1>", num);
		for(int i = 0; i<=9; i++) {
			out.printf("%d x %d = %d<br>", num, i,(num*i));
		}
		out.println("</html></body>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
