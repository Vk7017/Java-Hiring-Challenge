package com.vikas.Practice7;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CollegeDetails {
	@Id
	@Column(name="CollegeName")
	private String collegeName;
	@Column(name="CourseName")
	private String courseName;
	@OneToOne
	private CourseFee courseFee;
	@Column(name="CourseDureation")
	private String courseDureation;
	@Column(name="Accommodation")
	private String accommodation;
	@Column(name="AccommodationFee")
	private float accommodationFee;
	public CollegeDetails() {
		super();
		//TODO Auto-generated constructor stub
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public CourseFee getcourseFee() {
		return courseFee;
	}
	public void setcF(CourseFee courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseDureation() {
		return courseDureation;
	}
	public void setCourseDureation(String courseDureation) {
		this.courseDureation = courseDureation;
	}
	public String getAccommodation() {
		return accommodation;
	}
	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}
	public float getAccommodationFee() {
		return accommodationFee;
	}
	public void setAccommodationFee(float accommodationFee) {
		this.accommodationFee = accommodationFee;
	}
	
	

}
