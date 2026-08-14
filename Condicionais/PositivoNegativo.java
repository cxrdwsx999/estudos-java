import java.util.Scanner 

public class PositivoNegativo {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        if (n > 0){
        System.out.println("O numero é positivo");
        } else (n < 0) {
            System.out.println("é negativo");
        } else {
            System.out.println("é igual a zero");
            }  
        }
     
    }
}
