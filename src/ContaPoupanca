public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;
    private float taxaRendimento;

    public ContaPoupanca (String cliente, int numConta, float saldo, int diaRendimento) {//tem que
        //chamar todos os construtores da classe mãe
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(float taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void consultarSaldo (){
        System.out.println("Saldo atual: R$" + getSaldo());
    }

    public void calcularNovoSaldo (float taxaRendimento){
        super.setSaldo(getSaldo()+(getSaldo()*taxaRendimento/100));//comentar
        System.out.println("Saldo com novos redimentos: R$" + getSaldo()+ "\n");
    }

}
