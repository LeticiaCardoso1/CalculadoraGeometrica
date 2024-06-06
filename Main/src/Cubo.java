import java.util.Scanner;

public class Cubo {
    Scanner sc = new Scanner(System.in);
    double ladoC;

    public Cubo(double ladoC) {
        this.ladoC = ladoC;
    }

    double areaSuperficial(){
        System.out.println("Digite o valor do lado do cubo: ");
        ladoC = sc.nextDouble();
        return ladoC * ladoC * 6;
    }
    double volumeCubo(){
        return Math.pow(ladoC, 3);
    }

}
