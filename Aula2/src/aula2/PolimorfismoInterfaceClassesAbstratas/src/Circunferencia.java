public class Circunferencia extends FormaGeometrica{
    public Double raio;

    @Override
    public void calcularArea() {
        System.out.println(Math.PI * (raio * raio));
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    
    
}
