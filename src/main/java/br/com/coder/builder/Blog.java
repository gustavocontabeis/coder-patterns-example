package br.com.coder.builder;

import java.util.Date;
import java.util.List;

public class Blog implements Artigo {

	private String autor;
	private String titulo;
	private List marcacoes;
	private int paginas;
	private Date publicado;
	private String texto;
	private Date dataDaPublicacao;
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List getMarcacoes() {
		return marcacoes;
	}

	public void setMarcacoes(List marcacoes) {
		this.marcacoes = marcacoes;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Date getPublicado() {
		return publicado;
	}

	public void setPublicado(Date publicado) {
		this.publicado = publicado;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDataDaPublicacao() {
		return dataDaPublicacao;
	}

	public void setDataDaPublicacao(Date dataDaPublicacao) {
		this.dataDaPublicacao = dataDaPublicacao;
	}

	@Override
	public String toString() {
		return "Blog{" +
				"autor='" + autor + '\'' +
				", titulo='" + titulo + '\'' +
				", marcacoes=" + marcacoes +
				", paginas=" + paginas +
				", publicado=" + publicado +
				", texto='" + texto + '\'' +
				'}';
	}

}