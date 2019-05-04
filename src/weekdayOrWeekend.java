import  java.util.Scanner;
public class weekdayOrWeekend {
    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);
        System.out.println("Enter the day");
        String userDayInput= userInput.nextLine();
        System.out.println("Day is: "+userDayInput);
    }
}
