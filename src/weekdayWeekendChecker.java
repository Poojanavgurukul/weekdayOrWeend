import java.util.*;
public class weekdayWeekendChecker {
    public static void main(String[] args) {
        String userDayInput=args[0].toLowerCase();
        HashSet<String>days=new HashSet<String>(List.of("monday","tuesday","wednesday","thursday","Friday"));
        boolean isDaySunsat = userDayInput.equalsIgnoreCase("sunday") || userDayInput.equalsIgnoreCase("saturday");
        if (isDaySunsat){
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
