/*
 * ATIVIDADE 1 - ADS - PROGRAMAÇÃO I - 2021
 * Andrey Querino
 * R.A 1971669-5
 */

package Principal;

public class Principal {
    
    public static void main(String[] args){
        
        ContaCorrente contac = new ContaCorrente("Andrey", "444.444.444-44", 0004, 4444-4);
        System.out.println("Dados da Conta Corrente:");
        contac.ExibirDadosConta();
        
        System.out.println("\n");
        
        ContaPoupanca contap = new ContaPoupanca("Querino", "555.555.555-55", 0005, 5555-5);
        System.out.println("Dados da Conta Poupança:");
        contap.ExibirDadosConta(); 
        
    }
}
