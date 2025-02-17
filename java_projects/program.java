/**public class program {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
    }
}

public class program { 
    public static void main(String[] args) {
            int i = 123;
        System.out.println(Integer.MAX_VALUE); //2147483647
    }
}

public class program { 
    public static void main(String[] args) {
            int a = 123;
        System.out.println(a-- - --a); //2
        System.out.println(a);         // 121
    }
}

public class program { 
    public static void main(String[] args) {
            int a = 123;
        System.out.println(--a - --a);       // 1
        System.out.println(--a-a--);         // 0
        System.out.println(--a - a--);       // 0
        System.out.println(--a);             // 116    }
}
  
public class program { 
    public static void main(String[] args) {
            int a = 123;
               System.out.println(--a);             // 122
               System.out.println(a--);             // 122 
   }
}

public class program { 
    public static void main(String[] args) {
            int a = 123;
            a = (--a - --a);       
               System.out.println(a);             // 1 
   }
}
*/

/** 
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name); // \n чтобы знак процента не выходил, по английски имя надо писать
        iScanner.close();
    }
}
*/
/** 
import java.util.Scanner;
public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a:  ");
        boolean flag = iScanner.hasNextInt();

        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();

    }
}
*/
/**
public class program { 
    public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {    // =/= как поставить не равно? 02468 будут четные числа
                    continue;
                }
                System.out.println(i);  // 13579 если число четное, то после  оператора continue вернись к i++, проверь условие и делай дальше
            }
               
   }
} 
*/

