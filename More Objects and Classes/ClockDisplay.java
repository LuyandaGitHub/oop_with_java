public class ClockDisplay {

     private static CounterDisplay hours;
     private static CounterDisplay minutes;

     private static String time;

     public ClockDisplay() {
          // HERE, WE MAKE AN NEW INSTANCE OF THE CounterDisplay CLASS AND SET THE LIMITS
          // FOR THE hours AND THE minutes
          hours = new CounterDisplay(24);
          minutes = new CounterDisplay(60);

          // NOW WE CALL THE UpdateTheTime() FUNCTION
          UpdateTheTime();
     }

     // THIS GIVES US THE OPTION OF SETTING THE TIME AS SOON AS WE CALL THE CLASS
     public ClockDisplay(int hour, int minute) {
          // HERE, WE MAKE AN NEW INSTANCE OF THE CounterDisplay CLASS AND SET THE LIMITS
          // FOR THE hours AND THE minutes
          hours = new CounterDisplay(24);
          minutes = new CounterDisplay(60);

          SetTheTime(hour, minute);
     }

     public static String GetTime() {
          return time;
     }

     private static void UpdateTheTime() {
          time = hours.getDisplayValue() + " : " + minutes.getDisplayValue();
     }

     public static void SetTheTime(int hour, int minute) {
          hours.setValue(hour);
          minutes.setValue(minute);

          // UPDATE THE CLOCK AFTER SETTING THE TIME
          UpdateTheTime();
     }

     public static void MakeTheClockTick() {
          minutes.increment();
          // NOW, WE GOTTA CHECK IF THE minute IS EQUAL TO 60, SO THAT WE CAN INCREASE THE
          // hour AS WELL
          if (minutes.getValue() == 0) {
               hours.increment();
          }

          UpdateTheTime();
     }

}