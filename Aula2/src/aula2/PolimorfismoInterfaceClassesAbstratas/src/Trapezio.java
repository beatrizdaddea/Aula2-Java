public class Trapezio extends FormaGeometrica{
    public int baseMaior;
    public int baseMenor;
    public int altura;

    @Override
    public void calcularArea() {
        System.out.println(((baseMaior+baseMenor) / 2) * altura);
    }

    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
