import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Elija una figura:");
            System.out.println("1. Figura 2D");
            System.out.println("2. Figura 3D");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int opcion2D;
                    do {
                        System.out.println("Elija una figura geométrica ");
                        System.out.println("1. Círculo\n2. Triángulo\n3. Cuadrilátero\n4. Pentágono\n5. Hexágono\n6. Heptágono\n0. Salir");
                        opcion2D = scanner.nextInt();

                        switch (opcion2D) {
                            case 1:
                                System.out.println("Ingresa el radio del Círculo: ");
                                Circulo circulo_uno = new Circulo(scanner.nextFloat());
                                circulo_uno.mostrar_circulo();
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("Ingrese el lado del Triángulo: ");
                                Triangulo triangulo_uno = new Triangulo(scanner.nextFloat());
                                triangulo_uno.mostrar_triangulo();
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("Ingrese el lado del Cuadrilátero: ");
                                Cuadrilatero cuadrado_uno = new Cuadrilatero(scanner.nextFloat());
                                cuadrado_uno.mostrar_cuadrado();
                                System.out.println();
                                break;
                            case 4:
                                System.out.println("Ingrese el lado del Pentágono: ");
                                Pentagono pentagono_uno = new Pentagono(scanner.nextFloat());
                                pentagono_uno.mostrar_pentagono();
                                System.out.println();
                                break;
                            case 5:
                                System.out.println("Ingrese el lado del Hexágono: ");
                                Hexagono hexagono_uno = new Hexagono(scanner.nextFloat());
                                hexagono_uno.mostrar_hexagono();
                                System.out.println();
                                break;
                            case 6:
                                System.out.println("Ingrese el lado del Heptágono: ");
                                Heptagono heptagono_uno = new Heptagono(scanner.nextFloat());
                                heptagono_uno.mostrar_heptagono();
                                System.out.println();
                                break;
                            case 0:
                                System.out.println("Saliendo del programa. ¡Hasta luego!");
                                System.exit(0);
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    } while (opcion2D != 0);
                    break;
                case 2:
                    //Scanner scanner = new Scanner(System.in);

                    // Menú para el usuario
                    System.out.println("Seleccione una figura en 3D:");
                    System.out.println("1. Pirámide");
                    System.out.println("2. Octaedro");
                    System.out.println("3. Icosaedro");
                    System.out.println("4. Cubo");
                    System.out.println("5. Esfera");

                    int opcion2 = scanner.nextInt();

                    Figura3D figura = null;

                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese la base de la pirámide:");
                            double basePiramide = scanner.nextDouble();
                            System.out.println("Ingrese la altura de la pirámide:");
                            double alturaPiramide = scanner.nextDouble();
                            figura = new Piramide(basePiramide, alturaPiramide);
                            break;
                        case 2:
                            System.out.println("Ingrese la longitud de la arista del octaedro:");
                            double aristaOctaedro = scanner.nextDouble();
                            figura = new Octaedro(aristaOctaedro);
                            break;
                        case 3:
                            System.out.println("Ingrese la longitud de la arista del icosaedro:");
                            double aristaIcosaedro = scanner.nextDouble();
                            figura = new Icosaedro(aristaIcosaedro);
                            break;
                        case 4:
                            System.out.println("Ingrese la longitud de la arista del cubo:");
                            double aristaCubo = scanner.nextDouble();
                            figura = new Cubo(aristaCubo);
                            break;
                        case 5:
                            System.out.println("Ingrese el radio de la esfera:");
                            double radioEsfera = scanner.nextDouble();
                            figura = new Esfera(radioEsfera);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            System.exit(1);
                    }

                    // Calcular y mostrar resultados
                    System.out.println("Volumen: " + figura.calcularVolumen());
                    System.out.println("Área de superficie: " + figura.calcularAreaSuperficie());

                    scanner.close();
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
