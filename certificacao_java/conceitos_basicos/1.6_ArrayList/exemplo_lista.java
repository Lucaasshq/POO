import java.util.ArrayList;

public class exemplo_lista {
  public static void main(String[] args) {
    
    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Jorge");
    nomes.add("Hannah");

    for (int i = 0; i < nomes.size(); i++) {
      System.out.println(nomes.get(i));
    }

    System.out.println(nomes);
  }
  
}
