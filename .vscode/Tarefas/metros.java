import java.util.Scanner;

public class metros {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float m, c;

        System.out.println("Digite um número");
        m = input.nextFloat();

        c = m * 100;

        System.out.printf ("Convertido para cm " + c + "\n");
}
}
