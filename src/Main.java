public class Main {
  public static void main(String[] args) {

    Cliente venilton = new Cliente();
    venilton.setNome("Venilton");

    Conta cc = new ContaCorrente(venilton);
    Conta pouponca = new ContaPoupanca(venilton);
    
    cc.depositar(100);
    cc.transferir(100, pouponca);


    cc.imprimirExtrato();
    pouponca.imprimirExtrato();
  }

}

