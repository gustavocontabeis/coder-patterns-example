package br.com.coder.strategy;

public class ICMS implements Imposto {

	private double valor;

	public ICMS(double valor) {
		this.valor = valor;
	}

	public double calcular() {
		return this.valor * 0.10;
	}

}