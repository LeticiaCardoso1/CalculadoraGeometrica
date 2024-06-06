import java.util.Scanner;

public class HexagonoRegular {
    Scanner sc = new Scanner(System.in);

    double ladoH;

    public HexagonoRegular(double ladoH) {
        this.ladoH = ladoH;
    }

    double areaHexagono()
    {
        System.out.println("Digite o valor do lado do hexagono: ");
        ladoH = sc.nextDouble();
        return 6 * ladoH * Math.sqrt(3.0/4.0);
    }

    double perimetroHexagono(){
        return ladoH * 6;
    }
}
