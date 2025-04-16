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

### 5. **Conceito de classe e objeto**

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

