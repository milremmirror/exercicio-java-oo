package exercicio.dio;

public class carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    carro() {

    }
    carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;}

    String getCor(){
        return cor;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;

    }

    String setModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

    public String getModelo() {
        return modelo;
    }
}
