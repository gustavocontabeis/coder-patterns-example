package br.com.coder.prototype;

public class Main {

	public static void main(String[] args) {
		
		FiestaPrototype prototipoPalio = new FiestaPrototype();

		CarroPrototype palioNovo = prototipoPalio.clonar();
		palioNovo.setValorCompra(27900.0);
		CarroPrototype palioUsado = prototipoPalio.clonar();
		palioUsado.setValorCompra(21000.0);

		System.out.println(palioNovo.exibirInfo());
		System.out.println(palioUsado.exibirInfo());
		
	}
}
