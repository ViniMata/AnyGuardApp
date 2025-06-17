package Controller;

import Model.EventoClimatico;

public class EventoClimaticoController {

    public EventoClimatico criarEvento(String tipo, String descricao, String foto) {
        return new EventoClimatico(tipo, descricao, foto);
    }

    public boolean verificarGravidade(EventoClimatico evento, String palavraChave) {
        return evento.ehEventoGrave(palavraChave);
    }
}
