package Model;

public class Sensor {
    private String regiao;
    private double temperatura;
    private double umidade;
    private double fumaca;

    public Sensor(String regiao, double temperatura, double umidade, double fumaca) {
        this.regiao = regiao;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.fumaca = fumaca;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public double getFumaca() {
        return fumaca;
    }

    public void setFumaca(double fumaca) {
        this.fumaca = fumaca;
    }

    public double calcularRisco() {
        return (temperatura * 0.4 + fumaca * 0.5 - umidade * 0.3);
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "regiao='" + regiao + '\'' +
                ", temperatura=" + temperatura +
                ", umidade=" + umidade +
                ", fumaca=" + fumaca +
                '}';
    }
}
