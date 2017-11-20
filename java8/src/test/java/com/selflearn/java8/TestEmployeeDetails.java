package com.selflearn.java8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestEmployeeDetails {

   //test to check appraisal
   @Test
   public void testCalculateAppriasal() {
	  Employee emp=new Employee(12, "santhu");
	  Employee emp2=new Employee(14, "hdsajk");
	  assertFalse(emp==emp2?true:false);
	  //assertFalse(emp.equals(emp2));
   }

}