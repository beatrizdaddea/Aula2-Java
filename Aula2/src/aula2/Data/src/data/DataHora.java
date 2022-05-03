package data;

public class DataHora extends Data { //extends = herança

    private int hora;
    private int minuto;

    private int getHora() {
        return hora;
    }

    private void setHora(int hora) {
        this.hora = hora;
    }

    private int getMinuto() {
        return minuto;
    }

    private void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public DataHora(int dia, int mes, int ano, int hora, int minuto) {
        super(dia,mes,ano);
        this.hora = hora;
        this.minuto = minuto;
    }

    public String toString() {

        return getHora() + ":" + getMinuto();

    }
}
