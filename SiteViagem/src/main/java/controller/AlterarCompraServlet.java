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
import javax.servlet.http.HttpSession;

import model.Compras;
import model.ComprasDAO;
import model.Destino;
import model.DestinoDAO;
import model.Passagem;
import model.PassagemDAO;
import model.Usuario;

/**
 * Servlet implementation class AlterarCompraServlet
 */
@WebServlet("/AlterarCompraServlet")
public class AlterarCompraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarCompraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PassagemDAO passagemDAO = new PassagemDAO();
		String passagem =  (String) request.getAttribute("Passagem");
		System.out.println(passagem);
		List<Destino> destinos = new ArrayList<Destino>();
		DestinoDAO destinoDAO = new DestinoDAO();
		
		destinos = destinoDAO.getDestinos();
		
		request.setAttribute("Destinos", destinos);
		
		request.setAttribute("Passagem", passagem);
		RequestDispatcher rd = request.getRequestDispatcher("alterarCompra.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Compras compra = new Compras();
		Double valor = Double.parseDouble(request.getParameter("Valor"));
		HttpSession session = request.getSession();
		
		
		compra.setValorTotal(valor);
		System.out.println(request.getAttribute("Passagem"));
		//compra.setPassagem(passagem);
		compra.setUsuario((Usuario)session.getAttribute("Usuario"));
		long millis=System.currentTimeMillis();  
		java.sql.Date data = new java.sql.Date(millis);
		
		compra.setDataCompra(data);
		ComprasDAO comprasDAO = new ComprasDAO();
		//comprasDAO.update(compra);
		
	}

}
