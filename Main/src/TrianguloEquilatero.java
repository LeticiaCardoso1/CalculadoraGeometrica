import java.util.Scanner;

public class TrianguloEquilatero {
    Scanner sc = new Scanner(System.in);
    double ladoT;

    public TrianguloEquilatero(double ladoT) {
        this.ladoT = ladoT;
    }
    double areaEquilatero ()
    {
        System.out.println("Digite o lado do triangulo: ");
        ladoT = sc.nextDouble();
        return ladoT * Math.sqrt(3.0/4.0);
    }
    double perimetroEquilatero(){
        return ladoT * 3;
    }
}
