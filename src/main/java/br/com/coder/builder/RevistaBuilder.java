package br.com.coder.builder;

import java.util.Arrays;
import java.util.Calendar;

public class RevistaBuilder implements ArtigoBuilder {

	private Artigo artigo;

	public RevistaBuilder() {
		this.artigo = new Revista();
	}

	public static ArtigoBuilder builder() {
		return new RevistaBuilder();
	}

	public ArtigoBuilder autor(String autor) {
		this.artigo.setAutor(autor);
		return this;
	}

	public ArtigoBuilder titulo(String titulo) {
		this.artigo.setTitulo(titulo);
		return this;
	}

	public ArtigoBuilder assuntos(String... assuntos) {
		this.artigo.setMarcacoes(Arrays.asList(assuntos));
		return this;
	}

	public ArtigoBuilder totalDePaginas(int total) {
		this.artigo.setPaginas(total);
		return this;
	}

	public ArtigoBuilder publicadoEm(int dia, int mes, int ano) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(ano, mes, dia);
		this.artigo.setDataDaPublicacao(calendar.getTime());
		return this;
	}

	public ArtigoBuilder texto(String texto) {
		this.artigo.setTexto(texto);
		return this;
	}

	public Artigo get() {
		return this.artigo;
	}
}