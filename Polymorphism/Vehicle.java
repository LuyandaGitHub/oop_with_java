public class Vehicle {
     protected int numPassenger;
     protected String color;

     public Vehicle(String color, int numPassenger) {
          this.numPassenger = numPassenger;
          this.color = color;
     }

     public String toString() {
          return color + " " + numPassenger + " passengers";
     }
}
