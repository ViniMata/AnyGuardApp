package Controller;

import Model.Sensor;

public class SensorController {

    public Sensor criarSensor(String regiao, double temperatura, double umidade, double fumaca) {
        return new Sensor(regiao, temperatura, umidade, fumaca);
    }

    public double calcularRisco(Sensor sensor) {
        return sensor.calcularRisco();
    }
}
