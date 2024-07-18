public class Conta implements IConta{
  // atributos
  private int agencia;
  private int numero;
  private int saldo;

  @Override
  public void sacar(double valor) {
    // TODO Auto-generated method stub
  }
  @Override
  public void depositar(double valor) {
    // TODO Auto-generated method stub
  }
  @Override
  public void transferir(double valor, Conta destino) {
    // TODO Auto-generated method stub
  }

  public int getAgencia() {
    return agencia;
  }
  public int getNumero() {
    return numero;
  }
  public int getSaldo() {
    return saldo;
  }
 
}
