package HomeWorkApp;
    public class HomeWorkApp {
        public static void main (String[] args) {
            printThreeWords ();
            checkSumSign ();
            printColor ();
            compareNumbers ();
         }
        public static void printThreeWords () {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
         }
        public static void checkSumSign () {
            int a, b, result;
            a = 5;
            b = 10;
            result = a + b;
             if (result >= 0) {
                    System.out.println("Сумма положительная");
             } else {
                    System.out.println("Сумма отрицательная");
                    }
         }
        public static void printColor () {
             int value = 5;
             if (value > 100) {
                 System.out.println ("Зеленый");
             } else if (value > 0 && value <= 100) {
                 System.out.println ("Желтый");
             } else if (value <= 0) {
                 System.out.println ("Красный");
             }

         }
        public static void compareNumbers () {
            int a = 145;
            int b = 82;
            if (a >= 0) {
             System.out.println("a >= b");
             } else {
            System.out.println("a < b");
            }
        }
    }

