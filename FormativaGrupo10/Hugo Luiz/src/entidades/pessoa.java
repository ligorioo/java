package trabalhojava;

public abstract class pessoa {
	
	protected String nome;
	protected int cpf;
	
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
