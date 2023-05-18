package trabalhojava;

import java.util.ArrayList;

public class Aluno extends pessoa{

	private String codigoTurma;
	private Disciplina disciplina;
	private ArrayList <Double> notas;
	private double media;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int cpf, String codigoTurma, Disciplina disciplina) {
		super(nome,cpf);
		this.codigoTurma = codigoTurma;
		this.disciplina = disciplina;
		
	}
}



