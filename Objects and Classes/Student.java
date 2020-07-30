public class Student {
     public static void main(String[] args) {

     }

     private static String firstName;
     private static String middleName;
     private static String lastName;

     public void setNames(String first, String middle, String last) {
          firstName = first;
          middleName = middle;
          lastName = last;
     }

     public String getFullName() {
          return firstName + " " + String.valueOf(middleName.charAt(0)) + ". " + lastName;
     }
}