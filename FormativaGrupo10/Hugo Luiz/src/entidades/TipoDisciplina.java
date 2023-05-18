package entidades;

public enum TipoDisciplina {

	FPOO("Fundamentos de Programa��o Orientada a Objetos"),
	REDES("Redes de Computadores"),
	SO("Sistemas Operacionais"),
	LM("Linguagem de Marcacao");
	
	
	private String disciplina;
	
	private TipoDisciplina(String disciplina) {
		this.disciplina = disciplina;
		}

	public String getDisciplina() {
		return disciplina;
	}

 





}
