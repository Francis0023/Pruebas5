public class Heptagono extends Figuras_2{

    public Heptagono(float lado) {
        super(lado);
    }

    @Override
    public double perimetro() {
        double perimetro=getLado()*7;
        return perimetro;
    }

    public void mostrar_heptagono(){
        System.out.println("El perimetro del heptago es: "+perimetro());
    }
}


