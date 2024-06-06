import java.util.Scanner;

public class Cilindro {
    Scanner sc = new Scanner(System.in);
    double alturaC;
    double raioC;

    public Cilindro(double alturaC, double raioC) {
        this.alturaC = alturaC;
        this.raioC = raioC;
    }

    double areaSuperficial(){
        System.out.println("Digite o valor do raio: ");
        raioC = sc.nextDouble();
        System.out.println("Digite o valor da altura:");
        alturaC = sc.nextDouble();
        return (2 * Math.PI * raioC * alturaC) + (2 * Math.PI * raioC *  raioC);
    }
    double volumeCilindro(){
        return Math.PI * alturaC * raioC * raioC;
    }
}
