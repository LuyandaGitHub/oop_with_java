public class Car extends Vehicle {
     private int numDoors;

     public Car(String color, int numPassenger, int numDoors) {
          super(color, numDoors);
          this.numDoors = numDoors;
     }

     public String toString() {
          return color + " " + numPassenger + " passengers " + numDoors + " doors";
     }
}