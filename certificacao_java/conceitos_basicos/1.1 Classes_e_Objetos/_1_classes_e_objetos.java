

public class _1_classes_e_objetos {
  public static void main(String[] args) {

    Carro c1 = new Carro("Toyota", "Corola", 2025);
    c1.ligar();

    String antigaMarca = c1.getMarca();
    String antigoNome = c1.getNome();

    System.out.println(antigaMarca);
    System.out.println(antigoNome);

    c1.setMarca("Honda");
    String novaMarca = c1.getMarca();
    c1.setNome("civic");
    String novoNome = c1.getNome();

    System.out.println(novaMarca);
    System.out.println(novoNome);
  }
}
