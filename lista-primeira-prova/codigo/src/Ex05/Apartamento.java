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
                "Area=" + this.area + "\n" +
                "Quartos=" + this.quartos + "\n" +
                "Andar=" + this.andar + "\n" +
                "Valor de compra=" + this.valorDeCompra + "\n" +
                "Vagas de garagem=" + this.vagasDeGaragem + "\n" +
                "Tem varanda=" + this.temVaranda + "\n";
    }
}
