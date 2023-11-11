package model;

public class Album extends Obra {

    private String gravadora;
    private String estudio;
    private String autor;
    private long duracao;


    
    public Album() {
        super("titulo", "ano", 0);
    }

    public Album(String titulo, String ano, String gravadora, String estudio, String autor, long duracao, String obra,
            double avaliacao) {
        super(titulo, ano, avaliacao);
        this.gravadora = gravadora;
        this.estudio = estudio;
        this.autor = autor;
        this.duracao = duracao;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Album [gravadora=" + gravadora + ", estudio=" + estudio + ", autor=" + autor + ", duracao=" + duracao
                + "]" + super.toString();
    }

}
