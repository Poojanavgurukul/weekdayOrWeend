import java.util.*;
public class weekdayWeekendChecker {
    public static void main(String[] args) {
        String userDayInput=args[0].toLowerCase();
        Set<String>days=new HashSet<String>(List.of("monday","tuesday","wednesday","thursday","Friday"));
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
