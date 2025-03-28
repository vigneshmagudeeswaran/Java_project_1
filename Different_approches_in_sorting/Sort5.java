import java.util.Arrays;


public class Sort5{
    public static void main(String[] args) {
        int[] numbers = {4,2,1,5,3};
        int temp;
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length-1; j++) {
                if (numbers[j]>numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
