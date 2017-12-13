package model;

public class Aluno {
	
	private int idade=0;
	
	private String nome=null,email=null,empresa=null,cidade=null,sexo=null,matricula=null;
	
	public Aluno(String matricula, String nome, int idade, String sexo) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
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
		return "Aluno [idade=" + idade + ", nome=" + nome + ", email=" + email + ", empresa=" + empresa + ", cidade="
				+ cidade + ", sexo=" + sexo + ", matricula=" + matricula + "]";
	}

	
	
	
	
}
