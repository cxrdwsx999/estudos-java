import java.util.Scanner;
public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
            double num1 = ler.nextDouble();
        
        System.out.println("Digite o segundo número:");
            double num2 = ler.nextDouble();
        
        System.out.println("Digite a operação (+, -, *, /):");
            String operacao = ler.next();
        if (operacao.equals("+")) {
            double resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
        }else if (operacao.equals("-")) {
            double resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
        }else if (operacao.equals("*")){
            double resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
        }else if (operacao.equals("/")) {
            double resultado = num1 / num2;
        System.out.println("Resultado: " + resultado);    
        }else{
        System.out.println("OPERAÇÃO INVÁLIDA");
        }
    
        
    }
}
