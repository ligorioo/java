package entidades;

import java.util.ArrayList;

public class Notas {
    private ArrayList<Double> notas;
    private double media;
    private double somatoria;
    private int index;

    /////////////////////////
    //////// Métodos ////////
    /////////////////////////
    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public void removerNota(int index) {
        this.index = index - 1;
        notas.remove(notas.get(this.index));
    }

    public void listarNotas() {
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota " + (i+1) + ": " + notas.get(i));
        }
    }

    public double calcularMedia() {
        for (int i = 0; i < notas.size(); i++) {
            somatoria = somatoria + notas.get(i);
        }
        media = somatoria/notas.size();
        return media;
    }


}
