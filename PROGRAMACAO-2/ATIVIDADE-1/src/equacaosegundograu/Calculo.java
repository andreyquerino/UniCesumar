/*
 * ATIVIDADE 1 - ADS - PROGRAMAÇÃO II
 * ANDREY QUERINO
 * R.A 1971669-5
 */
package equacaosegundograu;

public class Calculo {

    public Double a, b, c;
    
    private static double resultado(double delta, double x1, double x2){
        System.out.printf("\nValor de Δ: %.0f", delta);
        System.out.printf("\nValor de x¹: %.2f", x1);
        System.out.printf("\nValor de x²: %.2f", x2);
        return 0;
    }
    
    public Calculo(Double a, Double b, Double c){  
        
        this.a = a;
        this.b = b;
        this.c = c;
        double x1, x2, delta;
        
        delta = Math.pow(b, 2) -4 * a * c;
        x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        x2 = ((-b - Math.sqrt(delta)) / (2 * a));
        
        if (delta < 0){
            
            throw new RuntimeException("\n\n→ A EQUAÇÃO NÃO POSSUI VALORES REAIS! ←");
                
        } else if(x1 == x2){
                
            resultado(delta, x1, x2);
            throw new RuntimeException("\n\n→ EQUAÇÃO COM RAÍZES IGUAIS! ←");

        } else {
                
            resultado(delta, x1, x2);
            throw new RuntimeException("\n\n→ EQUAÇÃO COM RAÍZES DIFERENTES! ←");   
            
        }
    }
}
