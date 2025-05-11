public class ContaBancaria {
 private conta conta;
 private String banco;

 public ContaBancaria(conta conta, String banco){
  this.conta = conta;
  this.banco = banco;
 }

 public String getBanco() {
   return banco;
 }

 public conta getConta() {
   return conta;
 }
}
