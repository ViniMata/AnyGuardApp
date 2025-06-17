package Model;

public class EventoClimatico {
    private String tipo;
    private String descricao;
    private String foto;

    public EventoClimatico(String tipo, String descricao, String foto) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean ehEventoGrave(String palavraChave) {
        return descricao.toLowerCase().contains(palavraChave.toLowerCase());
    }

    @Override
    public String toString() {
        return "EventoClimatico{" +
                "tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
