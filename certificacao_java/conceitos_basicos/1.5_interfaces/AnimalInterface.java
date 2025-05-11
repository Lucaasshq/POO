public interface AnimalInterface {
  void emitirSom();
}

class Gato implements AnimalInterface {

  @Override
  public void emitirSom() {
    System.out.println("Miau");
  }
}

class vaca implements AnimalInterface  {
  @Override
  public void emitirSom() {
    System.out.println("MuUU");
  }
}