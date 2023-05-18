package entidades;


public class Professor extends pessoa {

	private String especialidade;
	private String periodo;
	
	//construtor padrão
	
	public Professor() {
		
	}
	
	//construtor
	
	public Professor(String nome, int cpf,String especialidade, String periodo) {
		super(nome, cpf);
		this.especialidade = especialidade;
		this.periodo = periodo;
	}
	
	@Override
	
	public void exibirInformacoes(){
		System.out.println("nome "+ super.nome);
		System.out.println("cpf"+ super.cpf);
		System.out.println("especialidade"+ especialidade);
		System.out.println("periodo"+ periodo);
	}
	
}
