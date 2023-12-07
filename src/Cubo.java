public class Cubo extends Figura3D{
    double arista;
    Cubo(double arista) {
        this.arista = arista;
    }

    double calcularVolumen() {
        return arista * arista * arista;
    }
    double calcularAreaSuperficie() {
        return 6 * arista * arista;
    }
}
