package data;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    private int getDia() {
        return dia;
    }

    private void setDia(int dia) {
        this.dia = dia;
    }

    private int getMes() {
        return mes;
    }

    private void setMes(int mes) {
        this.mes = mes;
    }

    private int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno();

    }

}
