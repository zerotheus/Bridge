import brigde.HtmlFormato;
import brigde.Relatorio;
import model.Album;
import model.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        Relatorio relatorioResumido = new Relatorio(new HtmlFormato());

        System.out.println(relatorioResumido.gerarRelatorio(new Livro()));
        System.out.println(relatorioResumido.gerarRelatorio(new Album()));
    }
}
