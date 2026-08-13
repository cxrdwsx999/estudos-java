import java.util.Scanner;
public class MaiorDeTres
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		System.out.println("==== Insira 3 numeros diferentes ====");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		
		if (a > b  && a > c) { 
		    System.out.println("A é o maior numero");
		}else if (b > a && b > c){
		    System.out.println("B é o maior numero");
		}else{
		    System.out.println("C é o maior numero");
		}
		}
}
