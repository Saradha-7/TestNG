package week6.day2;

import org.testng.annotations.Test;

public class LearnPriority {
  @Test (priority = 5)
  public void createLead() {
	  System.out.println("Create Lead");
  }
  @Test 
  public void editLead() {
	  System.out.println("Edit Lead");
  }
  @Test (priority = 4)
  public void deleteLead() {
	  System.out.println("Delete Lead");
  }
  @Test (priority = 1)
  public void duplicateLead() {
	  System.out.println("Dupplicate Lead");
  }
  @Test (priority = 2)
  public void mergeLead() {
	  System.out.println("Merge Lead");
  }
 
}
