package Entities;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo() {
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double area() {
        double p = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }

    public boolean isValido() {
        return ladoA + ladoB > ladoC
                && ladoA + ladoC > ladoB
                && ladoB + ladoC > ladoA;
    }

    public static Triangulo trianguloMaior(Triangulo triangulo1, Triangulo triangulo2) {
        return triangulo1.area() > triangulo2.area() ? triangulo1 : triangulo2;
    }
}
