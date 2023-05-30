package Arrays;

public class ArrayType {
    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println("------------------");
        System.out.println(bugs.toString());
        System.out.println("------------------");
        System.out.println(bugs[2]);
        System.out.println("------------------");
        for (int i = 0; i < bugs.length; i++){
            System.out.println(bugs[i]);
        }
        System.out.println("------------------");

    }
}
