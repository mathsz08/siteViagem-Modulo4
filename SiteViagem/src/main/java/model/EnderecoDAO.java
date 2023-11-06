package model;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Conexao;
import model.Endereco;





public class EnderecoDAO {
	public void save(Endereco endereco) {
		String sql = "INSERT INTO Endereco(Id_endereco, Cep, Pais, Cidade, Bairro, Rua, Numero)" + " VALUES(?,?,?,?,?,?,?)";
		
		Connection conn= null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, endereco.getIdEndereco());
			pstm.setString(2, endereco.getCep());
			pstm.setString(3, endereco.getPais());
			pstm.setString(4, endereco.getCidade());
			pstm.setString(5, endereco.getBairro());
			pstm.setString(6, endereco.getRua());
			pstm.setInt(7, endereco.getNumero());
			
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
		String sql = "REMOVE from Endereco WHERE Id_endereco = ?";
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

	public void update(Endereco endereco) {
		String sql = "UPDATE Endereco SET Cep = ?, Pais = ?, Cidade = ?, Bairro = ?, Rua = ?, Numero = ? " + "WHERE Id_endereco = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, endereco.getCep());
			pstm.setString(2, endereco.getPais());
			pstm.setString(3, endereco.getCidade());
			pstm.setString(4, endereco.getBairro());
			pstm.setString(5, endereco.getRua());
			pstm.setInt(6, endereco.getNumero());
			pstm.setInt(7, endereco.getIdEndereco());
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

	public List<Endereco> getEnderecos(){
		String sql = "SELECT * FROM Endereco";
		List<Endereco> enderecos = new ArrayList<Endereco>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Endereco endereco = new Endereco();
				
				endereco.setCep(rset.getString("Cep"));
				endereco.setPais(rset.getString("Pais"));
				endereco.setCidade(rset.getString("Cidade"));
				endereco.setBairro(rset.getString("Bairro"));
				endereco.setRua(rset.getString("Rua"));
				endereco.setNumero(rset.getInt("Numero"));
				enderecos.add(endereco);
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
		return enderecos;
	}

	public static Endereco getEnderecoById(int id) {
		String sql = "SELECT * from Endereco WHERE Id_endereco = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		Endereco endereco = new Endereco();
		
		try {
			
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				
				
				endereco.setCep(rs.getString("Cep"));
				endereco.setPais(rs.getString("Pais"));
				endereco.setCidade(rs.getString("Cidade"));
				endereco.setBairro(rs.getString("Bairro"));
				endereco.setRua(rs.getString("Rua"));
				endereco.setNumero(rs.getInt("Numero"));
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
		return endereco;
	}
}
