package brigde;

import model.Album;
import model.Livro;

public class RelatorioCompleto extends Relatorio {

    public RelatorioCompleto(Formatador formatador) {
        super(formatador);
    }

    @Override
    public String gerarRelatorio(Album album) {
        return formatador.formatarAlbum(album) + "Relatorio completo";
    }

    @Override
    public String gerarRelatorio(Livro livro) {
        return formatador.formatarLivro(livro) + "Relatorio completo";
    }

}
