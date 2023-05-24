package br.senac.edu.modelo.entidade.pessoa.empregado;

import br.senac.edu.modelo.entidade.pessoa.Pessoa;

public abstract class Empregado extends Pessoa {

	private String ctps;
	private float valorHora;

	protected Empregado(String nome, byte idade, String cpf, String ctps, float valorHora) {
		super(nome, idade, cpf);
		setCTPS(ctps);

	}

	public String getCTPS() {
		return ctps;
	}

	public void setCTPS(String ctps) {
		this.ctps = ctps;
	}

	public float getValorHora() {
	return valorHora;	
	}
	
	public void setValorHora (float valorHora) {
	this.valorHora = valorHora;	
	}

	public abstract float calcularSalario();

	public float calcularSalario(int quantidadeHorasTrabalhadas) {
		return quantidadeHorasTrabalhadas * valorHora;
	}
}
