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
