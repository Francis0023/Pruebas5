public class Pentagono extends Figuras_2{

    public Pentagono(float lado) {
        super(lado);
    }

    @Override
    public double perimetro() {
        double perimetro= getLado()*5;
        return perimetro;
    }

    public void mostrar_pentagono(){
        System.out.println("El perimetro del pentagono es: "+perimetro());
    }
}
