package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.ConnectionFactory;
import model.PessoaEndereco;
import model.Telefone;

public class TelefoneDAO {
	Connection connection;
	public TelefoneDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void add(Telefone telefone ) {
		String sql = "INSERT INTO Telefone (ddd,numero,id_pessoa) VALUES (?,?,?)";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			statement.setInt(1,telefone.getDdd());
			statement.setInt(2, telefone.getNumero());
			statement.setInt(3,  telefone.getIdPessoa());
			statement.execute();
		}catch (SQLException e) {
			Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE,null,e);
		}
	}

	public Telefone findbyId(int id) {

		String sql = "SELECT * FROM Telefone WHERE id_telefone = ?";
		Telefone telefone = new Telefone();
		
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, id);
			
			ResultSet rs = statement.executeQuery();
			rs.next();
			
			telefone = new Telefone();
			telefone.setId(rs.getInt("id_telefone"));
			telefone.setDdd(rs.getInt("ddd"));
			telefone.setNumero(rs.getInt("numero"));
			telefone.setIdPessoa(rs.getInt("id_pessoa"));
		} catch (SQLException e) {
			Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE,null,e);
		}
		
		return telefone;
	}

	public void updateNumberById(Telefone telefone) {
		String sql = "UPDATE Telefone SET numero = ? WHERE id_telefone = ?";
		 try(PreparedStatement statement = connection.prepareStatement(sql)){
			 statement.setInt(1, telefone.getNumero());
			 statement.setInt(2, telefone.getId());
			 statement.execute();
		 }catch (SQLException e) {
			 Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE,null,e);
		 }
	}

	public List<Telefone> findAll(){
		String sql = "SELECT * FROM Telefone";
		
		List<Telefone> list = new ArrayList<>();
		
		try(PreparedStatement statement = connection.prepareStatement(sql)){
			statement.execute();
			ResultSet rs = statement.getResultSet();
			Telefone telefone = null;
			
			while (rs.next()) {
				telefone = new Telefone();
				telefone.setId(rs.getInt("id_telefone"));
				telefone.setDdd(rs.getInt("ddd"));
				telefone.setNumero(rs.getInt("numero"));
				telefone.setIdPessoa(rs.getInt("id_pessoa"));
				
				list.add(telefone);
			}
			
		}catch (SQLException e) {
			Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE,null,e);
		}
		
		return list;
	}

	
	public void deleteByNumber (Telefone telefone) {
		String sql = "DELETE FROM Telefone WHERE numero = ?";
		
		try(PreparedStatement statement = connection.prepareStatement(sql)){
			statement.setInt(1, telefone.getNumero());
			statement.execute();
		}catch (SQLException e ) {
			Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE,null,e);
		}
	}
}
