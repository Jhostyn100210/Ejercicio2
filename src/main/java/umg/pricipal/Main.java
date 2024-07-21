package umg.pricipal;
import umg.pricipal.pkg1.clase1;
import umg.pricipal.pkg2.clase2;
import umg.pricipal.pkg3.clase3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Área del círculo: " + clase1.areaCirculo(5));
        System.out.println("Circunferencia del círculo: " + clase1.circunferenciaCirculo(5));
        System.out.println("Volumen del cubo: " + clase1.volumenCubo(3));

        // PKG Grupo 2
        System.out.println("Área de la pirámide cuadrada: " + clase2.areaPiramideCuadrada(4, 6));
        System.out.println("Volumen de la pirámide cuadrada: " + clase2.volumenPiramideCuadrada(4, 6));
        System.out.println("Área del triángulo: " + clase2.areaTriangulo(4, 6));

        // PKG Grupo 3
        System.out.println("Volumen del prisma rectangular: " + clase3.volumenPrismaRectangular(24, 10));
        System.out.println("Área del paralelogramo: " + clase3.areaParalelogramo(4, 6));
        System.out.println("Volumen del cilindro: " + clase3.volumenCilindro(3, 7));
    }
}