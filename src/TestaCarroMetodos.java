/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaCarroMetodos {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "HB20";
        meuCarro.velocidadeMaxima = 120;

        System.out.println("MeuCarro: ");
        System.out.println("- Cor: " + meuCarro.getCor());
        System.out.println("- Modelo: " + meuCarro.getModelo());
        System.out.println("- V. Atual: " + meuCarro.velocidadeAtual);

        meuCarro.ligar();
        meuCarro.acelera(110);

        System.out.println("MeuCarro Acelerando: ");
        System.out.println("- Cor: " + meuCarro.getCor());
        System.out.println("- Modelo: " + meuCarro.getModelo());
        System.out.println("- V. Atual: " + meuCarro.velocidadeAtual);

    }
}
