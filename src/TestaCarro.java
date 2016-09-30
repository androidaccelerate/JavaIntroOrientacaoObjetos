/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "X1";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 120;

        Carro amigoCarro = new Carro();
        amigoCarro.cor = "Preta";
        amigoCarro.modelo = "Z5";
        amigoCarro.velocidadeAtual = 0;
        amigoCarro.velocidadeMaxima = 240;

        System.out.println("MeuCarro: ");
        System.out.println("- Cor: " + meuCarro.cor);
        System.out.println("- Modelo: " + meuCarro.modelo);
        System.out.println("- V. Maxima: " + meuCarro.velocidadeMaxima);

        System.out.println("AmigoCarro: ");
        System.out.println("- Cor: " + amigoCarro.cor);
        System.out.println("- Modelo: " + amigoCarro.modelo);
        System.out.println("- V. Maxima: " + amigoCarro.velocidadeMaxima);
    }
}
