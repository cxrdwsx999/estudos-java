import java.util.Scanner;
public class Nome{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira seu nome");
        String nome = ler.nextLine();
        
        if(nome.equals("Gabriel")){
            System.out.println("Olá criador, seja bem-vindo!!");
        }else {
            System.out.println("Olá, seja bem-vindo");
        }
    }
}
