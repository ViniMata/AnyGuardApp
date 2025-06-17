package Controller;

import Model.Alerta;

public class AlertaController {

    public Alerta criarAlerta(String regiao, double temperatura, double umidade, double fumaca, String mensagem) {
        return new Alerta(regiao, temperatura, umidade, fumaca, mensagem);
    }

    public String obterMensagem(Alerta alerta, String tipo) {
        return alerta.gerarMensagemAlerta(tipo);
    }
}
