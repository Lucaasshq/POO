public class conta {
  private String nome;
  private double saldo;

  public conta(String nome, double saldo){
    this.saldo = saldo;
    this.nome = nome;
  }

  public void depositar(double valor){
    if (valor > 0){
      saldo += valor;
      System.out.println("Deposito de R$"+valor+" recebido");
    }
  }

  public void verSaldo(){
    System.out.println(saldo);
  }

  public String getNome() {
    return nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
