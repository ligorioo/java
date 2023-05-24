package entidades;


public abstract class Pessoa {
	protected String nome, cpf;

	public Pessoa(){
		
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

    public abstract void exibirInformacoes();


	public String getNome() {
		return nome;
	}

}


