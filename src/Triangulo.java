public class Triangulo extends Figuras_2{
    public Triangulo(float lado) {
        super(lado);
    }

    @Override
    public double perimetro() {
        double perimetro=getLado()*3;
        return perimetro;
    }
    public void mostrar_triangulo(){
        System.out.println("\nEl perimetro del triangulo es: "+perimetro());
    }
}