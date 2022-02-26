package exercicio.dio;

public class Teste {
    public static void main(String[] args) {

        carro carro1 = new carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor() );
        System.out.println(carro1.getModelo() );
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(7.36));

        carro carro2 = new carro("Cinza", "Mercedes", 66);

        System.out.println(carro2.getCor() );
        System.out.println(carro2.getModelo() );
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(7.36));

    }
}
