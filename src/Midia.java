public class Midia {

    private String nome;
    private String codigo;
    private Double preco;

    public Midia (String nome, String codigo, Double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void darPlay() {
        System.out.println("A mídia está sendo executada!");

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Midia{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", preco=" + preco +
                '}';
    }
}




