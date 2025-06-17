package View;

import Controller.EventoClimaticoController;
import Model.EventoClimatico;

import java.util.Scanner;

public class EventoClimaticoView {
    EventoClimaticoController controller = new EventoClimaticoController();

    public void mostrarEvento() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo do evento: ");
        String tipo = scanner.nextLine();
        System.out.print("Digite a descrição do evento: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o link da foto: ");
        String foto = scanner.nextLine();

        EventoClimatico evento = controller.criarEvento(tipo, descricao, foto);
        System.out.println("Evento criado com sucesso!");
        System.out.println(evento.toString());

        System.out.print("Digite uma palavra-chave para verificar gravidade: ");
        String palavra = scanner.nextLine();

        boolean grave = controller.verificarGravidade(evento, palavra);
        System.out.println("Evento é grave? " + grave);
    }
}
