package teste;

import java.util.List;

import dao.PessoaEnderecoDAO;
import dao.TelefoneDAO;
import model.PessoaEndereco;
import model.Telefone;

public class Main {
	public static void main(String[] args) {
		
		// Método add Pessoa
		
//		PessoaEndereco pessoa = new PessoaEndereco();
//		pessoa.setNome("Joao Marcos");
//		pessoa.setDataNascimento(Date.valueOf("2002-08-06"));
//		pessoa.setGenero("Masculino");
//		pessoa.setEmail("joaomarcos123@gmail.com");
//		pessoa.setLogradouro("Rua 3 Q 2 Lt 36");
//		pessoa.setComplemento("Centro");
//		pessoa.setBairro("Vista Alegre");
//		pessoa.setCidade("Urutai");
//		pessoa.setEstado("Goias");
//		
//		
//		PessoaEnderecoDAO pDAO = new PessoaEnderecoDAO();
//		
//		pDAO.add(pessoa);


		 // Método buscar por id_Pessoa

//		PessoaEndereco pessoa = new PessoaEndereco();
//				  
//				  PessoaEnderecoDAO pDAO = new PessoaEnderecoDAO(); pessoa = pDAO.findbyId(2);
//				  
//				  System.out.println("Id: "+ pessoa.getId());
//				  System.out.println("Nome: " + pessoa.getNome()); 
//				  System.out.println("Data de nascimento: " + pessoa.getDataNascimento());	
//				  System.out.println("Genero: " + pessoa.getGenero());
//				  System.out.println("Email: " + pessoa.getEmail());
//				  System.out.println("Logradouro: " + pessoa.getLogradouro());
//				  System.out.println("Complemento: " + pessoa.getComplemento()); 
//				  System.out.println("Bairro: " + pessoa.getBairro());
//				  System.out.println("Cidade: " + pessoa.getCidade());
//				  System.out.println("Estado: " + pessoa.getEstado()); 

		
		// Método update nome Pessoa

//		PessoaEnderecoDAO pDAO = new PessoaEnderecoDAO();
//		PessoaEndereco pessoa = pDAO.findbyId(1);
//		
//		pessoa.setNome("Jackson Cruciol"); pDAO.updateNameById(pessoa);


		// Método buscar todas as Pessoas
		
//		PessoaEnderecoDAO pDAO = new PessoaEnderecoDAO();
//				List<PessoaEndereco> listaPessoas = pDAO.findAll();
//				
//				System.out.println("                       Pessoas Cadastradas");
//				System.out.println("------------------------------------------");
//				listaPessoas.forEach(p -> {
//					System.out.println("Código: " + p.getId());
//					System.out.println("Nome: " + p.getNome());
//					System.out.println("Data de nascimento: " + p.getDataNascimento());
//					System.out.println("Genero: " + p.getGenero());
//					System.out.println("Email: " + p.getEmail());
//					System.out.println("Logradouro: " + p.getLogradouro());
//					System.out.println("Complemento: " + p.getComplemento());
//					System.out.println("Bairro: " + p.getBairro());
//					System.out.println("Cidade: " + p.getCidade());
//					System.out.println("Estado: " + p.getEstado());
//					System.out.println("---------------------------------------");
//				});

		
		// Método delete Pessoa
		
//		PessoaEnderecoDAO pDAO = new PessoaEnderecoDAO(); 
//		PessoaEndereco pessoa = pDAO.findbyId(2);
//					 
//		pDAO.deleteByname(pessoa);
		
		
		// Método add Telefone
		
//		Telefone telefone = new Telefone();
//		telefone.setDdd(64);
//		telefone.setNumero(992000000);
//		telefone.setIdPessoa(3);
//		
//		TelefoneDAO tDAO = new TelefoneDAO();
//		
//		tDAO.add(telefone);
		
//		// Método findById Telefone 
//		
//Telefone telefone = new Telefone();
//		  
//		  TelefoneDAO tDAO = new TelefoneDAO(); telefone = tDAO.findbyId(4);
//		  
//		  System.out.println("Id: " + telefone.getId());
//		  System.out.println("DDD: " + telefone.getDdd());
//		  System.out.println("Numero: " + telefone.getNumero());
//		  System.out.println("Identificador da Pessoa que cadastrou o numero: " + telefone.getIdPessoa());

		// Método update Telefone
		
//		 TelefoneDAO tDAO = new TelefoneDAO();
//		 Telefone telefone = tDAO.findbyId(4);
//		 
//		 telefone.setNumero(999453676);
//		 tDAO.updateNumberById(telefone);
		
// Método buscar todas os telefones registrados
		
//		TelefoneDAO tDAO = new TelefoneDAO();
//				List<Telefone> listaTelefone = tDAO.findAll();
//				
//			System.out.println("                       Telefones Cadastrados");
//				System.out.println("------------------------------------------");
//				listaTelefone.forEach(t -> {
//					System.out.println("Código: " + t.getId());
//					System.out.println("DDD: " + t.getDdd());
//					System.out.println("Numero: " + t.getNumero());
//					System.out.println("Identificador da Pessoa que cadastrou o numero: " + t.getIdPessoa());
//
//		System.out.println("---------------------------------------");
//			});
		
		// Método delete Telefone
		
		TelefoneDAO tDAO = new TelefoneDAO(); 
		 Telefone telefone = tDAO.findbyId(2);
		 
		 tDAO.deleteByNumber(telefone);;
		
	}
	}

	

