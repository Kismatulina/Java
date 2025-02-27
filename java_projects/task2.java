

//* Задача 2. Вывод всех четных чисел от 1 до 100
// Напишите метод printEvenNums, который выведет на экран все четные числа
// в промежутке от 1 до 100, каждое на новой строке.
/** 
public class homework { 
    public static void main(String[] args) {
            for (int i = 0; i < 101; i++) {
                if (i % 2 != 0) {    // != так поставить не равно 02468 будут четные числа
                    continue;
                }
                System.out.println(i);  // 13579 если число четное, то после  оператора continue вернись к i++, проверь условие и делай дальше
            }
    }
}
*/

/**
class Answer {
    public static void printEvenNums() {
    
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
            }
    }
}
    //  класс для вывода результатов на экран и проверки
public class task2 {
    public static void main(String[] args) {
        Answer ans = new Answer();
            ans.printEvenNums(); // 2 4 6 8 не четные числа
        }
}
*/

/**
// Задача 2. Вывести все простые числа от 1 до 1000
public class homework { 
    public static void main(String[] args) {
            for (int i = 0; i < 1000; i++) 
                System.out.println(i);  // 0 1 2 3...999
            }
}
*/