public class Autoboxing {
    public static void main(String args[]) {
        int a = 20;
        Integer i = Integer.valueOf(a); // Converting int into Integer explicitly
        Integer j = a; // Autoboxing

        System.out.println(a + " " + i + " " + j);
    }
}

