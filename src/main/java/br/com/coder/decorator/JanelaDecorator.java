package br.com.coder.decorator;

public abstract class JanelaDecorator extends Janela {
	
	protected Janela janelaDecorada;

	public JanelaDecorator(Janela janelaDecorada) {
		super();
		this.janelaDecorada = janelaDecorada;
	}

}
