import java.util.Scanner;
public class MediaNotas{
public static void main(String []args ){
    Scanner ler = new Scanner(System.in);
    System.out.println("==== Informe as suas notas!! ====");
    
    double nota1 = ler.nextDouble();
    double nota2 = ler.nextDouble();
    double media = (nota1 + nota2) /2;
    if (media>= 7){
        System.out.println("Parabens!! Foi Aprovado!!");
    }else{
        System.out.println("Infelizmente foi reprovado...");
    }
}
}
