package PracticeProgram;

import java.util.Scanner;

public class MobileContactBackupSystem 
{
	public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner sc = new Scanner(System.in);

        String contactId=sc.nextLine();
        String name=sc.nextLine();
        String phoneNumber=sc.nextLine();
        String countryCode=sc.nextLine();
         if(contactId.length()<3 || name.length()<3||phoneNumber.length()<6||countryCode.length()<1)
        {
            System.out.println("Error: Invalid contact details");
            System.exit(0);
        }
        Contact a= new Contact(contactId, name,phoneNumber,countryCode);

        Contact b=a.clone();
        b.phoneNumber="9988776655";

        System.out.println("Original Contact: "+a.contactId+" "+a.name+" "+a.phoneNumber+" "+a.countryCode);

        System.out.println("Cloned Contact: "+b.contactId+" "+b.name+" "+b.phoneNumber+" "+b.countryCode);

    }
}
class Contact implements Cloneable
{
    String contactId;
    String name;
    String phoneNumber;
    String countryCode;
    Contact(String contactId, String name, String phoneNumber, String countryCode)
    {
        this.contactId=contactId;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.countryCode=countryCode;
    }
    public Contact clone() throws CloneNotSupportedException
    {
        return (Contact)super.clone();
    }
}
