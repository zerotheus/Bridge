package model;

public abstract class Obra {

    private String titulo;
    private String ano;
    private double avaliacao;

    public Obra(String titulo, String ano, double avaliacao) {
        this.titulo = titulo;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Obra [titulo=" + titulo + ", ano=" + ano + ", avaliacao=" + avaliacao + "]";
    }

}
