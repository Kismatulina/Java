/** Java: знакомство и как использовать базовый API. Обучение в записи
Семинар 2: Знакомство с языком программирования Java
 */


// Задание 1. Написать программу , которая запросит Имя в консоли. Получит введенную строку и выведит сообщение Привет, Имя!
/**
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String out = new String( "original: Привет, %s");
        System.out.printf(out,s); // original: Привет, Lyudmila, ругалась на original:, поставила кавычку до оригинала 
    }  
}
 */
package java_sem1.task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String out = new String("Привет, %s");
        System.out.printf(out, s);
    }
}


