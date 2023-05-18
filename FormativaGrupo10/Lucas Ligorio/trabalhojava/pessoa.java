package trabalhojava;

public abstract class pessoa {
	
	private String nome;
	private int cpf;
	
	public pessoa(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public pessoa(){
		
	}
	
	//public String getNome() {
		//return nome;
	/**
	 * @param nome
	 * @param cpf
	 */

      public abstract void exibirInformacoes();

}
