public class UberService {
     public static void main(String[] args) {

     }

     public static String service_name;
     public static int cost_per_min;
     public static int cost_per_km;
     public static int base_fee;
     public static int cancellation_fee;

     void setDetails(String name, int costPerMin, int costPerKM, int baseFee, int cancellationFee) {
          // Set the details of this service to the given values.
          service_name = name;
          cost_per_min = costPerMin;
          cost_per_km = costPerKM;
          base_fee = baseFee;
          cancellation_fee = cancellationFee;
     }

     void setName(String name) {
          // Set the service name.
          service_name = name;
     }

     String getName() {
          // Obtain the service name.
          return service_name;
     }

     void setCostPerMinute(int cents) {
          // Set the cost per minute.
          cost_per_min = cents;
     }

     int getCostPerMinute() {
          // Set the cost per minute in cents.
          return cost_per_min;
     }

     void setCostPerKilometre(int cents) {
          // Set the cost per kilometre.
          cost_per_km = cents;
     }

     int getCostPerKilometre() {
          // get the cost per kilometre in cents.
          return cost_per_km;
     }

     void setBaseFare(int cents) {
          // Set the base fare.
          base_fee = cents;
     }

     int getBaseFare() {
          // get the base fare in cents.
          return base_fee;
     }

     void setCancellationFee(int n) {
          // Set the cancellation fee.
          cancellation_fee = n;
     }

     int getCancellationFee() {
          // Obtain the cancellation fee in cents for this service.
          return cancellation_fee;
     }

     double calculateFare(double minutes, double distance) {
          // Obtain the fare (in the form of a real number of cents) for a journey of the
          // given time and distance.
          double fare = minutes * distance;

          return fare;
     }
}