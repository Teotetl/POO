package Arrays;
import java.util.Scanner;
public class NumMayor {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        int max = 0;
        int menor;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< numbers.length;i++){
            System.out.println("Escribe el numero " + (i+1) + " De 10 numeros");
            numbers[i] = sc.nextInt();
        }
        System.out.println("El numero mayor es: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println("El numero menor es: ");
        menor = numbers[1];
        for (int i=0; i< numbers.length; i++){
            if(numbers[i]<menor){
                menor=numbers[i];
            }
        }
        System.out.println(menor);
    }
}
