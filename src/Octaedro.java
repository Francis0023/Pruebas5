class Octaedro extends Figura3D {
    double arista;

    Octaedro(double arista) {
        this.arista = arista;
    }

    @Override
    double calcularVolumen() {
        return (1.0 / 3.0) * Math.sqrt(2) * arista * arista * arista;
    }

    @Override
    double calcularAreaSuperficie() {
        return 2 * Math.sqrt(3) * arista * arista;
    }
}