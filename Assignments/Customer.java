public class Customer
{
String custName;
int mobileNo1, mobileNo2;
String emailId1, emailId2; //null
String address1, address2;
int proof;

public Customer(String custName, int mobileNo1,int mobileNo2,String emailId1,String emailId2,int proof){

this.custName = custName;
this.mobileNo1 = mobileNo1;
this.mobileNo2 = mobileNo2;
this.emailId1 = emailId1;
this.emailId2 = emailId2;
this.proof =proof;

}


public Customer(){



}

public static void main(String[] args)
{
Customer customer1 = new Customer("Suresh",2233,3459,"suresh@suresh.com","suresh2@suresh.com",3456);


Customer customer2 = new Customer();

customer2.custName = customer1.custName;

customer2.mobileNo1 = customer1.mobileNo1;
customer2.mobileNo2 = customer1.mobileNo2;
customer2.emailId1 = customer1.emailId1;
customer2.emailId2 = customer1.emailId2;
customer2.proof = customer1.proof;



Bank clerk = new Bank();
clerk.open_Account(customer1);

clerk.open_Account(customer2);

}

}

