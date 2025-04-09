

import java.util.concurrent.ThreadLocalRandom;

public class Dado {
    int dado;

  

    public void rolar() {
        dado = ThreadLocalRandom.current().nextInt(6);
        System.out.println("Número: " +dado);
    }
}
