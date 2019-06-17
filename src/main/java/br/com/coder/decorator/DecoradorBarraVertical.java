package br.com.coder.decorator;

public class DecoradorBarraVertical extends JanelaDecorator {

	public DecoradorBarraVertical(Janela janelaDecorada) {
		super(janelaDecorada);
	}

	@Override
	public void draw() {
		System.out.println("Desenha uma Barra vertical na janela - antes.");
		janelaDecorada.draw();
		System.out.println("Desenha uma Barra vertical na janela - depois.");
	}

}
