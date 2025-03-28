public class Marks{
public static void main(String args[])
{
int tamil =90;
int english = 80;
int maths = 100;
int science =92;
int social =62;
int total = tamil+ english+maths+science+social;
System.out.println(total);
System.out.println(total/5);
int big = tamil;
if (english > big)
	big =english;
if (maths> big)
	big = maths;
if (science> big)
	big = science;
if (social >big)
	big = social;
	
System.out.println(big);



int small = tamil;
if (english < small)
	small =english;
if (maths< small)
	small = maths;
if (science< small)
	small = science;
if (social <big)
	small = social;
	
System.out.println(small);


}
}
