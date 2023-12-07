class Octaedro extends Figura3D {
    public Octaedro(float aristas) {
        super(aristas);
    }

    @Override
    public double volumen() {
        double volumen=(1.0 / 3.0) * Math.sqrt(2) * arista * arista * arista;
        return volumen;
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