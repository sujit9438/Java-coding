package HospitalManagementSystem;

import java.time.LocalDate;

public class Appointment 
{
	private int appointmentId;
	private Patient patient;
	private Doctor doctor;
	private LocalDate appointmentDate;
	private  String timeSlot;
	private String status;
	private double consulationFee;
	public Appointment(int appointmentId, Patient patient, Doctor doctor, LocalDate appointmentDate, String timeSlot,
			String status, double consulationFee) 
	{
		this.appointmentId = appointmentId;
		this.patient = patient;
		this.doctor = doctor;
		this.appointmentDate = appointmentDate;
		this.timeSlot = timeSlot;
		this.status = status;
		this.consulationFee = consulationFee;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public Patient getPatient() {
		return patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public String getStatus() {
		return status;
	}
	public double getConsulationFee() {
		return consulationFee;
	}
	public void displayAppointmentDetails()
	{
		System.out.println("");
	}
	
}
