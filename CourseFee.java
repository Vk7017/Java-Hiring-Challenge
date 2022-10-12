package com.vikas.Practice7;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseFee {
	@Id
	private float courseFee;

	public CourseFee() {
		super();
		//TODO Auto-generated constructor stub
	}

	public float getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(float courseFee) {
		this.courseFee = courseFee;
	}

}
