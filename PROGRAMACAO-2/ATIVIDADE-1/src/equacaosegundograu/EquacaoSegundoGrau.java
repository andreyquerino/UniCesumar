/*
 * ATIVIDADE 1 - ADS - PROGRAMAÇÃO II
 * ANDREY QUERINO
 * R.A 1971669-5
 */
package equacaosegundograu;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    
     public static double resultado(double delta, double x1, double x2){
            System.out.printf("Valor de Δ: %.0f", delta);
            System.out.printf("\nValor de x¹: %.2f", x1);
            System.out.printf("\nValor de x²: %.2f", x2);
            return 0;
    }
    
    public static void main(String[] args) {
        
        String opcao;
        double a, b, c, x1, x2, delta;
        do {
            Scanner valores = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);

            System.out.println(".:: EQUAÇÃO DO 2º GRAU ::.");
            System.out.println("     ( Ax² + Bx + C )\n");
            System.out.print("Informe o valor de A: ");
            a = valores.nextDouble();
            System.out.print("Informe o valor de B: ");
            b = valores.nextDouble();
            System.out.print("Informe o valor de C: ");
            c = valores.nextDouble();
            System.out.printf("((%.0fx²) + (%.0fx) + (%.0f))\n", a, b, c);
            
            delta = Math.pow(b, 2) -4 * a * c;
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            
            if (delta < 0){
                System.out.println("\n→ A EQUAÇÃO NÃO POSSUI VALORES REAIS! ←");

            } else if(x1 == x2){
                
                System.out.println("\n→ EQUAÇÃO COM RAÍZES IGUAIS! ←");
                resultado(delta, x1, x2); 
                
            } else {
                
                System.out.println("\n→ EQUAÇÃO COM RAÍZES DIFERENTES! ←");
                resultado(delta, x1, x2);
                
            }
  
            System.out.print("\n\nDeseja Calcular outra Equação? ( S/N )? ");
            opcao = scanner.next();
            System.out.println("");
            
        } while(opcao.equalsIgnoreCase("S"));
        
        System.exit(0);
        
    }
    
}
