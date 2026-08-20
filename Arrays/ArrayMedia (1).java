import java.util.Scanner;
public class ArrayMedia{
        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);
            System.out.println("Insira 5 números");
            int[]numeros = new int[5];
            for (int i = 0; i < 5; i++){
                numeros[i] = ler.nextInt();
            }
            double soma = 0;
            for (int i = 0; i <5; i++){
        soma = soma + numeros[i];
            }
            double media = soma/5;
            System.out.println("A sua média é: " + media);
        }
}