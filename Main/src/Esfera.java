import java.util.Scanner;

public class Esfera {
    Scanner sc = new Scanner(System.in);
    double esferaR;

    public Esfera(double esferaR) {
        this.esferaR = esferaR;
    }
    double areaSuperficial(){
        System.out.println("Digite o valor do raio: ");
        double esferaR = sc.nextDouble();
        return 4* Math.PI * esferaR * esferaR;
    }
    double volumeEsfera(){
        return Math.sqrt(4.0/3.0) * esferaR * esferaR *esferaR;
    }
}
