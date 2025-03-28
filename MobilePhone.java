package telecom;
public class MobilePhone extends Telephone
{

public static void main(String[] args)
{
MobilePhone mobile = new MobilePhone();
mobile.call();
mobile.sms();


}

public void sms()
{
System.out.println("Messaging");
}

public void hearSongs()
{
System.out.println("FM Songs");
}

}
