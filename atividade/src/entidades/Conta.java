package entidades;

import excecao.ContaExcecaoException;

public class Conta {
	
	private double saldo;
	private double limite;
	private int numeroDeIdentificacao;
	
	
	public Conta(){	
	}


	//Getters and Setters
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public int getNumeroDeIdentificacao() {
		return numeroDeIdentificacao;
	}


	public void setNumeroDeIdentificacao(int numeroDeIdentificacao) {
		this.numeroDeIdentificacao = numeroDeIdentificacao;
	}
	
	
	//Sacar
	public void sacar(double valor) throws ContaExcecaoException{
		if(this.saldo < valor) {
			throw new ContaExcecaoException("Saldo Insuficiente!");
		}else {
			this.saldo = this.saldo - valor;
		}
	}
	
	
}
