public class School
{
public static void main(String[] args)
{
School student1 = new School();
int total = student1.add_marks(56, 67);
student1.find_avg(total);


}
public int add_marks(int mark1, int mark2)
{
System.out.println(mark1 + mark2);
return mark1+mark2;
}

public void find_avg(int total)
{
System.out.println(total/2.0f);

}
}
