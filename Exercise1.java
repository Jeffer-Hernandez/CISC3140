import java.time.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercise1 {  
   public static void main(String[] args)
    {   Scanner keyboard = new Scanner(System.in);

        System.out.println("Please choose from one of the following options: (enter an integer)\n");
        System.out.println("1) Days from now until Lab1's Due Date\n");
        System.out.println("2) Days from now until Lab2's Due Date\n");
        System.out.println("3) Days from now until Lab3's Due Date\n");
        System.out.println("4) Days from now until Lab4's Due Date\n");
        System.out.println("5) Custom Date\n");

        int ans = keyboard.nextInt();
        
        if (ans > 0 && ans < 5){
            Period dif  = lab_days(ans);
        }else if (ans == 6){
            System.out.println("Please enter two dates in the MM/DD/YYYY format\n");
            int date1 = keyboard.nextInt();
            int date2 = keyboard.nextInt();
            
        }

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
}