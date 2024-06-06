public class Paralelepipedo {
    double comprimento;
    double altura;
    double largura;

    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    double volumeParalelepipedo(){
        return comprimento * altura * largura;
    }

    double areaSuperficial(){
        return 2 * ((comprimento * altura)+ (altura * largura) + (comprimento * largura));
    }


}
