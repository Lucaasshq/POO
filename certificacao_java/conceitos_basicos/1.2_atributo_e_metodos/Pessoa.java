public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  void aprensentar() {
    System.out.println("Olá, meu nome é " + nome+ " e tenho "+ idade+ " anos.");
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setNome(String nome) throws Exception {
    if (nome.length() > 10){
      throw new Exception();
    }
    this.nome = nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
