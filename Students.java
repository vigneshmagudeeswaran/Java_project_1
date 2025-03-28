
public class Students
{
int mark1, mark2, mark3, mark4,mark5, mark6;
public Students(int mark1, int mark2, int mark3, int mark4, int mark5)
{ //Useful for initializing object specific values
this.mark1 = mark1;
}

public Students(int mark1, int mark2, int mark3, int mark4)
{ //Useful for initializing object specific values
this.mark1 = mark1;
}
public static void main(String[] args)
{
Students student1 = new Students(90,80,67,56,36);
System.out.println(student1.mark1);
Students student2 = new Students(60,80,67,56,36);
System.out.println(student2.mark1);
Students student3 = new Students(70,80,67,56);
System.out.println(student3.mark1);
}
}
