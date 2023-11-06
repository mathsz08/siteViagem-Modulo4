package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Compras;
import model.ComprasDAO;
import model.Passagem;
import model.PassagemDAO;
import model.Usuario;
import model.UsuarioDAO;

/**
 * Servlet implementation class InserirCompraServlet
 */
@WebServlet("/InserirCompraServlet")
public class InserirCompraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirCompraServlet() {
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
		
		
		PassagemDAO passagemDao = new PassagemDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		HttpSession session = request.getSession();
		
		Passagem passagem = passagemDao.getPassagemById(Integer.parseInt(request.getParameter("idPassagem")));
		
		Compras compra = new Compras();
		compra.setPassagem(passagem);
		compra.setUsuario((Usuario)session.getAttribute("Usuario"));
		compra.setValorTotal(passagem.getValor());
		
		long millis=System.currentTimeMillis();  
		java.sql.Date data = new java.sql.Date(millis);
		
		compra.setDataCompra(data);
		
		ComprasDAO comprasDAO = new ComprasDAO();
		comprasDAO.save(compra);
		
		doGet(request, response);
	}

}
