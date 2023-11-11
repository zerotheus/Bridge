package model;

public class Livro extends Obra {

    private String editora;
    private String idioma;
    private String autor;
    private int numPaginas;


    

    
    public Livro() {
        super("titulo", "ano", 0);
        
    }

    public Livro(String editora, String idioma, String autor, String obra, String titulo, int numPaginas,
            double avaliacao) {
        super(titulo, obra, avaliacao);
        this.editora = editora;
        this.idioma = idioma;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro [editora=" + editora + ", idioma=" + idioma + ", autor=" + autor + ", numPaginas=" + numPaginas
                + "]" + super.toString();
    }

}
