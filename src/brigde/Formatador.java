package brigde;

import model.Album;
import model.Livro;

// Implementation
public interface Formatador {
    public String formatarLivro(Livro livro);
    public String formatarAlbum(Album album);
}
