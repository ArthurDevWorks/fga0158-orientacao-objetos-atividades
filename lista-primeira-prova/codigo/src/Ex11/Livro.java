public class Livro {
    private String nome;
    private String genero;
    private int qtdPaginas;

    public Livro(String nome, String genero, int qtdPaginas) {
        this.nome = nome;
        this.genero = genero;
        this.qtdPaginas = qtdPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public  void folhear(){

    }

    public void abrir(){

    }

    public void fechar(){

    }
}