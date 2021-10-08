package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.TermRate;
import main.TermRateManager;

class TermRateManagerTest {

	private TermRateManager termRateManager;
	private TermRate termRate;

    @BeforeAll
    public static void setupAll() {
        System.out.println("Should Print Before All Tests Commence!!");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating Term Rate Test scripts");
        termRateManager= new TermRateManager();
    }
	
    @SuppressWarnings("static-access")
	@Test
    @DisplayName("Should Execute Test Case 1")
    public void shouldExecuteTestCase1() {
    	Double termrate = termRateManager.computeTermInterestRate(0, 1); 
    	assertEquals(2, termrate);
    	
    }
    
    @SuppressWarnings("static-access")
  	@Test
      @DisplayName("Should Execute Test Case 2")
      public void shouldExecuteTestCase2() {
      	Double termrate = termRateManager.computeTermInterestRate(1, 2); 
      	assertEquals(5, termrate);
      	
      }
    
    @SuppressWarnings("static-access")
  	@Test
      @DisplayName("Should Execute Test Case 3")
      public void shouldExecuteTestCase3() {
      	Double termrate = termRateManager.computeTermInterestRate(8, 10); 
      	assertEquals(6, termrate);
      	
      }
    
    @SuppressWarnings("static-access")
  	@Test
      @DisplayName("Should Execute Test Case 4")
      public void shouldExecuteTestCase4() {
      	Double termrate = termRateManager.computeTermInterestRate(0, 11); 
      	assertEquals(4.5, termrate);
      	
      }
    
    
	@SuppressWarnings("static-access")
	@Test
    @DisplayName("Should Execute Test Case 5")
    public void shouldExecuteTestCase5() {
		termRate = new TermRate(-1,0);
		assertEquals(false, termRateManager.validate(termRate));
    	
    }
    
	@SuppressWarnings("static-access")
	@Test
    @DisplayName("Should Execute Test Case 6")
    public void shouldExecuteTestCase6() {
		termRate = new TermRate(-2,12);
		assertEquals(false, termRateManager.validate(termRate));
    	
    }
	
	@SuppressWarnings("static-access")
	@Test
    @DisplayName("Should Execute Test Case 7")
    public void shouldExecuteTestCase7() {
		termRate = new TermRate(1,12);
		assertEquals(false, termRateManager.validate(termRate));
    	
    }
	
	@SuppressWarnings("static-access")
	@Test
    @DisplayName("Should Execute Test Case 8")
    public void shouldExecuteTestCase8() {
		termRate = new TermRate(3,13);
		assertEquals(false, termRateManager.validate(termRate));
    	
    }
	
	
    @AfterEach
    public void tearDown() {
        System.out.println("Should Execute After Each Test");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("Should be executed at the end of the Test");
    }

}
