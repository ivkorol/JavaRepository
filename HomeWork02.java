package HomeWork02;

public class HomeWork02 {
     public static void main(String[] args) {
         task01(2, 11);
         task02();
         task03(10);
         task04();
     }
        public static boolean task01(int a, int b) {
         int result = a + b;
         if (result < 10) {
             System.out.println ("summa=" + result);
             return false;
         } else if (result >= 10 && result <= 20) {
             System.out.println ("summa=" + result);
             return true;
         } else {
             System.out.println ("summa=" + result);
             return false;
         }
         }
        public static void task02 () {
            int c = 15;
            if (c >= 0) {
                System.out.println ("number is positive");
            } else {
                System.out.println("number is negative");
            }
        }
        public static boolean task03(int i) {
        int d = 10;
        if (d >= 0) {
            System.out.println ("d positive=" + d);
            return false;
        } else {
            System.out.println ("d negative=" + d);
            return true;
        }
        }
        public static void task04() {
            for (int i = 0; i < 10; i++) {
                System.out.println ("it's my life");
            }
        }
        }

