package umg.pricipal.pkg1;

public class PKG1 {
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio; // Corregido: Área del círculo
    }

    public static double calcularCircunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
}
