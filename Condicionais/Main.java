import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        
	System.out.println("==== Digite um numero ====");
	    int n = ler.nextInt();
	
	if (n %2 == 0) { 	
		System.out.println("É par");
	} else {
	    System.out.println("É impar");
	}
}
}
