import java.util.Scanner;
public class ContadorVogais{
    public static void main(String[] args ){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = ler.nextLine();
        
        int contadorVogais = 0;
        String vogaisEncontradas = "";
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            contadorVogais++;
            vogaisEncontradas = vogaisEncontradas + letra;
            
        }
        }
        System.out.println();
        System.out.println("==== CONTADOR DE VOGAIS ====");
        System.out.println();
        System.out.println("Total de vogais: " + contadorVogais); 
         System.out.println();
        System.out.println("Vogais encontradas: "+ vogaisEncontradas);
        
        
    }
}