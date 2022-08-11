import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       // task 1
       printLeapYear(2022);
       System.out.println();
       // task 2
       int clientOS = 1;
       int deviceYear = 2022;
       printInstallSystem(clientOS, deviceYear);
       System.out.println();
       //task 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("потребуется дней " + deliveryDays);

    }
    private static void printLeapYear (int year) {
        String output;
        if (isLeapYear(year)){
            output=year + " является высокосным";
        } else {
            output=year + " не является высокосным";
        }
        System.out.println(output);
    }
    private static boolean isLeapYear (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printInstallSystem(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String output;
        if (currentYear > deviceYear){
            output="установите облегченную версию для ";
        } else {
            output="установите версию для ";
        }
        if (clientOS == 1){
            output += "приложение Android по ссылке";
        } else
        {   output += "приложение IOS по сылке";
        }
        System.out.println(output);}

    private static int calculateDeliveryDays(int deliveryDistance){

        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance > startInterval) {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
         }
        return deliveryDays;
    }
}




