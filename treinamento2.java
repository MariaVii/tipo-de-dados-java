import java.util.Scanner;

public class treinamento2 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
     
        System.out.println("Informe seu nome : "); 
        nome = input.next();
    
        System.out.println("Informe a sua idade : "); 
        idade = input.nextInt();

        if (idade >= 0 && idade <= 12)
        {
            System.out.print("Você é criança!");

        }else if (idade >= 13 && idade <= 17){
                System.out.print("Você é adolescente!");

        }else if (idade >= 18 && idade <= 59){
            System.out.print("Você é adulto!");

        }else if(idade >60){
            System.out.print("Você é idoso!");
    }
    }
}
        
    

    

        

