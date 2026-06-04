package controlFlow;

public class SwitchDemo {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;

        System.out.println("--- Traditional Switch Statement Demo ---");

        // Traditional switch statement (requires break)
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        
        System.out.println("Day " + dayOfWeek + " is " + dayName);
        
        System.out.println("\n--- Enhanced Switch Expression (Java 14+) Demo ---");
        // Enhanced switch expression (no break needed, returns a value)
        String typeOfDay = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Unknown";
        };
        
        System.out.println("It is a " + typeOfDay);
    }
}
