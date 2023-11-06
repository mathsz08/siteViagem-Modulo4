package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Conexao;
import model.Destino;

public class DestinoDAO {
	public void save(Destino destino) {
		String sql = "INSERT INTO Destino( Id_destino, Cidade, Pais, Aeroporto) VALUES(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
				
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, destino.getIdDestino());
			pstm.setString(2, destino.getCidade());
			pstm.setString(3, destino.getPais());
			pstm.setString(4, destino.getAeroporto());
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

	public void removeById(int id) {
		String sql = "REMOVE from contato WHERE Id_destino = ?";
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
	
	public void update(Destino destino) {
		String sql = "UPDATE Destino SET Id_destino = ?, Cidade = ?, Pais = ?, Aeroporto = ?" + "WHERE Id_destino = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(4, destino.getIdDestino());
			pstm.setString(1, destino.getCidade());
			pstm.setString(2, destino.getPais());
			pstm.setString(3, destino.getAeroporto());
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

	public List<Destino> getDestinos(){
		String sql = "SELECT * FROM Destino";
		List<Destino> destinos = new ArrayList<Destino>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Destino destino = new Destino();
				
				destino.setIdDestino(rset.getInt("Id_destino"));
				destino.setPais(rset.getString("Pais"));
				destino.setCidade(rset.getString("Cidade"));
				destino.setAeroporto(rset.getString("Aeroporto"));
				destinos.add(destino);
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
		return destinos;
	}

	public static Destino getDestinoById(int id) {
		String sql = "SELECT * from Destino WHERE Id_destino = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		Destino destino = new Destino();
		
		try {
			
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				
				
				destino.setIdDestino(rs.getInt("Id_destino"));
				destino.setPais(rs.getString("Pais"));
				destino.setCidade(rs.getString("Cidade"));
				destino.setAeroporto(rs.getString("Aeroporto"));
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
		return destino;
	}
}
