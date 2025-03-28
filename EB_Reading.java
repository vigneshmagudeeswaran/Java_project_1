import java.util.Scanner;
public class EB_Reading
{
public static void main(String[] args)
{

EB_Reading assessor=new EB_Reading();
Scanner scan=new Scanner(System.in);

System.out.print("Enter New Reading  ");
int newReading=scan.nextInt();
System.out.print("Enter Old Reading  ");
int oldReading=scan.nextInt();

int consumed_units=assessor.reading(newReading,oldReading);
System.out.println("consumed units "+consumed_units);

assessor.calculate(consumed_units);

}
public int reading(int newReading,int oldReading)
{

return newReading-oldReading;

}
public void calculate(int units)
{
double result;
if (units<=500){
if (units<=100){
System.out.println("Payment value = 0");
  
}
else if(units>100 && units<=200){
result=(units-100)*2.25;
System.out.println("Payment value = "+ result);
}
else if(units>200 && units<=400){
result=100*2.25+(units-200)*4.50;
System.out.println("Payment value = "+ result);
}
else if(units>400 && units<=500){
result=100*2.25+200*4.50+(units-400)*6.00;
System.out.println("Payment value = "+ result);
}
}
if (units>500){
if (units<=100){
System.out.println("Payment value = 0");
}
else if(units>100 && units<=400){
result=(units-100)*4.50;
System.out.println("Payment value = "+ result);
}
else if(units>400 && units<=500){
result=300*4.50+(units-400)*6.00;
System.out.println("Payment value = "+ result);
}
else if(units>500 && units<=600){
result=300*4.50+100*6.00+(units-500)*8.00;
System.out.println("Payment value = "+ result);
}
else if(units>600 && units<=800){
result=300*4.50+100*6.00+100*8.00+(units-600)*9.00;
System.out.println("Payment value = "+ result);
}
else if(units>800 && units<=1000){
result=300*4.50+100*6.00+100*8.00+200*9.00+(units-800)*10.00;
System.out.println("Payment value = "+ result);
}
else if(units>=1000){
result=300*4.50+100*6.00+100*8.00+200*9.00+200*10.00+(units-1000)*11.00;
System.out.println("Payment value = "+ result);
}


}


}


}
