public class Tourist{
int amount = 10000;
static String test = "test";

public static void main(String[] args){
 
Tourist vignesh = new Tourist();
vignesh.roam(200);
System.out.println(vignesh.amount);
System.out.println(test);



}
public void roam(int amount){
//amount = 200;
System.out.println("local field : "+amount);
System.out.println("this : " + this.amount);
}

}
