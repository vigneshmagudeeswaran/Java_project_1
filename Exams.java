public class Exams{
int mark;
static int min_pass = 35;
static int max_pass = 100;
public static void main(String[] args){
Exams swetha = new Exams();
Exams sivasree = new Exams();

swetha.mark = 95;
sivasree.mark = 92;

System.out.println("global marks 1: " +swetha.mark);
swetha.write(87);
sivasree.write(89);
swetha.publish_result();
System.out.println("global marks 2: " +swetha.mark);
}

public void write(int mark ){
System.out.println("this " + this.mark);
System.out.println("writing Exams");
System.out.println(min_pass);
System.out.println(max_pass);
this.mark = mark;

}

public void publish_result()
{
System.out.println("Publishing "+mark);
}

}

