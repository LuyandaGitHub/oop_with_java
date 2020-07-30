public class Plane extends Vehicle {
     private String manufacturer;
     private int modelNumber;

     public Plane(String color, int numPassenger, String manufacturer, int modelNumber) {
          super(color, numPassenger);
          this.manufacturer = manufacturer;
          this.modelNumber = modelNumber;
     }

     public String toString() {
          return color + " " + numPassenger + " passengers " + manufacturer + " " + modelNumber;
     }

}