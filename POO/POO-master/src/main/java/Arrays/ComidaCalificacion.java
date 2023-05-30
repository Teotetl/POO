package Arrays;
import java.security.SecureRandom;
public class ComidaCalificacion {
    static int generaValor(int n){
        SecureRandom random = new SecureRandom();
        return random.nextInt(n)+1;
    }
    public static void main(String[] args) {

        final int ESTUDIANTES = 30;

        int calificaciones[] = new int[(6)];

        for (int i = 0; i<ESTUDIANTES;i++) {
            calificaciones[generaValor(5)]+=1;

        }
        System.out.println("Se recibieron " + ESTUDIANTES + " respuestas");
        System.out.printf("%s%10s%n", "Calificaciones", "Frecuencia");
        for (int j = 0; j< calificaciones.length;j++) {
            System.out.printf("%6d%10d%n", j, calificaciones[j]);

        }
    }
}
