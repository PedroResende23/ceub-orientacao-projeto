package Exemplos.Heranca.src;

public class Sedan extends Carro {

    public Sedan(String modelo, int ano) {
        super(modelo, ano);
    }

        @Override
    void ligar(){
        System.out.println("Ascende farol");
        super.ligar();
    }

}
