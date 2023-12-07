public class Hexagono extends Figuras_2{

    public Hexagono(float lado) {
        super(lado);
    }

    @Override
    public double perimetro() {
        double perimetro= getLado()*6;
        return perimetro;
    }

    public void mostrar_hexagono(){
        System.out.println("\nEl perimetro del hexagono es: "+perimetro());
    }
}
