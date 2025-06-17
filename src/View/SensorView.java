package View;

import Controller.SensorController;
import Model.Sensor;

import java.util.Scanner;

public class SensorView {
    SensorController controller = new SensorController();

    public void mostrarSensor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Região: ");
        String regiao = scanner.nextLine();
        System.out.print("Temperatura: ");
        double temperatura = scanner.nextDouble();
        System.out.print("Umidade: ");
        double umidade = scanner.nextDouble();
        System.out.print("Fumaça: ");
        double fumaca = scanner.nextDouble();

        Sensor sensor = controller.criarSensor(regiao, temperatura, umidade, fumaca);
        System.out.println(sensor.toString());

        double risco = controller.calcularRisco(sensor);
        System.out.println("Risco calculado: " + risco);
    }
}
