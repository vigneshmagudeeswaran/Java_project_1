import java.util.Arrays;

public class Sort4
{
public static void main(String[] args)
{
int[] array = {3,7,2,9,4,5,3,1};

Arrays.sort(array);
System.out.println("Arrays in ascending order:");
for(int num:array)
{
System.out.print(num + " ");
}
}
}
