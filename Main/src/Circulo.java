import java.util.Scanner;

public class Circulo {
    Scanner sc = new Scanner(System.in);
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double areaCirculo()
    {
        System.out.println("Digite o valor do raio: ");
        double r = sc.nextDouble();
        return Math.PI * raio*raio;
    }

    double perimetroCirculo(){
        return 2 * Math.PI * raio;
    }
}
