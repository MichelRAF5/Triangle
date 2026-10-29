import Entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangulo trianguloX = new Triangulo();
    Triangulo trianguloY = new Triangulo();

    System.out.println("Enter the measures of triangle X: ");
    trianguloX.setLadoA(sc.nextDouble());
    trianguloX.setLadoB(sc.nextDouble());
    trianguloX.setLadoC(sc.nextDouble());

    System.out.println("Enter the measures of triangle Y: ");
    trianguloY.setLadoA(sc.nextDouble());
    trianguloY.setLadoB(sc.nextDouble());
    trianguloY.setLadoC(sc.nextDouble());

    if (trianguloX.isValido() && trianguloY.isValido()) {

        System.out.printf("Triangle X area: %.4f%n", trianguloX.area());
        System.out.printf("Triangle Y area: %.4f%n", trianguloY.area());

        Triangulo maior = Triangulo.trianguloMaior(trianguloX, trianguloY);
        System.out.println("The bigger triangle: " + (maior == trianguloX ? "X is bigger" : "Y is bigger"));
    }
    else
        System.out.println("Invalid triangle: the sides do not satisfy the triangle inequality.");

    sc.close();
}