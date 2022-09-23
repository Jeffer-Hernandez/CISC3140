import java.time.*;
import java.util.*;

public class Exercise1 {  
   public static void main(String[] args)
    {
        LocalDate lab1= LocalDate.of(2022,9,28);
        LocalDate lab2 = LocalDate.of(2022,10,26);
        LocalDate lab3 = LocalDate.of(2022,11,23);
        LocalDate lab4 = LocalDate.of(2022,12,07);
        LocalDate now = LocalDate.now();
 
        Period diff1 = Period.between(now, lab1);
        Period diff2 = Period.between(now, lab2);
        Period diff3 = Period.between(now, lab3);
        Period diff4 = Period.between(now, lab4);
 
        System.out.printf("\nWe are %d months and %d days from the due date for lab1\n\n", diff1.getMonths(), diff1.getDays());
        System.out.printf("\nWe are %d months and %d days from the due date for lab2\n\n", diff2.getMonths(), diff2.getDays());
        System.out.printf("\nWe are %d months and %d days from the due date for lab3\n\n", diff3.getMonths(), diff3.getDays());
        System.out.printf("\nWe are %d months and %d days from the due date for lab4\n\n", diff4.getMonths(), diff4.getDays());
    }
}