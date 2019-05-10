import  java.util.Scanner;
public class weekdayOrWeekend {
    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);
        System.out.println("Enter the day");
        String userDayInput= userInput.nextLine();
        boolean daySunOrsat = userDayInput.equalsIgnoreCase("sunday") || userDayInput.equalsIgnoreCase("saturday");
        boolean daysMonToFri=userDayInput.equalsIgnoreCase("monday")||userDayInput.equalsIgnoreCase("tuesday")||userDayInput.equalsIgnoreCase("wednesday")||userDayInput.equalsIgnoreCase("thursday")||userDayInput.equalsIgnoreCase("friday");
        if (daySunOrsat){
            System.out.println("Weekend");
        }
        else if(daysMonToFri){
            System.out.println("WeekDay");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
