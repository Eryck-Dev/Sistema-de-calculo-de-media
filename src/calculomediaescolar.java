import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nota;
        int nota2;
        int nota3;

        do {
            System.out.println("Digite sua nota (0 a 10):");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10){
                System.out.println("Nota Inválida");
            }
        } while (nota < 0 || nota > 10);

        do {
            System.out.println("Digite sua segunda nota (0 a 10):");
            nota2 = sc.nextInt();
            if (nota2 < 0 || nota2 > 10){
                System.out.println("Nota Inválida");
            }
        } while (nota2 < 0 || nota2 > 10);

        do {
            System.out.println("Digite sua terceira nota (0 a 10):");
            nota3 = sc.nextInt();
            if (nota3 < 0 || nota3 > 10){
                System.out.println("Nota Inválida");
            }
        } while (nota3 < 0 || nota3 > 10);

        double media = (nota + nota2 + nota3) / 3.0;
        System.out.println("Média Final: " + media);

        if (media >= 7){
            System.out.println("Resultado: Aprovado");
        } else if (media >= 5){
            System.out.println("Resultado: Recuperação");
        } else {
            System.out.println("Resultado: Reprovado");
        }

        sc.close();
    }
}
