package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    //public boolean isNumber(String numberStr) {
        //Pattern pattern = Pattern.compile("^\\d+$");
       // Matcher matcher = pattern.matcher(numberStr);

       // return matcher.find();
    //}
   private Scanner scanner;
public ValidateNumber (Scanner scanner) {
    this.scanner = scanner;
}
 public  int getValidInput (String massage) {
     int value = 0;
     int min = 1;
     int max = 20;
     boolean isValid = false;
     try {
         if (value >= 1 && value <= 20) {
             isValid = true;
             System.out.println("Значение корректно");
         } else {
             System.out.println("Введите значение от " + min + " до " + max);
         }
     } catch (InputMismatchException e) {
         System.out.println("Вводите цифры");
         scanner.nextLine();
     }
     if (!isValid) {
         scanner.nextLine();
     }
     return value;



 }

}
