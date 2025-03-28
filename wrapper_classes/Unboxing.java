public class Unboxing{
    public static void main(String args[]) {
        Integer a = new Integer(3);
        int i = a.intValue(); // Converting Integer to int explicitly
        int j = a; // Unboxing

        System.out.println(a + " " + i + " " + j);
    }
}

