package brigde;

import model.Album;
import model.Livro;

public class LaTexFormato implements Formatador {

    @Override
    public String formatarLivro(Livro livro) {
        livro = new Livro("Latec editora", "Latec idioma", "Latec autor",
         "Latec obra", "Latec titulo", 150,5.0);
        return livro.toString();
    }

    @Override
    public String formatarAlbum(Album album) {
        album = new Album("Latex titulo", "Latec ano", "Latec gravadora", 
        "Latec estudio", "Latec autor", 10, "Latec obriga", 9.0);
        return album.toString();
    }

}
