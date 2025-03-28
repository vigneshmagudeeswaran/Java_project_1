public class Calculator{

public static void main(String[] args){


Calculator calc = new Calculator();
calc.addition(10,20);
calc.multiplication(10,20);
calc.promote();
}

public void addition(){
int no1 = 5, no2 =10;

int sum = no1 + no2;

System.out.println(sum);
}

public void multiplication(){
int no1 = 5, no2 =10;
int product = no1 * no2;
System.out.println(product);

}

private void promote()
{
System.out.println("Promotions");
}

}
