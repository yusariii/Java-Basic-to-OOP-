package lab1;
import java.util.Scanner;
public class DayMonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input month: ");
        String Month = scanner.nextLine();
        System.out.println("Input year: ");
        int Year = scanner.nextInt();
        scanner.nextLine();
        int Day = 0;
        switch(Month){
            case "1":
            case "January":
            case "Jan.":
            case "Jan":
                Day = 31;
                Month = "January";
                break;
            case "3":
            case "March":
            case "Mar.":
            case "Mar":
                Day = 31;
                Month = "March";
                break;
            case "5":
            case "May":
                Day = 31;
                Month = "May";
                break;
            case "7":
            case "July":
            case "Jul":
                Day = 31;
                Month = "July";
                break;
            case "8":
            case "August":
            case "Aug.":
            case "Aug":
                Day = 31;
                Month = "August";
                break;
            case "10":
            case "October":
            case "Oct.":
            case "Oct":
                Day = 31;
                Month = "October";
                break;
            case "12":
            case "December":
            case "Dec.":
            case "Dec":
                Day = 31;
                Month = "December";
                break;
            case "4":
            case "April":
            case "Apr.":
            case "Apr":
                Day = 30;
                Month = "April";
                break;
            case "6":
            case "June":
            case "Jun":
                Day = 30;
                Month = "June";
                break;
            case "9":
            case "September":
            case "Sept.":
            case "Sep":
                Day = 30;
                Month = "September";
                break;
            case "11":
            case "November":
            case "Nov.":
            case "Nov":
                Day = 30;
                Month = "November";
                break;
            case "2":
            case "February":
            case "Feb.":
            case "Feb":
            Month = "February";
            if (Year % 400 == 0 || Year % 4 == 0 && Year % 100 != 0){
                Day = 29;
            }
            else {
                Day = 28;
            }
            break;
            default: {
                System.out.println("Invalid Month or Year. Please input again!");
                continue;
            }
        }
        System.out.println(Month + " " + Year + " has " + Day + " days.");
        scanner.close();
        break;
        }
    }
}
