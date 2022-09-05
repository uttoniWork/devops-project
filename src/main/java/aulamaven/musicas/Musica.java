package aulamaven.musicas;

public class Musica {
    private String nomeMusica;
    private String descricao;

    public Musica(String nomeMusica, String descricao) {
        this.nomeMusica = nomeMusica;
        this.descricao = descricao;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public String getDescricao() {
        return descricao;
    }
}
