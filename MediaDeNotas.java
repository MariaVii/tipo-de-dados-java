import java.util.Scanner;

public class MediaDeNotas {

    Scanner input = new Scanner(System.in);
    int n1, n2, media;

    System.out.println("Informe o valor da primeira nota : ");
    n1 = input.nextInt();

    System.out.println("Informe o valor da primeira nota : ");
    n2 = input.nextInt();

    media = (n1 + n2) /2 ;

    System.out.printl("primeira nota foi = " + n1);
    System.out.printl("\n Segunda nota foi = " + n2);
    System.out.printl("\n sua média é = " + media + "\n");

    if (media >= 8 && media <= 10 )
    {
        System.out.print(s:"Aluno está aprovado \n");
}else if (media >= 5 && media <= 7) {
    System.out.print("Aprovado, mas terá que fazer recuperação \n");
} else if (media >= 0 && media <= 4) {
    System.out.print("Aluno está reprovado \n");
} else{
    System.out.print("erro na media \n");
}
}
}
