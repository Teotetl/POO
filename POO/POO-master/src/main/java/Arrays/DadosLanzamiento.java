package Arrays;

import java.security.SecureRandom;

public class DadosLanzamiento {
    public static void main(String[] args) {


    final int LANZAMIENTOS = 1000;
    final int DADO_CARAS = 6;
    SecureRandom random = new SecureRandom();
    int[] lado = new int[7];

    lado[1] = 0;
    lado[2] = 0;
    lado[3] = 0;
    lado[4] = 0;
    lado[5] = 0;
    lado[6] = 0;

        for (int j = 0; j < LANZAMIENTOS; j++) {
        int resultado = random.nextInt(6)+1;
        lado[resultado]+=1;
        }
        for (int i = 1; i<=DADO_CARAS; i++){
            System.out.println(lado[i]);
        }
    }


}


