/*
 * ATIVIDADE 1 - ADS - PROGRAMAÇÃO II
 * ANDREY QUERINO
 * R.A 1971669-5
 */
package equacaosegundograu;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    
    public static void main(String[] args) {
        
        String opcao;
        double a, b, c;
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
            
            try {
                Calculo y = new Calculo(a, b, c);
            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
            } 
            
            System.out.print("\nDeseja Calcular outra Equação? ( S/N )? ");
            opcao = scanner.next();
            System.out.println("");
            
        } while(opcao.equalsIgnoreCase("S"));
        
        System.exit(0);   
    }
}
