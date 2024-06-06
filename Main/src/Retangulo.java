import java.util.Scanner;

public class Retangulo {
    Scanner sc = new Scanner(System.in);
    double ladoR;
    double alturaR;

    public Retangulo(double ladoR, double alturaR) {
        this.ladoR = ladoR;
        this.alturaR = alturaR;
    }

    double areaRetangulo()
    {
        System.out.println("Digite a altura do retangulo: ");
        alturaR = sc.nextDouble();
        System.out.println("Digite a largura do retangulo: ");
        ladoR = sc.nextDouble();
        return ladoR*alturaR;
    }

    double perimetroRetangulo()
    {
        return (ladoR*2)+(alturaR*2);
    }
}
