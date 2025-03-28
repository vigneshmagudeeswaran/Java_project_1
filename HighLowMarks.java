public class HighLowMarks{
public static void main(String args[]){
int[] marks = {90,87,78,92,62};

int big = marks[0];

int i =1;
while(i<=4)
{ if(marks[i] > big) big =marks[i];
i++;
}
System.out.println(big);

int small = marks[0];

i =1;
while(i<=4)
{ 

if(marks[i] < small) small =marks[i];
i++;
}
System.out.println(small);

}}
