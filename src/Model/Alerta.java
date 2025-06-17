package Model;

public class Alerta extends Sensor {
    private String mensagem;

    public Alerta(String regiao, double temperatura, double umidade, double fumaca, String mensagem) {
        super(regiao, temperatura, umidade, fumaca);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String gerarMensagemAlerta(String tipo) {
        return "Alerta de " + tipo + ": " + mensagem;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMensagem: " + mensagem;
    }
}
