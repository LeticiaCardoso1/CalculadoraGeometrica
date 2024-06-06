import java.util.Scanner;

public class Saudacao {
    Scanner sc = new Scanner(System.in);

    String nome;

    public Saudacao(String nome) {
        this.nome = nome;
    }

    void cumprimento(){
        System.out.println("Como gostaria de ser chamado(a): ");
        this.nome = sc.nextLine();
    }
    String mostrarNome(){
        return this.nome;
    }



}
