import java.util.Scanner;
public class Estoque{
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] precos = new double[5];
        
        for (int i=0; i <5; i++){
            System.out.println("Digite o nome do produto: " + (i + 1) + ":");
            nomes[i] = ler.next();
            System.out.println("Digite o preço do Produto: " + (i+ 1) + ":");
            precos[i] = ler.nextDouble();
        }
            System.out.println();
            System.out.println("==== LISTA DE PRODUTOS ====");
            System.out.println();
        for (int i=0; i < 5; i++){
            System.out.println(nomes[i] + " - R$" + precos[i]);
            
        }
    }
}