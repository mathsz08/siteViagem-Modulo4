package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destino;
import model.DestinoDAO;



@WebServlet("/lerPassagemServlet")
public class lerPassagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public lerPassagemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Destino> destinos = new ArrayList<Destino>();
		DestinoDAO destinoDAO = new DestinoDAO();
		
		destinos = destinoDAO.getDestinos();
		
		request.setAttribute("Destinos", destinos);
		RequestDispatcher rd = request.getRequestDispatcher("cadastrarPassagem.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

}
