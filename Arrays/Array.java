import java.util.Scanner;
public class Array{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva 5 numeros");
		int[] numeros = new int [5];
		for (int i = 0; i < 5; i++){
		numeros[i] = ler.nextInt();    
		}
		int maior = numeros[0];
		for (int i = 1; i < 5; i++){
		if (numeros[i] > maior){
		   maior = numeros[i]; 
		    } 
		}
		System.out.println("O número maior é: "+ maior);
	}
}
