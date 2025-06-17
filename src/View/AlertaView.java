package View;

import Controller.AlertaController;
import Model.Alerta;

import java.util.Scanner;

public class AlertaView {
    AlertaController controller = new AlertaController();

    public void mostrarAlerta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Região: ");
        String regiao = scanner.nextLine();
        System.out.print("Temperatura: ");
        double temperatura = scanner.nextDouble();
        System.out.print("Umidade: ");
        double umidade = scanner.nextDouble();
        System.out.print("Fumaça: ");
        double fumaca = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Mensagem: ");
        String mensagem = scanner.nextLine();

        Alerta alerta = controller.criarAlerta(regiao, temperatura, umidade, fumaca, mensagem);
        System.out.println(alerta.toString());

        String msg = controller.obterMensagem(alerta, "Incêndio");
        System.out.println("Mensagem formatada: " + msg);
    }
}
