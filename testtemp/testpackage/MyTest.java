package testpackage;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;

public class MyTest {

   Logger logger = Logger.getLogger(MyTest.class.getName());
   
   public MyTest() {
   }

   @Test
   public void testMethod() {
      logger.info("Executing testMethod");
      Assertions.assertTrue(true, "This test should always pass");
      
   }
   @Test
   public void anotherTestMethod() {
      logger.info("Executing anotherTestMethod");
      Assertions.assertTrue(true, "This test should always pass");
   }
}
