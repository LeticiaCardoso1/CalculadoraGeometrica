import java.util.Scanner;

public class PiramideQuadrada {
    Scanner sc = new Scanner(System.in);
    double arestaB;
    double apotema;
    double altura;

    public PiramideQuadrada(double arestaB, double apotema, double altura) {
        this.arestaB = arestaB;
        this.apotema = apotema;
        this.altura = altura;
    }

    double areaSuperficial(){
        System.out.println("Digite o valor da aresta da base: ");
        arestaB = sc.nextDouble();
        System.out.println("Digite o valor da apotema:");
        apotema = sc.nextDouble();
        System.out.println("Digite o valor da altura:");
        altura = sc.nextDouble();
        return (2 * arestaB * apotema) + arestaB * arestaB;
    }
    double volumePiramide(){
        return (arestaB * arestaB * altura)/3;
    }
}
