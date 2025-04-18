# Lista de Exercícios P1 - Orientação a Objetos (Java)

**Aluno:** Arthur Soares Parente  
**Matrícula:** 232036770

---

### 1. **Defina o que é Orientação a Objetos (OO)**

Orientação a Objetos é um paradigma de programação que busca abstrair ao máximo a realidade dos projetos (entidades), para que possamos desenvolvê-los com mais eficiência e assertividade, de modo que todas as necessidades possam ser abordadas e atendidas.

---

### 2. **Conceitos básicos**

Explique os seguintes conceitos:

- **a) Classe:**  
  É o molde onde serão definidas todas as características do objeto. Ex: métodos, atributos, etc.

- **b) Objeto:**  
  É a instância da classe, onde será possível utilizá-la de acordo com suas características e comportamentos descritos.

- **c) Atributo:**  
  Toda característica que um objeto possui. Ex: peso, idade, etc.

- **d) Método:**  
  É o comportamento que o objeto pode exercer. Ex: pular, correr.

---

### 3. **Conceito de classe e objeto**

```java
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
               "nome='" + nome + '\'' +
               ", idade=" + idade +
               ", peso=" + peso +
               '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Arthur", 20, 84);
        System.out.println(p.toString());
    }
}

```

### 4. **Associação**
É um tipo de relacionamente que pode ser feito entre duas ou mais classes, onde normalmente uma classe participa diretamente da outra. Exemplo: No caso das classes: professor e disciplina, na classe disciplina eu preciso associar o professor, pois a disciplina é ministrada por um professor.

```
public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Disciplina {
    private String nome;
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void exibirInfo() {
        System.out.println("Disciplina: " + nome + " | Professor: " + professor.getNome());
    }
}
```

### 5. **Classe Apartmento**

```java

public class Apartamento {

    private double area;
    private int quartos;
    private int andar;
    private double valorDeCompra;
    private int vagasDeGaragem;
    private boolean temVaranda;

    public Apartamento(double area, int quartos, int andar, double valorDeCompra, int vagasDeGaragem, boolean temVaranda) {
        this.area = area;
        this.quartos = quartos;
        this.andar = andar;
        this.valorDeCompra = valorDeCompra;
        this.vagasDeGaragem = vagasDeGaragem;
        this.temVaranda = temVaranda;
    }

    public String exibirInfo() {
        return "Dados do apartamento: \n" +
                "Area=" + this.area + "\n" +
                "Quartos=" + this.quartos + "\n" +
                "Andar=" + this.andar + "\n" +
                "Valor de compra=" + this.valorDeCompra + "\n" +
                "Vagas de garagem=" + this.vagasDeGaragem + "\n" +
                "Tem varanda=" + this.temVaranda + "\n";
    }
}

```

### 6. **Herança**
É o conceito em que uma classe serve de base para outras classes que sao denomindas classes filhas. Essas classes filhas vao herdar todos os metodos e atributos dessa classe pai, por este motivo a classe filha deve necessáriamente ser um tipo da classe pai para assim herdar caracteristicas que lhe sejam uteis.
```
package Ex06;

public class Animal {
    private String raca;
    private String peso;
    private int idade;

    public Animal(String raca, String peso, int idade) {
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dormir(){
        System.out.println("Dormindo...");
    }

    public void comer(){
        System.out.println("Comendo...");
    }
}

package Ex06;

public class Cachorro extends Animal {

    public Cachorro(String raca, String peso, int idade) {
        //Atributos herdados da classe pai
        super(raca, peso, idade);
    }

    //Além dos metodos da classe pai o cachorro também tem o metodo de latir
    public void latir(){
        System.out.println("Latindo...");
    }
}

```

## 7. **Polimorfismo - Sobrecarga**
Sobrecarga é defindio quando vários métodos têm o mesmo nome, mas parâmetros diferentes.

```
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}

```

## 8. **Polimorfismo - Sobrescrita**

Sobrescrita ocorre quando uma subclasse redefine um método da superclasse com uma nova implementação.

```
public class Veiculo {
    public void mover() {
        System.out.println("Veículo se movendo");
    }
}

public class Bicicleta extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Bicicleta pedalando...");
    }
}
```

### 9. **Encapsulamento - Apartamento**

```
package Ex05;

public class Apartamento {
    private double area;
    private int quartos;
    private int andar;
    private double valorDeCompra;
    private int vagasDeGaragem;
    private boolean temVaranda;
    public Apartamento(double area, int quartos, int andar, double valorDeCompra, int vagasDeGaragem, boolean temVaranda) {
        this.area = area;
        this.quartos = quartos;
        this.andar = andar;
        this.valorDeCompra = valorDeCompra;
        this.vagasDeGaragem = vagasDeGaragem;
        this.temVaranda = temVaranda;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public int getVagasDeGaragem() {
        return vagasDeGaragem;
    }

    public void setVagasDeGaragem(int vagasDeGaragem) {
        this.vagasDeGaragem = vagasDeGaragem;
    }

    public boolean getTemVaranda() {
        return temVaranda;
    }

    public void setTemVaranda(boolean temVaranda) {
        this.temVaranda = temVaranda;
    }

    public String exibirInfo() {
        return "Dados do apartamento: \n" +
                "Area=" + this.getArea() + "\n" +
                "Quartos=" + this.getQuartos() + "\n" +
                "Andar=" + this.getAndar() + "\n" +
                "Valor de compra=" + this.getValorDeCompra() + "\n" +
                "Vagas de garagem=" + this.getVagasDeGaragem() + "\n" +
                "Tem varanda=" + this.getTemVaranda() + "\n";
    }
}
```

## 10. **Relacionamento de agregação**
Agregação é uma associação porém de um modo em que uma classe faz parte de uma outra classe porém ela pode ser usada de forma independente diferente da associação, que normalmente é um conjunto de duas ou mais classes para uma funcionalidade de forma cobinada.

```
public class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Empresa {
    private String nome;
    private Departamento departamento;

    public Empresa(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public void exibirInfo() {
        System.out.println("Empresa: " + nome + " | Departamento: " + departamento.getNome());
    }
}
```

Exemplo prático:

java
Copiar
Editar
public class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Empresa {
    private String nome;
    private Departamento departamento;

    public Empresa(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public void exibirInfo() {
        System.out.println("Empresa: " + nome + " | Departamento: " + departamento.getNome());
    }
}

### 11 e 12 - **Diagrama and Clsse - Livraria**

![image](https://github.com/user-attachments/assets/33915234-87c0-40da-a9d0-f47a70e0e2a2)

```
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

public class Usuario {
    private String nome;
    private int matricula;
    private  int idade;

    public Usuario(String nome, int matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void ler(){

    }

    public void buscar(){

    }
}

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

public class Main {

    public static void main(String[] args) {
        Usuario u = new Usuario("Arthur",2320,20);
        Livro l = new Livro("Codigo Limpo", "Informatica", 213);
        Emprestimo e = new Emprestimo(l,u,14);

        e.emprestar(l.getNome(),u.getNome(),14);
    }
}

```
