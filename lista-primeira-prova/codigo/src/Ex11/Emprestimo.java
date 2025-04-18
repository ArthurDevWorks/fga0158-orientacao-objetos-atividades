public class Emprestimo {
    private Livro nomeLivro;
    private Usuario nomeUsuario;
    private int diasEmprestimo;

    public Emprestimo(Livro nomeLivro, Usuario nomeUsuario, int diasEmprestimo) {
        this.nomeLivro = nomeLivro;
        this.nomeUsuario = nomeUsuario;
        this.diasEmprestimo = diasEmprestimo;
    }

    public Livro getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(Livro nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Usuario getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(Usuario nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public void setDiasEmprestimo(int diasEmprestimo) {
        this.diasEmprestimo = diasEmprestimo;
    }

    public void emprestar(String livro, String usuario,int dias){
        System.out.println("Dados do empréstimo:");
        System.out.println("Livro: " + livro);
        System.out.println("Usuário: " + usuario);
        System.out.println("Dias: " + dias);
    }

    public  void devolver(){

    }

    public void multar(){

    }
}
