package entidades;

public class Professor extends Pessoa {
	private String especialidade;
	private TipoDisciplina disciplina;
	private String periodo;
	
	public Professor() {
		
	}
	
	public Professor(String nome, String cpf, String especialidade, TipoDisciplina disciplina, String periodo) {
		super(nome, cpf);
		this.especialidade = especialidade;
		this.disciplina = disciplina;
		this.periodo = periodo;
	}
	

	@Override
	public void exibirInformacoes(){
		System.out.println("Nome: "+ super.nome);
		System.out.println("CPF: "+ super.cpf);
		System.out.println("Especialidade: "+ this.especialidade);
		System.out.println("Disciplina: " + this.disciplina);
		System.out.println("Período: "+ this.periodo);
	}
}
