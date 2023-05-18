package trabalhojava;

import java.util.ArrayList;

public class Aluno extends pessoa{

	private String codigoTurma;
	private TipoDisciplina disciplina;
	private ArrayList <Double> notas;
	private double media;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int cpf, String codigoTurma, TipoDisciplina disciplina) {
		super(nome,cpf);
		this.codigoTurma = codigoTurma;
		this.disciplina = disciplina;
		
	}

	public void exibirInformacoes() {
		System.out.println("nome"+ super.nome);
		System.out.println("cpf"+ super.cpf);
		System.out.println("turma"+ codigoTurma);
		System.out.println("disciplina"+ disciplina);
	
	}
	
	
}



