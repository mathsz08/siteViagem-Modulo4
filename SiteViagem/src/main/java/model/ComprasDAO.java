package model;



import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import model.Compras;


public class ComprasDAO {
	public void save(Compras compras) {
		String sql = "INSERT INTO Compras( Fk_passagem, Fk_usuario, Valor_total, Data_compra) VALUES(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
				
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, compras.getPassagem().getIdPassagem());
			pstm.setInt(2, compras.getUsuario().getRg());
			pstm.setDouble(3, compras.getValorTotal());
			pstm.setDate(4, compras.getDataCompra());
			pstm.execute();
		} catch(Exception e) {
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

	public void removeById(int id_passagem,int id_usuario) {
		String sql = "DELETE from Compras WHERE Fk_passagem = ? AND Fk_usuario = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id_passagem);
			pstm.setInt(2, id_usuario);
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
	
	public void update(Compras compras) {
		String sql = "UPDATE Compras SET Valor_total = ?, Data_compra = ?" + "WHERE Fk_passagem = ? AND Fk_usuario = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(3, compras.getPassagem().getIdPassagem());
			pstm.setInt(4, compras.getUsuario().getRg());
			pstm.setDouble(1, compras.getValorTotal());
			pstm.setDate(2, compras.getDataCompra());
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
	
	public List<Compras> getCompras(){
		String sql = "SELECT * FROM Compras";
		List<Compras> comprasList = new ArrayList<Compras>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Compras compras = new Compras();
				compras.setPassagem(PassagemDAO.getPassagemById(rset.getInt("Fk_passagem")));
				compras.setUsuario(UsuarioDAO.getUsuarioById(rset.getInt("Fk_usuario")));
				compras.setDataCompra(rset.getDate("Data_compra"));
				compras.setValorTotal(rset.getDouble("Valor_total"));
				comprasList.add(compras);
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
		return comprasList;
	}
	
	public List<Compras> getComprasByUser(int Rg){
		String sql = "SELECT * FROM Compras WHERE Fk_usuario = ?";
		List<Compras> comprasList = new ArrayList<Compras>();
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, Rg);
			ResultSet rset = pstm.executeQuery();
			while(rset.next()) {
				Compras compras = new Compras();
				System.out.println("-------------------------------" + Rg);
				compras.setPassagem(PassagemDAO.getPassagemById(rset.getInt("Fk_passagem")));
				compras.setUsuario(UsuarioDAO.getUsuarioById(rset.getInt("Fk_usuario")));
				compras.setDataCompra(rset.getDate("Data_compra"));
				compras.setValorTotal(rset.getDouble("Valor_total"));
				comprasList.add(compras);
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
		return comprasList;
	}
	
	
	public static Compras getComprasById(int id_passagem,int id_usuario) {
		String sql = "SELECT * from Compras WHERE Fk_passagem = ? AND Fk_usuario = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		Compras compras = new Compras();
		try {
			
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id_passagem);
			pstm.setInt(2, id_usuario);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				compras.setDataCompra(rs.getDate("Data_compra"));
				compras.setValorTotal(rs.getDouble("Valor_total"));
				compras.setPassagem(PassagemDAO.getPassagemById(rs.getInt("Fk_passagem")));
				compras.setUsuario(UsuarioDAO.getUsuarioById(rs.getInt("Fk_usuario")));
				
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
		
		return compras;
	}
	
}
