import java.util.Scanner;
public class SomaN{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("INSIRA UM NUMERO");
        int numero = ler.nextInt();
        int soma = 0;
        for (int i = 1; i <= numero; i++){
            soma = soma + i;
         System.out.println("Somando " + i + ", total parcial: " + soma);
        }
        System.out.println("A soma é: " + soma);
        
    }
}
