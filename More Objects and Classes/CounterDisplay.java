public class CounterDisplay {
     private static int value;
     private static int limit;

     public CounterDisplay(int pLimit) {
          // Create a new CounterDisplay, set counter value to 0, and set the limit to
          // pLimit.
          value = 0;
          limit = pLimit;
     }

     public void setValue(int pValue) {
          // Set the current counter value to pValue.
          value = pValue;

          // WHENEVER THE value IS EQUAL TO THE limit, WE RESET THE value
          if (value == limit) {
               value = 0;
          }
     }

     public int getValue() {
          // Get the current value.
          return value;
     }

     public void increment() {
          // Advance the counter by 1, rolling over to 0 if the limit is reached.
          value++;
     }

     public String getDisplayValue() {
          // Obtain the display value i.e. the current counter value in the form of a 2
          // digit string.
          String result;

          // HERE, WE CHECK IF THE NUMBER IS 1 OR TWO DIGITS
          if (value < 10) {
               result = 0 + String.valueOf(value);
          } else {
               result = String.valueOf(value);
          }

          return result;
     }
}