package entidades;

import java.util.ArrayList;

public class Turma {

	private ArrayList<Aluno> turma;


	public Turma() {
		turma = new ArrayList<>();
	}


	public void adicionarAluno(Aluno aluno) {
		turma.add(aluno);
	}


	public void removerAluno(int matricula) {
		boolean verificaMatricula = false;

		for (Aluno aluno : turma) {
			if (aluno.getMatricula() == matricula) {
				turma.remove(aluno);
				System.out.println("Aluno " + aluno.getNome() + " removido da turma.");
				verificaMatricula = true;
				break;
			}
		}
		if (verificaMatricula == false) {
			System.out.println("Aluno nao encontrado, verifique o numero de matricula.");
		}

	}


	public void listarTurma() {
		if (this.turma.isEmpty()) {
			System.out.println("Nao ha alunos na turma");
		} else {
			System.out.println("====== Turma ======");
			for (Aluno aluno : this.turma) {
				aluno.exibirInformacoes();
				System.out.println("-----------------");
			}
		}

	}

	public Aluno buscarAluno(int matricula) {
		for(int i = 0; i < turma.size(); i++) {
			if (turma.get(i).getMatricula() == matricula) {
				return turma.get(i);
			}
		}
		return null;
	}	

}
