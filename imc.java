import java.util.Scanner;

public class imc {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double altura, peso, imc;

        System.out.println("Digite seu peso: "); 
        peso = input.nextDouble();

        System.out.println("Digite sua altura: "); 
        altura = input.nextDouble(); 
 
        imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            System.out.printf("o seu imc é" + "a faixa de peso é: Abaixo do peso");
        } else if (imc <= 19 && imc <= 24.9){    

           System.out.printf("o seu imc é" + "a faixa de peso é: Peso normal ");
        } else if (imc <= 25.0 && imc <=  29.9){    
     
            System.out.printf("o seu imc é" + "a faixa de peso é: Sobrepeso");
        } else if (imc <= 30.0 && imc <=  34.9 ){    
         
            System.out.printf("o seu imc é" + "a faixa de peso é: Obesidade grau 1");
        } else if (imc <= 35.0 && imc <= 39.9){    

            System.out.printf("o seu imc é" + "a faixa de peso é: Obesidade grau 2");
        } else if (imc <= 40.0 ){   




}
}
} 

