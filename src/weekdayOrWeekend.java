import  java.util.Scanner;
public class weekdayOrWeekend {
    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);
        System.out.println("Enter the day");
        String userDayInput= userInput.nextLine();
        if (userDayInput.equalsIgnoreCase("sunday")||userDayInput.equalsIgnoreCase("saturday")){
            System.out.println("Weekend");
        }
        else{
            System.out.println("WeekDay");
        }
    }
}
