

import java.util.concurrent.ThreadLocalRandom;

public class Dado {
    int dado;

  

    public void rolar(int lados) {
        // Gerar número aleatorio
        dado = ThreadLocalRandom.current().nextInt(lados);
        System.out.println("Número: " +dado);
    }
}
