public class Cuadrilatero extends Figuras_2{

    public Cuadrilatero(float lado) {
        super(lado);
    }

    @Override
    public double perimetro() {
        double perimetro=this.getLado()*4;
        return perimetro;
    }

    public void mostrar_cuadrado(){
        System.out.println("\nEl perimetro del cuadrilatero es: "+perimetro());
    }
}
