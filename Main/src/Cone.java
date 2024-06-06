public class Cone {
    double alturaC;
    double raioC;

    public Cone(double alturaC, double raioC) {
        this.alturaC = alturaC;
        this.raioC = raioC;
    }

    double areaSuperficial(){
        return Math.PI * raioC * Math.sqrt(alturaC*alturaC + raioC * raioC);
    }
    double volumeCone(){
        return 1.0/3.0 * Math.PI * raioC * raioC * alturaC;
    }
}
