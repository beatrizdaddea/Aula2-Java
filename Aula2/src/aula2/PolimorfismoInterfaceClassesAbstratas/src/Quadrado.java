public class Quadrado extends FormaGeometrica {

    public Integer lado;

    @Override
    public void calcularArea() {
        System.out.println(lado * lado);
    }

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }
    
}
