import java.util.Random;

public class DoacaoMidia {

    public static void main(String[] args) {


        System.out.println();
        Midia midia = pegarMidiaAleatoria();
        System.out.println(midia);
        midia.darPlay();

    }

    public static Midia pegarMidiaAleatoria() {

        Cd um = new Cd("Reliquias", "25B369", 35.00, "Roberto Carlos", 16);
        Dvd dois = new Dvd("Dupla Dinâmica", "31MV55", 66.87, "En-USA", true, "ES");
        Cd tres = new Cd("Melhores do ano", "02M378", 90.33, "Pagodão", 24);
        Dvd quatro = new Dvd("Tom e Jerry", "78ZY55", 21.00, " ", true, " ");

        Random pegar = new Random();

        int escolha = pegar.nextInt(3);

        switch (escolha) {

            case 0:
                return um;
            case 1:
                return dois;
            case 2:
                return tres;
            default:
                return quatro;

        }

    }

    public static void assitirFilme(Dvd dvd) {
        dvd.legenda(dvd.isPossuiLegenda(), dvd.getIdiomaLegenda());
        dvd.legenda(dvd.isPossuiLegenda());
    }
}
