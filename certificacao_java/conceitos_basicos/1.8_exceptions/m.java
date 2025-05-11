public class m {
  
  public static void main(String[] args) {
    
    Pessoa p = new Pessoa("Lucas", 21);

    try {
      p.setNome("aaaaaaaaaaaaa");
    } catch (Exception e){
      System.out.println("Nome ultrapassou 10 caracteres " +e);
    } finally {
      System.out.println("Programa finalizado");
    }
    p.aprensentar();

  }
}
