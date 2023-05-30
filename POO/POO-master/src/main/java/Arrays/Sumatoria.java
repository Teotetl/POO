package Arrays;
import java.security.SecureRandom;
import java.util.Arrays;
public class Sumatoria {
    public static void main(String[] args) {
        int [] numeros = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int [] ordenados = numeros;
        Arrays.sort(numeros);

        int sumatoria=0;
        double promedio;

        for(int i = 0; i < numeros.length; i++) {
            sumatoria +=numeros[i];
        }
        //mediana
        double mediana =(double) (ordenados[ordenados.length/2] + ordenados[(ordenados.length/2)-1])/2;
        //promedio (media)
        promedio = (double) sumatoria/numeros.length; //Casting. La division es una division entera
        System.out.println("Se sumaron " + numeros.length + " elementos");
        System.out.println("La sumatoria de los elementos del arreglo es: " + sumatoria);
        System.out.println(Arrays.toString(ordenados));
        System.out.println(promedio);
        System.out.println(mediana);




    }
}
