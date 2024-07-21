package umg.pricipal.pkg3;

public class clase3 {
    // Volumen de un prisma rectangular
    public static double volumenPrismaRectangular(double areaBase, double altura) {
        return areaBase * altura;
    }

    // Área de un paralelogramo
    public static double areaParalelogramo(double base, double altura) {
        return base * altura;
    }

    // Volumen de un cilindro
    public static double volumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
