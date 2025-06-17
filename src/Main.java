import View.AlertaView;
import View.EventoClimaticoView;
import View.SensorView;
import View.UsuarioView;

public class Main {
    public static void main(String[] args) {

        UsuarioView usuarioView= new UsuarioView();
        SensorView sensorView = new SensorView();
        EventoClimaticoView eventoClimaticoView = new EventoClimaticoView();
        AlertaView alertaView = new AlertaView();

        usuarioView.mostrarCadastroUsuario();
        sensorView.mostrarSensor();
        eventoClimaticoView.mostrarEvento();
        alertaView.mostrarAlerta();
    }
}