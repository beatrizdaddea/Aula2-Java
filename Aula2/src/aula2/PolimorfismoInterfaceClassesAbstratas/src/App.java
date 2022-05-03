public class App {
    public static void main(String[] args) throws Exception {
        
        Quadrado formaQuadrado = new Quadrado();
        formaQuadrado.setLado(10);
        formaQuadrado.calcularArea();

        Triangulo formaTriangulo = new Triangulo();
        formaTriangulo.setBase(8);
        formaTriangulo.setAltura(13);
        formaTriangulo.calcularArea();

        Circunferencia formaCircunferencia = new Circunferencia();
        formaCircunferencia.setRaio(3.6);
        formaCircunferencia.calcularArea();

        Trapezio formaTrapezio = new Trapezio();
        formaTrapezio.setBaseMaior(6);
        formaTrapezio.setBaseMenor(9);
        formaTrapezio.setAltura(3);
        formaTrapezio.calcularArea();
    }
}
