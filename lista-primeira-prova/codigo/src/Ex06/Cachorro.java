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
