package brigde;

import model.Album;
import model.Livro;

// abstraction
public class Relatorio {
    protected Formatador formatador;

    public Relatorio(Formatador formatador) {
        this.formatador = formatador;
    }

    public String gerarRelatorio(Album album){
        return formatador.formatarAlbum(album) + "Relatorio resumido";
    }

    public String gerarRelatorio(Livro livro){
        return formatador.formatarLivro(livro) + "Relatorio resumido";
    }


    
}
