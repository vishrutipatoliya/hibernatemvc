package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;

import org.hibernate.Session;

import com.entity.Note;
import com.helper.FactoryProvider;



@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SaveNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				String title =request.getParameter("title");
				String content =request.getParameter("content");
				Note note = new Note(title,content, new Date());
				System.out.println(note.getId()+" "+note.getTitle());
				Session s = FactoryProvider.getFactory().openSession();
				Transaction tx = s.beginTransaction();
				s.save(note);
				tx.commit();
				s.close();
				
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<h1>note is added</h1>");
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
