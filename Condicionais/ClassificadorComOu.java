import java.util.Scanner; 
public class ClassificadorComOu {
public static void main(String []args){ 
    Scanner ler = new Scanner(System.in);
   
    System.out.println("==== Insira tres numeros ====");
    int a = ler.nextInt();
    int b = ler.nextInt();
    int c = ler.nextInt();
     if (a == b && a == c) {
    System.out.println("O triangulo é equilatero");
} else if (a == b || a == c || b == c) {
    System.out.println("O triangulo é Isosceles");
} else {
    System.out.println("O triangulo é escaleno");
}
}
} 
