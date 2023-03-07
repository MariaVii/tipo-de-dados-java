import java.util.Scanner;

public class treinamento3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double Salarionovo, salarioAtual;

        System.out.println("Informe seu salário Atual: "); 
        salarioAtual = input.nextDouble();

        if (salarioAtual >= 1000 && salarioAtual < 2000) {
          Salarionovo = salarioAtual * 1.15 ;
          System.out.println("Seu novo salário vai ser: " + Salarionovo);

        }else if (salarioAtual >= 2000 && salarioAtual < 3000) {
            Salarionovo = salarioAtual * 1.10;
            System.out.println("Seu novo salário vai ser: " + Salarionovo);

        }else if (salarioAtual >= 3000) {
            Salarionovo = salarioAtual * 1.05;
            System.out.println("Seu novo salário vai ser: " + Salarionovo);

        }else {
            Salarionovo = salarioAtual;
        }

    }
}
        
        
    




















    




















}
