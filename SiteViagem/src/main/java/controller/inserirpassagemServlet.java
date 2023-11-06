package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destino;
import model.DestinoDAO;
import model.Passagem;
import model.PassagemDAO;

/**
 * Servlet implementation class inserirpassagemServlet
 */
@WebServlet("/inserirpassagemServlet")
public class inserirpassagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inserirpassagemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String companhia = request.getParameter("Companhia");
		String localPArtida = request.getParameter("LocalPartida");
		Double valor = Double.parseDouble(request.getParameter("Valor"));
		
		long millis=System.currentTimeMillis();  
		java.sql.Date dateIda = new java.sql.Date(millis);
		java.sql.Date dateVolta = new java.sql.Date(millis);
		
		Destino destino = DestinoDAO.getDestinoById(Integer.parseInt( request.getParameter("Destinos")));
	
		Passagem passagem = new Passagem();
		
		passagem.setCompanhia(companhia);
		passagem.setDataIda(dateIda);
		passagem.setDataVolta(dateVolta);
		passagem.setLocalPartida(localPArtida);
		passagem.setValor(valor);
		passagem.setDestino(destino);
		
		PassagemDAO passagemDAO = new PassagemDAO();
		passagemDAO.save(passagem);
		
		RequestDispatcher rd = request.getRequestDispatcher("promocoes.jsp");
		rd.forward(request, response);
	}

}
