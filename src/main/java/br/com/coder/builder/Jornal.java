package br.com.coder.builder;

import java.util.Date;
import java.util.List;

public class Jornal implements Artigo {

    private String autor;
    private String titulo;
    private List marcacoes;
    private int paginas;
    private Date publicado;
    private String texto;

    //Gerar os métodos getters para cada atributo.

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMarcacoes(List marcacoes) {
        this.marcacoes = marcacoes;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setDataDaPublicacao(Date data) {
        this.publicado = data;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Jornal{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", marcacoes=" + marcacoes +
                ", paginas=" + paginas +
                ", publicado=" + publicado +
                ", texto='" + texto + '\'' +
                '}';
    }
}