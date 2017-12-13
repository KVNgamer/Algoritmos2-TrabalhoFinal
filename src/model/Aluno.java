package model;

public class Aluno {
	
	private int idade=0;
	
	private String nome=null,email=null,empresa=null,cidade=null,sexo=null,matricula=null;
	
	public Aluno(String nome, String email, int idade, String cidade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.cidade = cidade;
	}
	
	
	
	public Aluno() {
	}



	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String valoresEntreVirgulas) {
		this.matricula = valoresEntreVirgulas;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
	
	@Override
	public String toString() {
		return "-> Aluno(a) " + nome + " Idade=" + idade + ", Email=" + email + ", Empresa=" + empresa + ", Cidade="
				+ cidade + ", Sexo=" + sexo + ", Matricula=" + matricula ;
	}

	
	
	
	
}
