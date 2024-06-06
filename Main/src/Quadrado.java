import java.util.Scanner;

public class Quadrado {
    Scanner sc = new Scanner(System.in);

    double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }

    double areaQuadrado ()
    {
        System.out.println("Digite o valor do lado do quadrado: " );
        lado = sc.nextDouble();
        return lado*lado;
    }
    double perimetroQuadrado()
    {
        return lado*4;
    }
}
