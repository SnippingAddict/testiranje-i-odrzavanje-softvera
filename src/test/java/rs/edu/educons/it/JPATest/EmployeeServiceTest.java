package rs.edu.educons.it.JPATest;

import rs.edu.educons.it.JPATest.service.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeServiceTest {
	
	@Before
	public void beforeTest() {
		System.out.println("Before");
	}	
    int	x = 10;
    int y = 13;
	
    String test = "uspeh";
    String test1 = "uspeh";
    String test2 = "neuspeh";
    
	String[] firstArray = {"John", "Michael", "Konkuro"};
    String[] secondArray = {"Nikola", "Aleksandar", "Milos"};
	
	@Test
    public void equalsTest(){
         
        String expectedName = "Jovan";
        assertEquals(expectedName, EmployeeService.getEmpNameWithHighestSalary());
		System.out.println("After");
    }
     
    @Test
    public void objEqualsTest(){
         
        EmployeeService expectedEmpObj = new EmployeeService(1, "Jovan", 15000);
        assertEquals(expectedEmpObj, EmployeeService.getHighestPaidEmployee());
		System.out.println("After");
    }
    
    @Test
    public void trueTest() {
    	assertArrayEquals(firstArray, secondArray);
		System.out.println("After");
    }
    
    @Test
    public void brojTest() {
    	assertTrue(x < y);
    	assertFalse(x > y);
		System.out.println("After");
    }
    
    @Test
    public void referenca() {
    	assertSame(test, test1);
    	assertNotSame(test, test2);
		System.out.println("After");
    }
}
