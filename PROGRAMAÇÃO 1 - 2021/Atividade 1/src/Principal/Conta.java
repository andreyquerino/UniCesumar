package Principal;

public abstract class Conta {
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente pessoa;
    
    public abstract int getAgencia() ;
    public abstract int getNumero() ;
    public abstract double getSaldo();

    public void ExibirDadosConta(){
        System.out.println("Nome: " + this.pessoa.getNome());
        System.out.println("CPF: " + this.pessoa.getCpf());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Número Conta: " + this.getNumero());
        System.out.println("Saldo: R$ "+ this.getSaldo());    
    }
  
    public abstract void sacar(double valor);
    public void depositar(double valor){
        this.saldo += valor; 
    }

    public Conta(int agencia, int numero){
        if(agencia > 0 && numero > 0){
            this.agencia = agencia;
            this.numero = numero;
        } 
        else {
             System.out.println("Agência e número devem ser maior que zero");
        }
    }
    
}