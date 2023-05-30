package Arrays;

public class EjemploArrays {
    public static void main(String[] args) {
        String [] zoo = {"Monkey", "Rooster", "chimp", "donkey", "cheetah", "dolphine",};
        System.out.println("Mi zoologico tiene " + zoo.length + " animales");
        for (int i = 0; i < zoo.length; i++){
            System.out.println(zoo[i]);
        }
    }
}
