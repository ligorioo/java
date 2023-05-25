package entidades;

import java.util.ArrayList;

//uma class herança onde vai pegar as informções da class pessoa 

public class Aluno extends Pessoa {
	private String codigoTurma;
	private TipoDisciplina disciplina;
	private ArrayList<Double> notas = new ArrayList<>();
	private int matricula;
	private double somatoria;
	private int index;
	private double media;
	public Aluno() {

	}

	//ele vai pegas as informações e fazer ela funcionar 
	
	public Aluno(String nome, String cpf, int matricula, String codigoTurma, TipoDisciplina disciplina) {
		super(nome, cpf);
		this.matricula = matricula;
		this.codigoTurma = codigoTurma;
		this.disciplina = disciplina;

	}


	//vai exibir as pega e exibir as informações
	
@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " + super.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Turma: " + codigoTurma);
		System.out.println("Disciplina: " + disciplina);
		if (!notas.isEmpty()) {
			listarNotas();
		} else {
			System.out.println("Media: nao ha notas cadastradas.");
		}
	}


//coletar as informações

	public void adicionarNota(double nota) {
		this.notas.add(nota);
	}
	

	public void removerNota(int index) {
		this.index = index - 1;
		notas.remove(notas.get(this.index));
	}
	
	public void sobrescreverNota(int index, double novaNota) {
		this.index = index - 1;
		notas.set(this.index, novaNota);
	}
	

	public void listarNotas() {
		if (notas.isEmpty()) {
			System.out.println("Nao ha notas cadastradas!");
		} else {
			for (int i = 0; i < notas.size(); i++) {
				System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
			}

		}
		if (!notas.isEmpty()) {
			System.out.printf("Media: %.1f\n", calcularMedia());
		}

	}

	//vai calcular as medias
	
	public double calcularMedia() {
		somatoria = 0;
		if (notas.isEmpty()) {
			System.out.println("Notas insuficientes para calcular a media!");
			return 0;
		} else {
			for (int i = 0; i < notas.size(); i++) {
				somatoria = somatoria + notas.get(i);
			}
			this.media = somatoria / notas.size();
		}
		return this.media;
	}


	public int getMatricula() {
		return matricula;
	}

}
