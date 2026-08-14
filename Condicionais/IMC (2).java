import java.util.Scanner;
public class IMC {
    public static void main (String []args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o peso:");
        double peso = ler.nextDouble();
        System.out.println("Digite a altura:");
        double altura = ler.nextDouble();
        double imc = peso / (altura * altura);
        
        System.out.printf("Seu IMC é %.2f%n", imc);
        
        if (imc >= 18.5 && imc <= 25){
            System.out.println("PESO NORMAL");
        } else if (imc < 18.5){
            System.out.println("ABAIXO DO PESO");
        } else {
            System.out.println("ACIMA DO PESO");
        }
    }
}
