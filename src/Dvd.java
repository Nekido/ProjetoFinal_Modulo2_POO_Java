public class Dvd extends Midia {
    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;

    public Dvd(
            String nome,
            String codigo,
            Double preco,
            String idioma,
            boolean possuiLegenda,
            String idiomaLegenda
    ) {
        super(nome, codigo, preco);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    @Override
    public void darPlay() {
        System.out.println("Filme iniciado!");
    }

    public void legenda(boolean ligar, String idioma) {
        if(isPossuiLegenda()) {
            ligar = true;
            this.idiomaLegenda = idioma;
            System.out.println("Legenda ligada: " + ligar + "\nIdioma: " + idioma);
        }
    }

    public void legenda(boolean ligarDesligar) {
        if(ligarDesligar) {
            setPossuiLegenda(false);
            System.out.println("Legenda desligada");
        } else {
            setPossuiLegenda(true);
            System.out.println("Legenda ligada");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Dvd{" +
                "idioma='" + idioma + '\'' +
                ", possuiLegenda=" + possuiLegenda +
                ", idiomaLegenda='" + idiomaLegenda + '\'' +
                '}';
    }
}