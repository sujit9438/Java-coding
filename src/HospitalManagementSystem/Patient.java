package HospitalManagementSystem;

public class Patient 
{
	private int patientId;
	private String patientName;
	private int age;
	private String gender;
	private String phoneNumber;
	private String email;
	public Patient(int patientId, String patientName, int age, String gender, String phoneNumber, String email) 
	{
		if(patientId>0)
		{
			this.patientId = patientId;
		}
		this.patientName = patientName;
		if(age>=1 && age<=120)
		{
			this.age = age;
		}
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		if(email!=null)
		{
			this.email = email;
		}
	}
	public int getPatientId() {
		return patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void displayPatientDetails()
	{
		System.out.println("Patient ID : "+patientId);
		System.out.println("Name : "+patientName);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Email : "+email);
		
	}
	
	
}
