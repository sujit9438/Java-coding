package HospitalManagementSystem;

public class Doctor 
{
	private int doctorId;
	private String doctorName;
	private String specialization;
	private double consulationFee;
	private boolean available;
	public Doctor(int doctorId, String doctorName, String specialization, double consulationFee, boolean available) 
	{
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.consulationFee = consulationFee;
		this.available = available;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public double getConsulationFee() {
		return consulationFee;
	}
	public boolean isAvailable() {
		return available;
	}
	public void changeAvailability(boolean status)	
	{
		this.available=status;
	}
	public void displayDoctorDetails()
	{
		System.out.println("Doctor ID : "+doctorId);
		System.out.println("Doctor Name : "+doctorName);
		System.out.println("Specialization : "+specialization);
		System.out.println("Consulation Fee : "+consulationFee);
		System.out.println("Availability : "+available);
	}
	

}
