package com.MyController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.MyController.*;
import com.MyDAO.MyRegDAO;
import com.MyVO.MyRegVO;


@WebServlet("/MyRegController")
public class MyRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public MyRegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String flag=request.getParameter("flag");
		if(flag.equals("search"))
		{	
			search(request,response);
			response.sendRedirect("Search.jsp");
		}
	}


	private void search(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		List SearchList =new ArrayList<>();
		
		
		MyRegDAO regDAO = new MyRegDAO();
		SearchList =  regDAO.search();
	
		HttpSession session = request.getSession();
		session.setAttribute("SearchList", SearchList);
		
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String flag=req.getParameter("flag");
		if(flag.equals("insert"))
		{	
			insert(req,resp);
			resp.sendRedirect("Register.jsp");

		}
	}


	private void insert(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String Fn = req.getParameter("firstName");
		String Ln = req.getParameter("lastName");
		
		MyRegVO regVO = new MyRegVO();
		regVO.setFirstName(Fn);
		regVO.setLastName(Ln);
		
		MyRegDAO regDAO = new MyRegDAO();
		regDAO.insert(regVO);
		
	}
	
	
	

}
