package core;

//para ler corretamente: A CLASSE ESTUDANTE, AMPLIA A DEFINICAO DA CLASSE PESSOA.
//o que quer dizer? Em Estudante tem tudo que tem em Pessoa e mais uma coisa


public class Estudante extends Pessoa {
	public int numeroMatricula;
	public String curso;

	public void exibir() {
		System.out.println("Estudante: "+nome+"/"+email+"/"+numeroMatricula+"/"+curso);
		
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
