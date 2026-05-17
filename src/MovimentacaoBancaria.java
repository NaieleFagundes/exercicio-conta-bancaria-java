public class MovimentacaoBancaria {
    public static void main(String[] args) {

        ContaPoupanca cliente1 = new ContaPoupanca("João Silva", 1000, 100, 12);
        System.out.println("----- Conta Poupança -----");
        cliente1.depositar(100);
        cliente1.sacar(80);
        cliente1.consultarSaldo();
        cliente1.calcularNovoSaldo (0.5f);//passa a taxa de rendimento float


        ContaEspecial cliente2 = new ContaEspecial("Maria Souza", 2000, 200, 100);
        System.out.println("----- Conta Especial -----");
        cliente2.depositar(800);
        cliente2.sacar(80);
        cliente2.consultarSaldo();

        ContaEspecial cliente3 = new ContaEspecial("Joana Cunha", 3000, 20, 100);
        System.out.println("----- Conta Especial ----- ");
        cliente3.depositar(40);
        cliente3.sacar(80);
        cliente3.consultarSaldo(); //adição própria: tratamento de um segundo caso em Conta Especial, caso a pessoa
        //queira sacar parte do limite dela
        //exibe Saldo, Limite e Saldo devedor (o que deve ao banco por ter sacado parte do limite)

        //imprimir dados do cliente 1, conta poupança
        System.out.println("------------------------------------");
        System.out.println("Dados do cliente: ");
        System.out.println("Nome: " +cliente1.getCliente());
        System.out.println("Número da conta: " + cliente1.getNumConta());
        System.out.println("Saldo: R$ " + cliente1.getSaldo());
        System.out.println("Dia do rendimento: " + cliente1.getDiaRendimento());
        System.out.println("------------------------------------");
    }
}
