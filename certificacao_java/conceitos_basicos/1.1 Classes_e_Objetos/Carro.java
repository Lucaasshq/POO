public class Carro {
  private String marca;
  private String nome;
  private int ano;

  public Carro(String marca, String nome, int ano) {
    this.marca = marca;
    this.nome = nome;
    this.ano = ano;
  }

  void ligar() {
    System.out.println("O carro está ligado.");
  }

  public String getNome() {
    return nome;
  }

  public int getAno() {
    return ano;
  }

  public String getMarca() {
    return marca;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

}
