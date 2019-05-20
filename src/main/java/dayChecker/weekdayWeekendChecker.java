package dayChecker;

import java.util.*;
public class weekdayWeekendChecker {
    public static void main(String[] args) {
        String userDayInput=args[0].toLowerCase();
        if (isDayWeekend(userDayInput)){
            System.out.println("Weekend");
        }
        else if(isContainsWeekDay(userDayInput)){
            System.out.println("WeekDay");
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public static boolean isContainsWeekDay(String userDayInput) {
        Set<String>days=new HashSet<String>();
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        return days.contains(userDayInput);
    }

    public static boolean isDayWeekend(String userDayInput) {
        return userDayInput.contains("sunday")||userDayInput.contains("saturday");
    }
}
