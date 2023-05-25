package entidades;

public enum TipoDisciplina {
	FPOO("Fundamentos de Programacao Orientada a Objetos"),
	HR("Redes de Computadores"),
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
