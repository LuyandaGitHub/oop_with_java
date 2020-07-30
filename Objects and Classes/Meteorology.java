
// IMPORTING java.util
import java.util.*;

public class Meteorology {
     public static void main(String[] args) {
          boolean keep_playing = true;

          // MAKE AN INSTANCE OF THE Scanner CLASS
          Scanner scanner = new Scanner(System.in);

          // MAKE AN INSTANCE OF THE Collator CLASS
          Collator collator = new Collator("Collator label");

          // HERE, WE CHECK IF THE USER HAS QUIT BY TYPING 7
          while (keep_playing == true) {
               System.out.println("Meteorology Program");
               System.out.println("Make a selection and press return:");
               System.out.println("1. Record a temperature reading.");
               System.out.println("2. Record a pressure reading.");
               System.out.println("3. Record a humidity reading.");
               System.out.println("4. Print maximum values.");
               System.out.println("5. Print minimum values.");
               System.out.println("6. Print average values.");
               System.out.println("7. Quit.");
               System.out.println(" ");

               // GET THE user_input, SO WE KNOW WHAT THE USER WANTS
               System.out.println("Enter choice(1 - 7):");
               int user_input = scanner.nextInt();

               // THIS MAKES SURE THE user_input IS LESS THAN 8 BUT MORE THAN 0, WHICH MEANS IT
               // IS ONE OF THE OPTIONS
               System.out.println(user_input);

               if (0 < user_input && user_input < 8) {
                    if (user_input == 1) {
                         System.out.println("Enter value:");
                         int user_value = scanner.nextInt();

                         collator.recordReading(user_value);
                    }
                    if (user_input == 2) {
                         System.out.println("Enter value:");
                         int user_value = scanner.nextInt();

                         collator.recordReading(user_value);
                    }
                    if (user_input == 3) {
                         System.out.println("Enter value:");
                         int user_value = scanner.nextInt();

                         collator.recordReading(user_value);
                    }
                    if (user_input == 4) {
                         System.out.println("The maximum value is: " + collator.maximum());
                    }
                    if (user_input == 5) {
                         System.out.println("The minimum value is: " + collator.minimum());
                    }
                    if (user_input == 6) {
                         System.out.println("The average value is: " + collator.average());
                    }
                    if (user_input == 7) {
                         keep_playing = false;
                    }
               } else {
                    System.out.println("Invalid input");
               }

               System.out.println();
          }

          // CLOSE THE scanner
          scanner.close();
     }
}