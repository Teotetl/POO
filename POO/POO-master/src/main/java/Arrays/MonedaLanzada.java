package Arrays;

import java.security.SecureRandom;

public class MonedaLanzada {

    public static void main(String[] args) {

        final int LANZAMIENTOS = 100;
        SecureRandom random = new SecureRandom();
        int[] volado = new int[3];
        final int SOL = 2 ;
        final int AGUILA = 1;
        volado[SOL] = 0;
        volado[AGUILA] = 0;
        int lanzamiento=0;
        for (int j = 0; j < LANZAMIENTOS; j++) {
            lanzamiento = random.nextInt(2)+1;
            if (lanzamiento==AGUILA) {
                volado[AGUILA] += 1;
            }
            if(lanzamiento==SOL){
                volado[SOL] += 1;
            }

        }
        System.out.println(volado[AGUILA] + " " + volado[SOL]);
    }
}