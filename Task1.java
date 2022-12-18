/*
 * Реализовать функцию возведения числа а в степень b. a, b ∈ Z.
 * Сводя количество выполняемых действий к минимуму.
 * 
 */
import java.util.Scanner;
    import java.io.*;

public class Task1 {
    
        public static void main(String args[]) {
            System.out.print("Введите число: ");
            Scanner scan1 = new Scanner(System.in);
            int number = scan1.nextInt();
            
            System.out.print("Введите степень: ");
            Scanner scan2 = new Scanner(System.in);
            int power = scan2.nextInt();
    
            System.out.println(Math.pow(number, power));
            double result = Math.pow(number, power);
            File file = new File ("output.txt");
            
        scan1.close();
        scan2.close();
        }
    }


