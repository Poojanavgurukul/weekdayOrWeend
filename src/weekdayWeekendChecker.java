import java.util.*;
public class weekdayWeekendChecker {
    public static void main(String[] args) {
        String userDayInput=args[0].toLowerCase();
        Set<String>days=new HashSet<String>();
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        boolean isDayWeekend = userDayInput.contains("sunday")||userDayInput.contains("saturday");
        if (isDayWeekend){
            System.out.println("Weekend");
        }
        else if(days.contains(userDayInput)){
            System.out.println("WeekDay");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
