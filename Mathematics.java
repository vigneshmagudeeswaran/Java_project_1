public class Mathematics{

public static void main(String[] args){

Calculator calc = new Calculator();
calc.addition();
calc.multiplication();
calc.promote();
Mathematics mm = new Mathematics();
mm.addition();
}


public void addition() //Method Signature
{ //Definition / Body
int no1 = 10, no2 = 20, no3 = 30;
int sum = no1 + no2 + no3;
System.out.println(sum);
}

}
