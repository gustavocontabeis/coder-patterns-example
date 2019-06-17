package br.com.coder.strategy;

public class Main {

	public static void main(String[] args) {
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos(); 
	    Imposto icms = new ICMS(100.0); 
	    Imposto ipi = new IPI(100.0); 
	    System.out.println(calculadora.calcular(icms)); 
	    System.out.println(calculadora.calcular(ipi)); 
		
	}

}
