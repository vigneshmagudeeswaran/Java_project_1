public class Child extends Parent
{

public static void main(String[] args)
{
Parent cc = new Child(); //Dynamic Binding
cc.study();
cc.get_married();
cc.grow();
cc.do_projects();

}

public void study()
{
System.out.println(" Higher Studies ");
}

public void do_projects()
{
System.out.println("DS projects");
}

public void get_married()
{
System.out.println("Soon");
}

}
