package Arrays;
import java.util.Scanner;
public class ArraysApp {
    public boolean AnimalExists(String animal, String zoo[]){
        for(int i = 0; i<zoo.length; i++){
            if(zoo[i].equals("Donkey")) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String[] zoo = new String[3];
        Scanner sc = new Scanner(System.in);

        //Lee animales del teclado
        for (int i = 0; i < zoo.length; i++){
            System.out.println("Ingresa un animal en la jaula: " + (i+1));
            zoo[i] = sc.nextLine();
        }
        System.out.println("--------------------------------------------");

        //SHOW zoo animal
            //Muestra los animales que se escribio desde el teclado
        System.out.println("Estos son los animales del zoo");
        for(int i = 0; i<zoo.length; i++) {
            System.out.println(zoo[i]);
        }
        System.out.println("--------------------------------------------");


            //Busca si se ingreso un animal en concreto en el Array
        for(int i = 0; i<zoo.length; i++){
        if(zoo[i].equals("Donkey")){
            System.out.println("Hay un Donkey en el Zoo...");
            }
        }
        System.out.println("--------------------------------------------");
        //Prueba for
        for (int j = 5; j<10; j++){
            System.out.println(j);
        }
        //Prueba for
        System.out.println("--------------------------------------------");
        for(int j = 10; j>5; j-=2){
            System.out.println(j);
        }

    }
}
