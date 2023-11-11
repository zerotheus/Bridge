package brigde;

import model.Album;
import model.Livro;

public class HtmlFormato implements Formatador {

    @Override
    public String formatarLivro(Livro livro) {
        livro = new Livro("HTML editora", "HTML idioma", "HTML autor",
                "HTML obra", "HTML titulo", 150, 5.0);
        return livro.toString();
    }

    @Override
    public String formatarAlbum(Album album) {
        album = new Album("Latex titulo", "HTML ano", "HTML gravadora",
                "HTML estudio", "HTML autor", 10, "HTML obriga", 9.0);
        return album.toString();
    }

}
