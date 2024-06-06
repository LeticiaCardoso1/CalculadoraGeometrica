import java.util.Scanner;
public class Calculadora {

    Scanner sc = new Scanner(System.in);
    Saudacao saudacao = new Saudacao("");

    int escolha;

    public Calculadora() {
        this.escolha = escolha;
    }


    public void calculadoraFormas(int escolha){
        saudacao.cumprimento();

        System.out.println("QUE TIPO DE FIGURA VOCÊ QUER CALCULAR, " + saudacao.mostrarNome().toUpperCase() + "?");
        System.out.println("1. PLANAS");
        System.out.println("2. ESPACIAIS");
        System.out.println("3. SAIR");
        escolha = sc.nextInt();
        switch (escolha){
            case 1:
                escolherPlanas();
                break;
            case 2:
                escolherEspaciais();
                break;
            case 3:
                System.out.println("Você saiu da calculadora, " + saudacao.mostrarNome().toUpperCase() + "!");
                break;
            default:
                System.out.println("Deu erro!");
        }
    }

    public void escolherPlanas() {
        System.out.println("QUAL VOCÊ QUER CALCULAR, " + saudacao.mostrarNome().toUpperCase() + "?" );
        System.out.println("1. QUADRADO");
        System.out.println("2. RETANGULO");
        System.out.println("3. CIRCULO");
        System.out.println("4. TRIÂNGULO EQUILÁTERO");
        System.out.println("5. HEXÁGONO REGULAR");
        System.out.println("6. VOLTAR AO MENU PRINCIPAL");
        System.out.println("7. SAIR");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                Quadrado quadrado = new Quadrado(0);
                System.out.println("A área do quadrado é: " + (quadrado.areaQuadrado()));
                System.out.println("O perimetro do quadrado é: " + (quadrado.perimetroQuadrado()));
                System.out.println("--------------------------------------------------------------");
                break;
            case 2:
                Retangulo retangulo = new Retangulo(0, 0);
                System.out.println("A area do retangulo é: " + (retangulo.areaRetangulo()));
                System.out.println("O perimetro do retangulo é: " + (retangulo.perimetroRetangulo()));
                System.out.println("--------------------------------------------------------------");
                break;
            case 3:
                Circulo circulo = new Circulo(0);
                System.out.println("A area do circulo é: " + circulo.areaCirculo());
                System.out.println("O perimetro do circulo é: " + circulo.perimetroCirculo());
                break;
            case 4:
                TrianguloEquilatero triangulo = new TrianguloEquilatero(0);
                System.out.println("A area do triangulo é: " + (triangulo.areaEquilatero()));
                System.out.println("O perimetro do triangulo é: " + (triangulo.perimetroEquilatero()));
                System.out.println("--------------------------------------------------------------");
                break;
            case 5:
                HexagonoRegular hexagonoRegular = new HexagonoRegular(0);
                System.out.print("A area do hexagono regular é: " + hexagonoRegular.areaHexagono());
                System.out.print("O perimetro do hexagono regular é: " + hexagonoRegular.perimetroHexagono());
                System.out.println("--------------------------------------------------------------");
                break;
            case 6:
                calculadoraFormas(0);
                System.out.println("--------------------------------------------------------------");
                break;
            case 7:
                System.out.println("Você saiu da calculadora, " + saudacao.mostrarNome().toUpperCase() + "!");
                break;
            default:
                System.out.println("Deu erro!");

        }
    }

    public void escolherEspaciais(){
        System.out.println("QUAL FORMA VOCÊ QUER CALCULAR, " + saudacao.mostrarNome().toUpperCase() + "?");
        System.out.println("1. CUBO");
        System.out.println("2. PARALELEPÍPEDO");
        System.out.println("3. ESFERA");
        System.out.println("4. PIRÂMIDE - BASE QUADRADA");
        System.out.println("5. CILINDRO");
        System.out.println("6. CONE");
        System.out.println("7. VOLTAR AO MENU PRINCIPAL");
        System.out.println("8. SAIR");
        escolha = sc.nextInt();

        switch (escolha){
            case 1:
                Cubo cubo = new Cubo(0);
                System.out.println("O volume do cubo é: "+ (cubo.volumeCubo()));
                System.out.println("A área superficial do cubo é: "+ (cubo.areaSuperficial()));
                System.out.println("--------------------------------------------------------------");
                break;
            case 2:
                Paralelepipedo paralelepipedo = new Paralelepipedo(0,0,0);
                System.out.println("O volume do paralelepípedo é: "+ (paralelepipedo.volumeParalelepipedo()));
                System.out.println("A area superficial do paralelepípedo é: " + (paralelepipedo.areaSuperficial()));
                break;
            case 3:
                Esfera esfera = new Esfera(0);
                System.out.println("O volume da esfera é: "+ (esfera.volumeEsfera()));
                System.out.println("A area superficial da esfera é: " + (esfera.areaSuperficial()));
                break;
            case 4:
                PiramideQuadrada piramideQuadrada = new PiramideQuadrada(0, 0, 0);
                System.out.println("A area superficial da pirâmide é: " + (piramideQuadrada.areaSuperficial()));
                System.out.println("O volume da Pirâmide é: "+ (piramideQuadrada.volumePiramide()));
                break;
            case 5:
                Cilindro cilindro = new Cilindro(0, 0);
                System.out.println("A area superficial do cilindro é: " + (cilindro.areaSuperficial()));
                System.out.println("O volume do cilindro é: "+ (cilindro.volumeCilindro()));
                break;

            case 6:
                Cone cone = new Cone(0, 0);
                System.out.println("A area superficial do cilindro é: " + (cone.areaSuperficial()));
                System.out.println("O volume do cilindro é: "+ (cone.volumeCone()));
                break;
            case 7:
                calculadoraFormas(0);
                break;
            case 8:
                System.out.println("Você saiu da calculadora, " + saudacao.mostrarNome().toUpperCase() + "!");
                break;
            default:
                System.out.println("Deu erro!");
        }
    }
}
