package ComandaDigital_Mateus_Pimenta;

public class Pessoa {
	private String nome;
	private double telefone;
	private double cpf;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, double telefone, double cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
}
