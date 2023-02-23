public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] firstArray = new int[] {1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        double[] array = new double[4];
        array[0] = 1.1;
        array[1] = 2.34;
        array[2] = 9.12;
        array[3] = 4.99;
          }
          public static void task2 () {
        System.out.println("Задача 2");
        int[] firstArray = new int[] {1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        double[] array = new double[4];
        array[0] = 1.1;
        array[1] = 2.34;
        array[2] = 9.12;
        array[3] = 4.99;
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] firstArray = new int[] {1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        double[] array = new double[4];
        array[0] = 1.1;
        array[1] = 2.34;
        array[2] = 9.12;
        array[3] = 4.99;
        for (int i = 0; i < firstArray.length; i++) {
            int x = firstArray.length - i - 1;
            System.out.print(firstArray[x] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            int x = secondArray.length - i - 1;
            System.out.print(secondArray[x] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int x = array.length - i - 1;
            System.out.print(array[x] + " ");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] firstArray = new int[]{1, 2, 3};
        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] % 2 != 0){
                firstArray[i] += 1;
            }
            System.out.println(firstArray[i]);
        }
    }
}

