import java.util.Arrays;
import java.util.Scanner;
public class Sort3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int aii[]=new int[n];
for(int i=0;i<n;i++){
aii[i]=sc.nextInt();
}

Arrays.sort(aii);
for(int i=0;i<n;i++){
System.out.print(aii[i]+" ");
}}}
