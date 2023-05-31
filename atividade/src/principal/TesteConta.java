package principal;

import java.util.Scanner;

import entidades.Conta;
import excecao.ContaExcecaoException;

public class TesteConta {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.setSaldo(10);
		boolean permanecerNoLoop = true;
		Scanner lerDados = new Scanner(System.in); 
		double valor;
		
		System.out.println("Informe um valor a ser sacado: ");
		
		do {
			valor = lerDados.nextDouble();
		try {
			minhaConta.sacar(valor);
			permanecerNoLoop = false;
		} catch (ContaExcecaoException e) {
			System.out.println("Excecao Capturada: "+e.getMessage());
			System.out.println("Saldo Atual: "+minhaConta.getSaldo());
			System.out.println("Informe um valor a ser sacado: ");
		}
		}while(permanecerNoLoop);
		System.out.println("Valor atual do saque: "+minhaConta.getSaldo());
	}
	
}
