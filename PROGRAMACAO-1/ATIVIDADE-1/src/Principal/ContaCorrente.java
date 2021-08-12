package Principal;

public class ContaCorrente extends Conta {
   
    public ContaCorrente(String nome, String cpf, int agencia, int numero){
        super(agencia,numero);
        this.pessoa = new Cliente(nome, cpf);
        this.saldo = 0;
    }

    private final double DescontoTaxaSaque = 0.10;
    
    @Override
    public void sacar(double valor) {
        valor += DescontoTaxaSaque;
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
        else {
            System.out.println("Erro ao realizar saque! valor do saque deve ser menor que o saldo atual!");
        }
    }

    @Override
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public int getAgencia() {
        return this.agencia;
    }

    @Override
    public int getNumero() {
        return this.numero;
    }
    
}