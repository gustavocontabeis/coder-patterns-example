package br.com.coder.observer;

public class Main {

	public static void main(String[] args) {
		
		DadosSubject dadosSubject = new DadosSubject();
		
		dadosSubject.attach(new TabelaObserver(dadosSubject));
		dadosSubject.attach(new PorcentoObserver(dadosSubject));
		
		dadosSubject.setState(new Dados(1, 2, 3));
		dadosSubject.setState(new Dados(4, 5, 6));
	}
	
}
