package edu.mum.cs.cs425.eRegister.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
	private String studentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private Double cgpa;
    private LocalDate enrollmentDate;
    private String isInternational; 
    
    public Long getStudentId() 
    {
		return studentId;
	}
	public void setStudentId(Long studentId) 
	{
		this.studentId = studentId;
	}
	public String getStudentNumber() 
	{
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber)
	{
		this.studentNumber = studentNumber;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public Double getCgpa()
	{
		return cgpa;
	}
	public void setCgpa(Double cgpa) 
	{
		this.cgpa = cgpa;
	}
	public LocalDate getEnrollmentDate()
	{
		return enrollmentDate;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate)
	{
		this.enrollmentDate = enrollmentDate;
	}
	public String getIsInternational()
	{
		return isInternational;
	}
	public void setIsInternational(String isInternational)
	{
		this.isInternational = isInternational;
	}



}