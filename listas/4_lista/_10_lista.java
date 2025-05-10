import java.util.Scanner;

public class _10_lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt();

        for (int t = 0; t < testes; t++) {
            int[][] m = new int[4][4];
            boolean venceu = false;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    m[i][j] = sc.nextInt();
                    if (m[i][j] == 2048){
                        venceu = true;
                    }
                }
            }

            if (venceu){
                System.out.println("NONE");
                continue;
            }
            boolean paraEsquerda = false, paraDireita = false, paraCima = false, paraBaixo = false;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int atual = m[i][j];
                    if (atual == 0) continue;
                    if (j > 0 && (m[i][j - 1] == 0 || m[i][j - 1] == atual)) {
                        paraEsquerda = true;
                    }

                    if (j < 3 && (m[i][j + 1] == 0|| m[i][j + 1] == atual)) {
                        paraDireita = true;
                    }

                    if (i > 0 && (m[i-1][j] == 0 || m[i-1][j] == atual)){
                        paraCima = true;
                    }

                    if (i < 3 && (m[i+1][j] == 0 || m[i+1][j] == atual)){
                        paraBaixo = true;
                    }
                }
            }
            StringBuilder resultado = new StringBuilder();
            if (paraBaixo) resultado.append("DOWN ");
            if (paraEsquerda) resultado.append("LEFT ");
            if (paraDireita) resultado.append("RIGHT ");
            if (paraCima) resultado.append("UP ");

            System.out.println(!resultado.isEmpty() ? resultado.toString().trim() : "NONE");


        }
    }
}
