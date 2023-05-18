package entidades;

import java.util.ArrayList;

public class Turma {
	
	private ArrayList<Aluno>turma;

	
	public Turma() {
		turma = new ArrayList<>();
	}

	public void adicionarAluno(Aluno aluno) {
		turma.add(aluno);
	}

	public void removerAluno(Aluno aluno) {
		turma.remove(aluno);
	}
	
	public void listarAlunoTurma() {
		
		if(this.turma.isEmpty()){
			System.out.println("Não a alunos na turma");
		}
		else {
			for(Aluno aluno : this.turma) {
				aluno.exibirInformacoes();
			}
		}

  }
}	
