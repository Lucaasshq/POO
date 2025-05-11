public class _1_3_abstracao_encapsulamento {
  public static void main(String[] args) {

    conta c1 = new conta("Lucas", 250.0);
    ContaBancaria banco = new ContaBancaria(c1, "nubank");

    String nome = banco.getConta().getNome();
    double saldo = banco.getConta().getSaldo();
    String nomeBanco = banco.getBanco();
    
    System.out.println("Nome do usuario: "+ nome);
    System.out.println("Saldo: "+ saldo);
    System.out.println("Banco: "+ nomeBanco);
    banco.getConta().depositar(100);

  }
}
