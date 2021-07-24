package HomeWork03;

public class HomeWork03 {
    public static void main(String[] args) {
        invertArray ();
        fillArray();
        changeArray();
        fillDiagonal();
        returnArray (15,21);
    }

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1, 0, 0 };
            for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
                System.out.print(arr[i] + " ");
            } else {
                arr[i] = 1;
                System.out.print(arr[i] + " ");
            }
        System.out.println();
        System.out.println("---------------------");
    }

    public static void fillArray() {
        int[] arr = new int[100];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------");
    }

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2; {
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------");
    }

    public static void fillDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][i] = 1;
                arr[i][arr.length - 1 - i] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------------");
    }

    public static int[] returnArray(int len, int initValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initValue;
            System.out.print(arr[i] + " ");
        }
        return arr;
        }
}





