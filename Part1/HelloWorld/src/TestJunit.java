import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {

   String message = "Hello World";  
   HelloWorldTest HelloWorldTest = new HelloWorldTest(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,HelloWorldTest.printMessage());
   }
}

