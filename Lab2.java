import java.time.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Lab2 {  
   public static void main(String[] args) throws ParseException
    {   Scanner keyboard = new Scanner(System.in);

        System.out.println("Please choose from one of the following options: (enter an integer)\n");
        System.out.println("1) Days from now until Lab1's Due Date\n");
        System.out.println("2) Days from now until Lab2's Due Date\n");
        System.out.println("3) Days from now until Lab3's Due Date\n");
        System.out.println("4) Days from now until Lab4's Due Date\n");
        System.out.println("5) Custom Date\n");
        System.out.println("Select 0 to end the program.\n");
        int ans  = keyboard.nextInt();
        while (ans != 0){
            if (ans > 0 && ans < 5){
                Period dif  = lab_days(ans);
                System.out.println(dif);
                break;
            }else if (ans == 5){
                System.out.println("Please enter two dates in the MM/DD/YYYY format\n");
                String date1 = keyboard.nextLine();
                String date2 = keyboard.nextLine();
                Long dif = date_diff(date1, date2);
                System.out.println(dif);
                break;
            }
        }
        keyboard.close();
    }

    public static Period lab_days(int ans)
    {   
        LocalDate now = LocalDate.now();
        switch (ans)
        {
            case 1:
                LocalDate lab1= LocalDate.of(2022,9,28);
                return Period.between(now, lab1);
            case 2:
                LocalDate lab2 = LocalDate.of(2022,10,26);
                return Period.between(now, lab2);
            case 3:
                LocalDate lab3 = LocalDate.of(2022,11,23);
                return Period.between(now, lab3);
            case 4:
                LocalDate lab4 = LocalDate.of(2022,12,07);
                return Period.between(now, lab4);
            default:
                System.out.println("I'm sorry, please choose a valid option.");
                return Period.between(now, now);
        }
    }

    public static long date_diff(String date1, String date2) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse(date1);
        Date secondDate = sdf.parse(date2);
        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff;
    }
}