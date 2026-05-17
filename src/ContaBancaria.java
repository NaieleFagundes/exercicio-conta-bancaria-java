public abstract class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria (String cliente, int numConta, float saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar (float valor){
        if (valor <= 0){
            System.out.println("Valor do saque inválido.");//nisso que vai mexer para tirar no limite
        }
        else if (valor <= saldo ){//ex. retira 8 de um saldo de 20, sobra 12
            this.saldo -=valor; //debita do saldo esse valor
        }else{
            System.out.println("Saldo insuficiente para realizar o saque.");//ou retorna uma msg de erro
        }
    }

    public void depositar (float valor){ //valor é uma variável local
        this.saldo +=valor; //saldo (private) é incremetado com valor
    }

    public abstract void consultarSaldo ();

}
