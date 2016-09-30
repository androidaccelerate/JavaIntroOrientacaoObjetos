/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaCarroReferencia {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Ka";
        meuCarro.velocidadeMaxima = 100;

        Carro amigoCarro = meuCarro;
//        amigoCarro.cor = "Vermelho";
//        amigoCarro.modelo = "Ka";
//        amigoCarro.velocidadeMaxima = 100;

        System.out.println("MeuCarro: " + meuCarro.cor + " - " + meuCarro.modelo);
        System.out.println("AmigoCarro: " + amigoCarro.cor + " - " + amigoCarro.modelo);

        if (meuCarro == amigoCarro) {
            System.out.println("São iguais!");
        } else {
            System.out.println("Não são iguais!");
        }
    }
}
