class Person
{
int amount = 10000;
public static void main(String[] args)
{
Person vignesh = new Person();
vignesh.shopping();
vignesh.travel();

Person vijay = new Person();
vijay.travel();

}
public void travel()
{
amount = amount - 1000;
System.out.println(amount);
}

public void shopping()
{
System.out.println(amount);
amount = amount - 1000;
System.out.println(amount);
}

}
