package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Conexao;
import model.Passagem;



public class PassagemDAO {
	public void save(Passagem passagem) {
		String sql = "INSERT INTO Passagem( Id_passagem, Data_ida, Local_partida, Data_volta, Companhia, Valor, Fk_Destino) VALUES(?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
				
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1,passagem.getIdPassagem());
			System.out.println("2.1----------------------- "+ passagem.getIdPassagem());
			pstm.setDate(2, passagem.getDataIda());
			pstm.setString(3, passagem.getLocalPartida());
			pstm.setDate(4, passagem.getDataVolta());
			pstm.setString(5, passagem.getCompanhia());
			pstm.setDouble(6,passagem.getValor());
			pstm.setInt(7,passagem.getDestino().getIdDestino());
			System.out.println("2.2----------------------- "+ passagem.getDestino().getIdDestino());
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
		String sql = "REMOVE from Passagem WHERE Id_passagem = ?";
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

	public void update(Passagem passagem) {
		String sql = "UPDATE Passagem SET Data_ida = ?, Local_partida = ?, Data_volta = ?, Companhia = ?, Valor = ?, Fk_Destino = ?" + "WHERE Id_passagem = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(7,passagem.getIdPassagem());
			pstm.setDate(1, passagem.getDataIda());
			pstm.setString(2, passagem.getLocalPartida());
			pstm.setDate(3, passagem.getDataVolta());
			pstm.setString(4, passagem.getCompanhia());
			pstm.setDouble(5,passagem.getValor());
			pstm.setInt(6,passagem.getDestino().getIdDestino());
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
	
	public List<Passagem> getPassagem(){
		String sql = "SELECT * FROM Passagem";
		List<Passagem> passagens = new ArrayList<Passagem>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			while(rset.next()) {
				Passagem passagem = new Passagem();
				passagem.setIdPassagem(rset.getInt("Id_passagem"));
				passagem.setDataIda(rset.getDate("Data_ida"));
				passagem.setDataVolta(rset.getDate("Data_volta"));
					
				passagem.setLocalPartida(rset.getString("Local_partida"));
				passagem.setCompanhia(rset.getString("Companhia"));
				passagem.setValor(rset.getDouble("Valor"));
				passagem.setDestino(DestinoDAO.getDestinoById(rset.getInt("Fk_destino")));
				passagens.add(passagem);
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
		return passagens;
	}

	public static Passagem getPassagemById(int id) {
		String sql = "SELECT * from Passagem WHERE Id_passagem = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		Passagem passagem = new Passagem();
		
		try {
			
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				passagem.setIdPassagem(rs.getInt("Id_passagem"));
				passagem.setDataIda(rs.getDate("Data_ida"));
				passagem.setDataVolta(rs.getDate("Data_volta"));
				passagem.setLocalPartida(rs.getString("Local_partida"));
				passagem.setCompanhia(rs.getString("Companhia"));
				passagem.setValor(rs.getDouble("Valor"));
				passagem.setDestino(DestinoDAO.getDestinoById(rs.getInt("Fk_destino")));
				
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
		return passagem;
	}
	
}
