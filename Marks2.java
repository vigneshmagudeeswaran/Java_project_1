public class Marks2{
public static void main(String args[])
{

int[] marks = {90,87,78,92,62};

int big = marks[0];
if(marks[1]>big)
	big= marks[1];
if(marks[2]>big)
	big= marks[2];
if(marks[3]>big)
	big= marks[3];
if(marks[4]>big)
	big= marks[4];

System.out.println(big);


int small = marks[0];
if(marks[1]<small)
	small= marks[1];
if(marks[2]<small)
	small= marks[2];
if(marks[3]<small)
	small= marks[3];
if(marks[4]<small)
	small= marks[4];

System.out.println(small);



}
}
