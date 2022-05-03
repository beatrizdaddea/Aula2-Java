public class Triangulo extends FormaGeometrica {

    public int base;
    public int altura; 

    @Override
    public void calcularArea() {
        System.out.println((base* altura)/2);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
