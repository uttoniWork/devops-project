package aulamock.entity;

public class Inimigo {

    //POJO PLAIN OLD JAVA OBJECT - classe para ser o inimigo, não testada (entidade)

    private final String nome;
    private final Double qtdVida;
    private final String arma;

    public Inimigo(String nome, Double qtdVida, String arma) {
        this.nome = nome;
        this.qtdVida = qtdVida;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public Double getQtdVida() {
        return qtdVida;
    }

    public String getArma() {
        return arma;
    }
}
