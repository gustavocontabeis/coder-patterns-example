package br.com.coder.strategy;

public class IPI implements Imposto { 
	  
	  private double valor; 
	  
	  public IPI(double valor) { 
	    this.valor = valor; 
	  } 
	  
	  public double calcular() { 
	    return this.valor * 0.20; 
	  } 

	}