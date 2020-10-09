package mediacurso;

import java.util.Scanner;

public class MediaCurso {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in, "ISO-8859-1");
        double nf1, nf2, r1, r2, rf;
        System.out.print("Digite sua nota 1: ");
        nf1 = leitor.nextDouble();
        r1 = nf1 * 0.4;
        System.out.println("Sua média 1: "+r1);
        System.out.print("Digite a nota 2 que corresponde a nota da prova: ");
        nf2 = leitor.nextDouble();
        r2 = nf2 * 0.6;
        System.out.println("Sua nota 2 é: "+r2);
        rf = r1 + r2;
        System.out.println ("Sua nota final é: "+rf);
        if (rf < 6) {
            System.out.println("Você foi reprovado.");
        }
        else if (rf >= 6) {
            System.out.println("Parabéns, você foi aprovado.");
        }
    }
}