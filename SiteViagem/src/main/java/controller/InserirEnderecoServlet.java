package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Endereco;
import model.EnderecoDAO;
import model.PassagemDAO;
import model.Usuario;
import model.UsuarioDAO;


@WebServlet("/CadastroEndereco")
public class InserirEnderecoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public InserirEnderecoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String cep = request.getParameter("Cep");
		String pais = request.getParameter("Pais");
		String cidade = request.getParameter("Cidade");
		String bairro = request.getParameter("Bairro");
		String rua = request.getParameter("Rua");
		int numero = Integer.parseInt(request.getParameter("Numero"));
		
		Endereco endereco = new Endereco();
		
		endereco.setCep(cep);
		endereco.setPais(pais);
		endereco.setCidade(cidade);
		endereco.setBairro(bairro);
		endereco.setRua(rua);
		endereco.setNumero(numero);
		
		int rg = Integer.parseInt(request.getParameter("Rg"));
		String Nome = request.getParameter("Nome");
		String login = request.getParameter("Login");
		String senha = request.getParameter("Senha");
		String cpf = request.getParameter("Cpf");
		long millis=System.currentTimeMillis();  
		      
		java.sql.Date date = new java.sql.Date(millis);
		
		Usuario usuario = new Usuario();
		usuario.setRg(rg);
		usuario.setNome(Nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setCpf(cpf);
		usuario.setDataNascimento(date);
		usuario.setEndereco(endereco);
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		enderecoDAO.save(endereco);
		usuarioDAO.save(usuario);
		PassagemDAO passagemDAO = new PassagemDAO();
		request.setAttribute("Usuario", usuario);
		RequestDispatcher rd = request.getRequestDispatcher("promocoes.jsp");
		HttpSession session = request.getSession();
		session.setAttribute("Usuario", usuario);
		session.setAttribute("Passagens", passagemDAO.getPassagem());
		rd.forward(request, response);
		//response.sendRedirect("Cadastro.jsp");
	}

}
