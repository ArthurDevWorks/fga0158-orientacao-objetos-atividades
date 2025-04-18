public class Main {

    public static void main(String[] args) {
        Usuario u = new Usuario("Arthur",2320,20);
        Livro l = new Livro("Codigo Limpo", "Informatica", 213);
        Emprestimo e = new Emprestimo(l,u,14);

        e.emprestar(l.getNome(),u.getNome(),14);
    }
}
