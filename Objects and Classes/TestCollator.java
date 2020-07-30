public class TestCollator {

     public static void main(String[] args) {
          // Test 1
          System.out.println("Test 1");

          // CHECK IF THE LABEL IS SET
          Collator collator = new Collator("Collator label");
          collator.label("Collator label");

          if (collator.label().equals("Collator label")) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }

          // Test 2
          System.out.println("Test 2");

          // CHECK IF THE LABEL IS SET
          collator.recordReading(36);
          if (collator.maximum() == 36) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }

          // Test 3
          System.out.println("Test 3");

          if (collator.minimum() == 36) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }

          // Test 4
          System.out.println("Test 4");
          if (collator.average() == 36) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }

          // Test 5
          System.out.println("Test 5");
          if (collator.numberOfReadings() == 1) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }
     }
}
