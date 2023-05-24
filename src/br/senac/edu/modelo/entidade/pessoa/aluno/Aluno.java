package br.senac.edu.modelo.entidade.pessoa.aluno;

import br.senac.edu.modelo.entidade.pessoa.Pessoa;

public final class Aluno extends Pessoa{

	private String turma;
	private String matricula;
	private Status status;

	public Aluno(String nome, byte idade, String cpf, String matricula) {
		super(nome, idade, cpf);
		setTurma(turma);
		setMatricula(matricula);
		setStatus(Status.MATRICULADO);
	}

	public Aluno(String nome, byte idade, String cpf, String matricula, Status status) {
		super(nome, idade, cpf);		
		setTurma(turma);
		setMatricula(matricula);
		setStatus(status);

	}

	
	public void responderChamada() {
		System.out.println("Presente!");
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {

		this.turma = turma;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Status getStatus() {
		return status;

	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
