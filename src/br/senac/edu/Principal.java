package br.senac.edu;

import br.senac.edu.modelo.entidade.pessoa.aluno.Aluno;
import br.senac.edu.modelo.entidade.pessoa.empregado.professor.Professor;

public class Principal {
	public static void main(String[] args) {

		Aluno aluno01 = new Aluno("Maria",(byte)20, "987.654.321-01");
		
		//aluno01.setNome ("Maria");
		//aluno01.setIdade((byte)20);
		//aluno01.setCPF ("987.654.321-01");

		System.out.println("Nome do aluno: " + aluno01.getNome());
		System.out.println("Idade do aluno: " + aluno01.getIdade());
		System.out.println("CPF do aluno: " + aluno01.getCPF());

		aluno01.responderChamada();

		Professor professor01 = new Professor("Augusto", "Homem", "Matemática", (byte)5);
		//professor01.setNome ("Augusto");
		//professor01.setGenero ("Homem");
		//professor01.setMateria ("Matemática");
		//professor01.setAnosExperiencia ((byte)5);
		
		System.out.println();
		System.out.println();
		System.out.println("O nome do professor é: "+ professor01.getNome());
		System.out.println("O professor é um: "+ professor01.getGenero());
		System.out.println("O professor da aula de: "+ professor01.getMateria());
		System.out.println("O professor tem: "+ professor01.getAnosExperiencia()+" anos de experiência");

		
		
		professor01.MandarTurmaFicarQuieta();
		

	}

}
