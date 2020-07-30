import java.util.ArrayList;
import java.util.List;

public class JumpRecord {

     public static int numberOfJumps;
     public static int maxNumberOfJumps;
     public static int numberOfFoulJumps;

     public static List<Double> ListOfJumpDistances;

     // CONSTRUCTOR SETS THE INITIAL VALUES
     public static void JumpRecord(int maxJumps) {
          numberOfJumps = 0;

          maxNumberOfJumps = maxJumps;

          numberOfFoulJumps = 0;
          ListOfJumpDistances = new ArrayList<Double>();
     }

     // FUNCTION RECORDS EACH JUMP
     public static void recordJump(final double distance) {
          // FIRST WE CHECK IF THE JUMPER HAS HAD THEIR 3 JUMPS BY CALLING THE finished()
          // FUNCTION
          if (!finished()) {
               // IF THE JUMPER HASNT FINISHED, ADD THE DISTANC TO THE LIST
               ListOfJumpDistances.add(distance);
          }

          // INCREASE THE AMOUNT OF JUMPS
          numberOfJumps++;
     }

     public static void recordFoulJump() {
          // FIRST WE CHECK IF THE JUMPER HAS HAD THEIR 3 JUMPS BY CALLING THE finished()
          // FUNCTION
          if (!finished()) {
               ListOfJumpDistances.add((double) -1);
          }

          // INCREASE BOTH THE numberOfJumps AND THE numberOfFoulJumps
          numberOfJumps++;
          numberOfFoulJumps++;
     }

     public static int jumps() {
          return numberOfJumps;
     }

     public static int maxJumps() {
          return maxNumberOfJumps;
     }

     public static int foulJumps() {
          return numberOfFoulJumps;
     }

     public static boolean isFoulJump(int n) {
          // SINCE WE SET THE FOUL JUMP TO -1 IN THE recordFoulJump() FUNCTION.
          // HERE, WE CHECK TO SEE IF THE JUMP AT n IS EQUAL TO -1
          return ListOfJumpDistances.get(n - 1) == -1;
     }

     public static double getjumpDistances(int n) {
          // HERE, WE CHECK TO GET THE JUMP AT n
          return ListOfJumpDistances.get(n - 1);
     }

     public static int getLongest() {
          Double max = Double.MIN_VALUE;
          int jumpNumber = -1;

          for (int i = 0; i < maxNumberOfJumps; i++) {
               if (max < ListOfJumpDistances.get(i)) {
                    jumpNumber = i + 1;
               }
          }

          return jumpNumber;
     }

     // FUNCTION THAT CHECKS IF THE JUMPER HAS JUMPED ENOUGH TIMES
     public static boolean finished() {
          return numberOfJumps >= maxNumberOfJumps;
     }
}