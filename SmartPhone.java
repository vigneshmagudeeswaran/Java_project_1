package telecom;
public class SmartPhone extends MobilePhone
{

public static void main(String[] args)
{
SmartPhone mobile = new SmartPhone();
mobile.call();
mobile.sms();
mobile.browse();

}

public void browse()
{
System.out.println("Browsing");
}

public void chat()
{
System.out.println("Video Calls ");
}

}
