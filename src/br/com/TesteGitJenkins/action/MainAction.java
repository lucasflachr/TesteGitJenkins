package br.com.TesteGitJenkins.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Classe responsável em controlar os eventos da tela principal.
 * 
 * @author Lucas
 * 
 */
public class MainAction extends HttpServlet {

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

			response.sendRedirect("main.jsp");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("main.jsp");
	}
}
