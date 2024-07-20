package umg.pricipal.pkg2;

public class clase2 {
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularCircunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calcularVolumenCubo(double lado) {
        return lado * lado * lado;
    }

    public static double calcularAreaPiramideCuadrada(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularVolumenPiramideCuadrada(double base, double altura) {
        return (base * altura) / 3; // Corregido: Volumen de la pirámide cuadrada
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
