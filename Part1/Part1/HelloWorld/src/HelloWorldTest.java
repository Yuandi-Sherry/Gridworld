public class HelloWorldTest {

   private String message;

   public HelloWorldTest(String message){
      this.message = message;
   }

   public String printMessage(){
      System.out.println(message);
      return message;
   }
}  
