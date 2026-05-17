public class ContaEspecial extends ContaBancaria{
    private float limite;
    private float limiteAtual; //adições de variáveis ao exercício para lidar com o caso de Saldo Devedor
    private float saldoDevedor;


    public ContaEspecial (String cliente, int numConta, float saldo, float limite){
        super (cliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar (float valor){
        //objetivo: permitir saldo negativo até o valor do limite
        if (valor <= 0 ){ // tratamento caso o valor do saque seja inferior a 0
            System.out.println("Valor do saque inválido.");
        } else if (valor > (getSaldo()+ this.limite)) {//se é maior que o saldo e o limite (que é de 100)
            System.out.println("Limite excedido");
        } else {//usa o que tem e empresta o limite
            setSaldo(getSaldo() - valor); //modifica o saldo
        }
    }

    public void consultarSaldo (){
        System.out.println("Saldo atual: R$" + getSaldo());

        if (getSaldo() < 0) { //Adições próprias: tratamento de sacar parte do limite
            this.limiteAtual = this.limite + getSaldo(); //limite atual recebe o valor do limite + saldo
            this.saldoDevedor = getSaldo() * - 1;// para mostar a dívida. Não permite ficar negativo
            System.out.println("Limite atual: R$" + limiteAtual);
            System.out.println("Saldo devedor: R$" + saldoDevedor);
        } else {
            System.out.println("Limite atual: R$" + this.limite);// caso a pessoa não tenha sacado o limite
            System.out.println("Saldo devedor: R$ 0.0\n");
        }
    }
}
