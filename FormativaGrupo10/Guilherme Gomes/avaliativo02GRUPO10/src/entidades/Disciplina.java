package entidades;

public enum Disciplina {
    FPOO("Fundamentos de Programação Orientada a Objeto"),
    LM("Linguagem de Marcação"),
    SO("Sistemas Operacionais"),
    HR("Hardware e Redes");
    
    private String descricao;
    
    /////////////////////////////
    //////// Construtor /////////
    /////////////////////////////
    private Disciplina(String descricao) {
        this.descricao = descricao;
    }

    /////////////////////////////
    ////////// Getters //////////
    /////////////////////////////
    public String getDescricao() {
        return descricao;
    }
}
