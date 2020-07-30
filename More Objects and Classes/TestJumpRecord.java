public class TestJumpRecord {
     public static void main(String[] args) {

          JumpRecord2 jumpRecord = new JumpRecord2(3);

          // Test 1
          System.out.println("Test 1");

          if (jumpRecord.maxJumps() == 3) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }

          // Test 2
          jumpRecord.recordJump(2.9);

          System.out.println("Test 2");

          if (jumpRecord.jumps() == 1) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }

          // Test 3
          jumpRecord.recordFoulJump();

          System.out.println("Test 3");

          if (jumpRecord.isFoulJump(2)) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }

          // Test 4
          System.out.println("Test 4");

          if (jumpRecord.finished() == false) {
               System.out.println("Pass");
          } else {
               System.out.println("Fail");
          }
     }

}