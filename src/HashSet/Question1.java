package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Question1 {

	public static void main(String[] args) 
	{
		RegistrationManager rm = new RegistrationManager();
		Scanner sc = new Scanner(System.in);
		acceptRegistrationDetails(rm, sc);
		displayRegistrationReport(rm);
		System.out.println("Enter search id : ");
		int searchId=sc.nextInt();
		if(rm.searchRegistration(searchId))
		{
			System.out.println("Registration id "+searchId+" is registered.");
		}
		else
		{
			System.out.println("Registration id "+searchId+" is not registered.");
		}
		
	}
	public static void acceptRegistrationDetails(RegistrationManager rm ,Scanner sc)
	{
		System.out.println("Enter no, of registration");
		int n=sc.nextInt();
		System.out.println("Enter registration ids");
		for(int i=9;i<=n;i++)
		{
			rm.addRegistration(sc.nextInt());
		}
	}
	public static void displayRegistrationReport(RegistrationManager rm)
	{
		System.out.println("Total Registration Attempts : "+rm.registrationAttempt.size());
		System.out.println("Total Unique Registrations : "+rm.uniqueRegistration.size());
		System.out.println("Duplicate Registration Attempts : "+rm.countDuplicateAttempts());
		System.out.println("Unique Registration ID : ");
		rm.displayUniqueRegistration();
		
		System.out.println("Maximum Regidtration Frequency : "+rm.getMaximumFrequency());
		System.out.println("Most Frequently Registratio ID : ");
		rm.displayMostFrequentRegistration();
		
		
		
	}

}
class RegistrationManager
{
	public Vector<Integer> registrationAttempt = new Vector<Integer>();
	public HashSet<Integer> uniqueRegistration = new HashSet<>();
	public void addRegistration(int registrationId)
	{
		registrationAttempt.add(registrationId);
		uniqueRegistration.add(registrationId);
	}
	public int countDuplicateAttempts()
	{
		return registrationAttempt.size()-uniqueRegistration.size();
	}
	public int getUniqueRegistrationCount()
	{
		return uniqueRegistration.size();
	}
	public void  displayUniqueRegistration()
	{
		for(Integer id:uniqueRegistration)
		{
			System.out.println(id);
		}
	}
	public int getMaximumFrequency()
	{
		int maxCount=0;
		for(int i=0;i<registrationAttempt.size();i++)
		{
			int count=0;
			for(int j=0;j<registrationAttempt.size();j++)
			{
				if(registrationAttempt.get(i)==registrationAttempt.get(j))
				{
					count++;
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
			}
		}
		return maxCount;
	}
	public void displayMostFrequentRegistration()
	{
		HashMap<Integer , Integer > map = new HashMap<Integer , Integer>();
		for(int i=0;i<=registrationAttempt.size()-1;i++)
		{
			map.put(registrationAttempt.get(i), (map.getOrDefault(registrationAttempt.get(i), 0)+1));
		}
		int maxFrequency=getMaximumFrequency();
		for(Map.Entry<Integer , Integer > entry : map.entrySet())
		{
			if(entry.getValue()==maxFrequency)
			{
				System.out.println(entry);
			}
		}
	}
	public boolean searchRegistration(int id)
	{
		return uniqueRegistration.contains(id);
	}
}

