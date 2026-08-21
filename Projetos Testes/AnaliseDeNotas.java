import java.util.Scanner;
public class AnaliseDeNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = ler.nextDouble();
        }
        
        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;
        double maior = notas[0];
        double menor = notas[0];
        
        for (int i = 0; i <10; i ++){
            soma = soma + notas[i];
           
        if (notas[i]> maior){
            maior = notas[i];
            }
        
        if (notas[i] < menor){
            menor = notas[i];    
            }
        
        if (notas[i]>=7){
            aprovados = aprovados + 1;
            }else {
                reprovados = reprovados + 1;
                }
        }
            double media = soma / 10;
            
            System.out.println("Média da turma: " + media);
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);
            System.out.println("Aprovados: " + aprovados);
            System.out.println("Reprovados: " + reprovados);
    }
}