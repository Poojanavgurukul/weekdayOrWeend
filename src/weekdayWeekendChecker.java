public class weekdayWeekendChecker {
    public static void main(String[] args) {
        String userDayInput=args[0];
        boolean isDaySunsat = userDayInput.equalsIgnoreCase("sunday") || userDayInput.equalsIgnoreCase("saturday");
        boolean isDaysMonToFri=userDayInput.equalsIgnoreCase("monday")||userDayInput.equalsIgnoreCase("tuesday")||userDayInput.equalsIgnoreCase("wednesday")||userDayInput.equalsIgnoreCase("thursday")||userDayInput.equalsIgnoreCase("friday");
        if (isDaySunsat){
            System.out.println("Weekend");
        }
        else if(isDaysMonToFri){
            System.out.println("WeekDay");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
