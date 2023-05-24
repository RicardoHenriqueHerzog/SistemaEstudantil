package br.senac.edu.modelo.entidade.pessoa.empregado.professor;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;

public class Professor extends Empregado {

	private String materia;
	private String genero;
	private byte anosExperiencia;
	private String turma; 

	public Professor(String nome, byte idade, String cpf, String ctps, float valorHora) {
		super(nome, idade, cpf,ctps, valorHora);
		
		setTurma(turma);
	}
		

	


	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public byte getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(byte anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	
	public float calcularSalario() {
		return 1500;
	}

	public void MandarTurmaFicarQuieta() {

		System.out.println("SILÊNCIOOOOOOOO");
		System.out.println("Fiquem quietos!");
	}
	
	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {

		this.turma = turma;
	}

}
