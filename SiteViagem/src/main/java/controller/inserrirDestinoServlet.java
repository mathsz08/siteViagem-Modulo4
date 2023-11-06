package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destino;
import model.DestinoDAO;

/**
 * Servlet implementation class inserrirDestinoServlet
 */
@WebServlet("/inserrirDestinoServlet")
public class inserrirDestinoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inserrirDestinoServlet() {
        super();
        
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
		String cidade = request.getParameter("Cidade");
		String pais = request.getParameter("Pais");
		String aeroporto = request.getParameter("Aeroporto");
		
		Destino destino = new Destino();
		destino.setAeroporto(aeroporto);
		destino.setCidade(cidade);
		destino.setPais(pais);
		
		DestinoDAO destinoDAO = new DestinoDAO();
		destinoDAO.save(destino);
		
		response.sendRedirect("promocoes.jsp");
		
	}

}
