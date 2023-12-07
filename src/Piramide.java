class Piramide extends Figura3D {
    double base;
    double altura;

    Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularVolumen() {
        return (1.0 / 3.0) * base * base * altura;
    }

    double calcularAreaSuperficie() {
        // Fórmula simplificada, no considera la superficie de la base
        return base * base + (base * Math.sqrt((base / 2) * (base / 2) + altura * altura));
    }
}