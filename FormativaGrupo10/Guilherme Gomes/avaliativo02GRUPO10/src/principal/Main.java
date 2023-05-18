package principal;

import java.util.Scanner;
import entidades.Notas;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notas notas = new Notas();

        notas.adicionarNota(7.5);
        notas.adicionarNota(8);
        notas.adicionarNota(6.5);

        System.out.println(notas.calcularMedia());
    }
}
