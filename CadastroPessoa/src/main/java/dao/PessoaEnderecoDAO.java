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

public class PessoaEnderecoDAO {
	Connection connection;
	public PessoaEnderecoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void add(PessoaEndereco pessoaEndereco) {
		String sql = "INSERT INTO  Pessoa_endereco (nome, data_nascimento, genero, email, logradouro, complemento, bairro, cidade, estado) VALUES (?,?,?,?,?,?,?,?,?)";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			statement.setString(1,pessoaEndereco.getNome());
			statement.setDate(2, pessoaEndereco.getDataNascimento());
			statement.setString(3, pessoaEndereco.getGenero());
			statement.setString(4, pessoaEndereco.getEmail());
			statement.setString(5, pessoaEndereco.getLogradouro());
			statement.setString(6, pessoaEndereco.getComplemento());
			statement.setString(7, pessoaEndereco.getBairro());
			statement.setString(8, pessoaEndereco.getCidade());
			statement.setString(9, pessoaEndereco.getEstado());
			statement.execute();
		}catch (SQLException e) {
			Logger.getLogger(PessoaEnderecoDAO.class.getName()).log(Level.SEVERE,null,e);
		}
	}

	public PessoaEndereco findbyId(int id) {

		String sql = "SELECT * FROM Pessoa_endereco WHERE id_pessoa = ?";
		PessoaEndereco pessoa = new PessoaEndereco();
		
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, id);
			
			ResultSet rs = statement.executeQuery();
			rs.next();
			
			pessoa = new PessoaEndereco();
			pessoa.setId(rs.getInt("id_pessoa"));
			pessoa.setNome(rs.getString("nome"));
			pessoa.setDataNascimento(rs.getDate("data_nascimento"));
			pessoa.setGenero(rs.getString("genero"));
			pessoa.setEmail(rs.getString("email"));
			pessoa.setLogradouro(rs.getString("logradouro"));
			pessoa.setComplemento(rs.getString("complemento"));
			pessoa.setBairro(rs.getString("bairro"));
			pessoa.setCidade(rs.getString("cidade"));
			pessoa.setEstado(rs.getString("estado"));
		} catch (SQLException e) {
			Logger.getLogger(PessoaEnderecoDAO.class.getName()).log(Level.SEVERE,null,e);
		}
		
		return pessoa;
	}

	public void updateNameById(PessoaEndereco pessoa) {
		String sql = "UPDATE Pessoa_endereco SET nome = ? WHERE id_pessoa = ?";
		 try(PreparedStatement statement = connection.prepareStatement(sql)){
			 statement.setString(1, pessoa.getNome());
			 statement.setInt(2, pessoa.getId());
			 statement.execute();
		 }catch (SQLException e) {
			 Logger.getLogger(PessoaEnderecoDAO.class.getName()).log(Level.SEVERE,null,e);
		 }
	}

	public List<PessoaEndereco> findAll(){
		String sql = "SELECT * FROM Pessoa_endereco";
		
		List<PessoaEndereco> list = new ArrayList<>();
		
		try(PreparedStatement statement = connection.prepareStatement(sql)){
			statement.execute();
			ResultSet rs = statement.getResultSet();
			PessoaEndereco pessoa = null;
			
			while (rs.next()) {
				pessoa = new PessoaEndereco();
				pessoa.setId(rs.getInt("id_pessoa"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setDataNascimento(rs.getDate("data_nascimento"));
				pessoa.setGenero(rs.getString("genero"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setLogradouro(rs.getString("logradouro"));
				pessoa.setComplemento(rs.getString("complemento"));
				pessoa.setBairro(rs.getString("bairro"));
				pessoa.setCidade(rs.getString("cidade"));
				pessoa.setEstado(rs.getString("estado"));
				
				list.add(pessoa);
			}
			
		}catch (SQLException e) {
			Logger.getLogger(PessoaEnderecoDAO.class.getName()).log(Level.SEVERE,null,e);
		}
		
		return list;
	}

	public void deleteByname (PessoaEndereco pessoa) {
		String sql = "DELETE FROM Pessoa_endereco WHERE nome = ?";
		
		try(PreparedStatement statement = connection.prepareStatement(sql)){
			statement.setString(1, pessoa.getNome());
			statement.execute();
		}catch (SQLException e ) {
			Logger.getLogger(PessoaEnderecoDAO.class.getName()).log(Level.SEVERE,null,e);
		}
	}
}
