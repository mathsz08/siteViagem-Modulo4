package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Conexao;
import model.Usuario;



public class UsuarioDAO {
	public void save(Usuario usuario) {
		String sql = "INSERT INTO Usuario(Rg,Nome,Login,Senha,Data_Nasc,Cpf,Fk_endereco)" + " VALUES(?,?,?,?,?,?,?)";
		
		Connection conn= null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, usuario.getRg());
			pstm.setString(2, usuario.getNome());
			pstm.setString(3, usuario.getLogin());
			pstm.setString(4, usuario.getSenha());
			pstm.setDate(5,new Date(usuario.getDataNascimento().getTime()));
			pstm.setString(6, usuario.getCpf());
			pstm.setInt(7, usuario.getEndereco().getIdEndereco());
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!= null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void removeById(int id) {
		String sql = "REMOVE from Usuario WHERE Rg = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm!= null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(Usuario usuario) {
		String sql = "UPDATE Usuario SET Login = ?, Senha = ?, Cpf = ?, Data_Nasc = ?, Nome = ?, Fk_endereco = ?" + "WHERE Rg = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getLogin());
			pstm.setString(3, usuario.getSenha());
			pstm.setDate(4,new Date(usuario.getDataNascimento().getTime()));
			pstm.setString(5, usuario.getCpf());
			pstm.setInt(6, usuario.getEndereco().getIdEndereco());
			pstm.setInt(7, usuario.getRg());
			pstm.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Usuario> getUsarios(){
		String sql = "SELECT * FROM Usuario";
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Usuario usuario = new Usuario();
				usuario.setRg(rset.getInt("Rg"));
				usuario.setNome(rset.getString("Nome"));
				usuario.setLogin(rset.getString("Login"));
				usuario.setSenha(rset.getString("Senha"));
				usuario.setDataNascimento(rset.getDate("Data_Nasc"));
				usuario.setCpf(rset.getString("Cpf"));
				usuario.setEndereco(EnderecoDAO.getEnderecoById(rset.getInt("Fk_endereco")));
				usuarios.add(usuario);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return usuarios;
	}
	
	public static Usuario getUsuarioById(int id) {
		String sql = "SELECT * from Usuario WHERE Rg = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		Usuario usuario = new Usuario();
		
		try {
			
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				
				
				usuario.setRg(rs.getInt("Rg"));
				usuario.setNome(rs.getString("Nome"));
				usuario.setLogin(rs.getString("Login"));
				usuario.setSenha(rs.getString("Senha"));
				usuario.setDataNascimento(rs.getDate("Data_Nasc"));
				usuario.setCpf(rs.getString("Cpf"));
				usuario.setEndereco(EnderecoDAO.getEnderecoById(rs.getInt("Fk_endereco")));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			
			try {
				if(pstm!= null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return usuario;
	}
}

