package Controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BusinessLogic.BookLogic;

/**
 * Servlet implementation class InsertMemberController
 */
@WebServlet("/InsertMemberController")
public class InsertMemberController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public InsertMemberController()
	{
		super();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		//System.out.println("Insert Member Servlet");
		request.setCharacterEncoding("UTF-8"); // for suppoer farsi lang
		
		Common.Member m = new Common.Member();
		m.setMemberNO(request.getParameter("txtmno"));
		m.setName(request.getParameter("txtname"));
		m.setFamily(request.getParameter("txtfamily"));
		m.setAddress(request.getParameter("txtaddress"));
		m.setPhone(request.getParameter("txtphone"));
		m.setAge(Integer.parseInt(request.getParameter("txtage")));
		
		java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
		m.setMemdate(sqlDate);
		
		//System.out.println(m.toString());
		
		
		BookLogic bl = new BookLogic();
		bl.AddMember(m);
		
		
		response.sendRedirect("InsertMember.jsp?Ido=1");
		
		
		/*
		 * request.getSession().setAttribute("Books", BookEntity.selectAll());
		 * 
		 * response.sendRedirect("gLibUI/BookUI/InsertBook.jsp");
		 * 
		 * //System.out.println("OOKK");
		 */
	}
	
}
