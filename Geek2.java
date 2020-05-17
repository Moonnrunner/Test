public class Geek2 {
    public static void main(String[] args) {
        // Первое задание
        System.out.println("1 - задание");
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else if (arr[i] == 1)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        // Второе задание
        System.out.println("\r\n2 - задание");
        int[] arr2 = new int[8];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = k;
            k += 3;
            System.out.print(arr2[i] + " ");
        }
        // Третье задание
        System.out.println("\r\n3 - задание");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6)
                arr3[i] = arr3[i] * 2;
            System.out.print(arr3[i] + " ");
        }
        // Четвёртое задание
        System.out.println("\r\n4 - задание");
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
        // Пятое задание
        System.out.println("5 - задание");
        int[] arr5 = {5, 3, 4, 5, 6, 8, 7, 4, 10, 3, 6, 6, 5, 7};
        int max = arr5[0], min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (max < arr5[i])
                max = arr5[i];
            if (min > arr5[i])
                min = arr5[i];
        }
        System.out.println("Max ="+" "+max);
        System.out.println("Min ="+" "+min);
        // Шестое задание
        System.out.println("6 - задание");
        int[] arr6 = {1, 5, 3, 2, 5, 2, 1, 3};
        System.out.println("Результат = "+Balance(arr6));
        // Седьмое задание
        System.out.println("\r\n7 - задание +2 сдвига");
        shiftOfNumbers(arr6, 2);
    }
    // Метод для шестого задания
    private static boolean Balance(int[] arrParam) {
        int pSum, bSum;

        for (int i = 0; i < arrParam.length + 1; i++) {
            pSum = 0;
            bSum = 0;

            for (int j = 0; j < i; j++) {
                pSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                bSum += arrParam[j];
            }

            if (pSum == bSum) return true;
        }
        return false;
    }
    private static void shiftOfNumbers(int[] arrParam, int n) {
        //матрица до сдвига
        for (int i : arrParam) System.out.print(i + " ");
        System.out.println("\r\n");

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arrParam[arrParam.length - 1];
                if (arrParam.length - 1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
                arrParam[0] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arrParam) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arrParam[0];
                System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
                arrParam[arrParam.length - 1] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arrParam) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }
    }
}