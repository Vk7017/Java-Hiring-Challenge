package com.vikas.Practice7;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	CourseFee fee1 = new CourseFee();
    	fee1.setCourseFee(200000.0f);
    	
    	CourseFee fee2 = new CourseFee();
    	fee2.setCourseFee(250000.0f);
    	
    	CollegeDetails college1 = new CollegeDetails();
    	college1.setCollegeName("Galgotias University");
    	college1.setCourseName("B.tech");
    	college1.setcF(fee1);;
    	college1.setCourseDureation("4 year");
    	college1.setAccommodation("Non AC");
    	college1.setAccommodationFee(10000.0f);
    	
    	CollegeDetails college2 = new CollegeDetails();
    	college2.setCollegeName("KITE");
    	college2.setCourseName("BCA");
    	college2.setcF(fee2);;
    	college2.setCourseDureation("3 year");
    	college2.setAccommodation(" AC");
    	college2.setAccommodationFee(20000.0f);
    	
    	CollegeDetails college3 = new CollegeDetails();
    	college3.setCollegeName("ABESIT");
    	college3.setCourseName("MCA");
    	college3.setcF(fee1);;
    	college3.setCourseDureation("2 year");
    	college3.setAccommodation(" AC");
    	college3.setAccommodationFee(20000.0f);
    	
    	CollegeDetails college4 = new CollegeDetails();
    	college4.setCollegeName("ITS");
    	college4.setCourseName("BBA");
    	college4.setcF(fee1);;
    	college4.setCourseDureation("3 year");
    	college4.setAccommodation(" Non AC");
    	college4.setAccommodationFee(10000.0f);
    	
    	
    	
    	List<CollegeDetails>list = new  ArrayList<CollegeDetails>();
    	list.add(college1);
    	list.add(college2);
    	list.add(college3);
    	list.add(college4);
    	
    	
     	
        Configuration con = new Configuration().configure().addAnnotatedClass(CollegeDetails.class).addAnnotatedClass(CourseFee.class);
      	
      	SessionFactory sf = con.buildSessionFactory();
      	Session session = sf.openSession();
      	Transaction tx =  session.beginTransaction();
      	session.save(fee1);
      	session.save(fee2);
      	session.save(college1);
      	session.save(college2);
      	session.save(college3);
      	session.save(college4);
      	tx.commit();
    }
}
