class Icosaedro extends Figura3D {
    double arista;

    Icosaedro(double arista) {
        this.arista = arista;
    }

    double calcularVolumen() {
        return (5.0 / 12.0) * (3 + Math.sqrt(5)) * arista * arista * arista;
    }

    double calcularAreaSuperficie() {
        return 5 * Math.sqrt(3) * arista * arista;
    }
}
