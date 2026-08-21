import java.util.Scanner;
public class VerificadorPalavra {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        String palavra = ler.next();
        
        if(palavra.equals("spam") || palavra.equals("bloqueado") || palavra.equals("banido")) {
           System.out.println("Palavra bloqueada!!");
        }else{
            System.out.println("Palavra permitida!!");
        }
    }
 }