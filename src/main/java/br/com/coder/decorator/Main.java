package br.com.coder.decorator;

public class Main {
	public static void main(String[] args) {
		Janela janela = new DecoradorBarraVertical(new JanelaSimples());
		janela.draw();
	}
}
