package br.com.coder.builder;

public class Main {

    public static void main(String[] args) {
       Artigo blog = BlogBuilder.builder()
               .autor("Marcio Ballem")
               .titulo("BlogBuilder")
               .assuntos("builder pattern", "java")
               .publicadoEm(20, 3, 2005)
               .texto("O padr�o de projeto builder...")
               .get();

       System.out.println(blog.toString());

       Artigo jornal = JornalBuilder.builder()
               .autor("Marcio Ballem")
               .titulo("JornalBuilder")
               .assuntos("builder pattern", "java")
               .publicadoEm(25, 5, 2008)
               .texto("O padr�o de projeto builder...")
               .totalDePaginas(1)
               .get();

       System.out.println(jornal.toString());

       Artigo revista = JornalBuilder.builder()
               .autor("Marcio Ballem")
               .titulo("RevistaBuilder")
               .assuntos("builder pattern", "java")
               .publicadoEm(25, 5, 2008)
               .texto("O padr�o de projeto builder...")
               .totalDePaginas(6)
               .get();

       System.out.println(revista.toString());
   }
}