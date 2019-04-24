package com.infotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

/**
 * Servlet implementation class ServletPersonne
 */
@WebServlet(description = "Hi mom!", urlPatterns = { "/ServletPersonne" })
public class ServletPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Iservice service = new ServiceImpl();  // pour appeler la couche service
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPersonne() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int age = Integer.parseInt(request.getParameter("age"));

		// 2) envoi a la couche service
		Personne p = new Personne();
		p.setId(id);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAge(age);
		String message = service.creerPersonne(p);
		System.out.println(message);
		
		request.setAttribute("usrMsg", message);
//		request.setAttribute("leid", id);
//		request.setAttribute("lenom", nom);
//		request.setAttribute("leage", age);
		request.getRequestDispatcher("resForm.jsp").forward(request, response);
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
