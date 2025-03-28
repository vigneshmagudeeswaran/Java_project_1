public class Customer
{
String custName;
int mobileNo1, mobileNo2;
String emailId1, emailId2; //null
String address1, address2;
int proof;
public static void main(String[] args)
{
Customer customer1 = new Customer();
customer1.custName = "Rajesh";
customer1.mobileNo1 = 1234;
customer1.emailId1 = "rajesh@rajesh.com";
customer1.proof = 2344;

Customer customer2 = new Customer();
customer2.custName = "Suresh";
customer2.mobileNo1 = 2233;
customer2.mobileNo2 = 3459;
customer2.emailId1 = "suresh@suresh.com";
customer2.emailId2 = "suresh2@suresh.com";
customer2.proof = 3456;

Bank clerk = new Bank();
clerk.open_Account(customer2);

}

}
