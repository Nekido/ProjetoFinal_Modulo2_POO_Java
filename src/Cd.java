public class Cd extends Midia{

    private String artista;
    private  int quantidadeDeFaixas;

    public Cd (String nome, String codigo, Double preco){
        super(nome, codigo, preco);
        this.artista = artista;
        this.quantidadeDeFaixas = quantidadeDeFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista ) {
        this.artista = artista;
    }

    public int getQuantidadeDeFaixas() {
        return quantidadeDeFaixas;
    }

    public void setQuantidadeDeFaixas(int quantidadeDeFaixas) {
        this.quantidadeDeFaixas = quantidadeDeFaixas;
    }

    @Override
    public void darPlay() {
        System.out.println("Primeira faixa tocando");
    }

    @Override
    public String toString() {
        return super.toString() + "Cd{" +
                "artista='" + artista + '\'' +
                ", quantidadeDeFaixas=" + quantidadeDeFaixas +
                '}';
    }
}



//
//    Criar classe Filha chamada CD
//
//        Atributos:
//
//        artista : String
//        quantidadeFaixas : int
//        Métodos
//
//        sobrescrever darPlay(): exibir a mensagem "Primeira faixa tocando"
//        construtor(todos os argumentos)
//        get() e set()
