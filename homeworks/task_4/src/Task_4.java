import java.util.Scanner;

public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        int[] array_1 = new int[size];
        array_1[0] = a0;
        for (int i = 1; i < size; i++) {
            array_1[i] = array_1[i - 1] + d;
        }
        return array_1;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        int array_2[] = new int[size];
        int sum = 2;
        for(int i = 0; i < size; i++)
        {
            if (i <= 1) {
                array_2[i] = 1;
            }
            else {
                array_2[i] = sum;
                sum = sum + array_2[i];
            }
        }
        return array_2;

    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        int[] array_3 = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0) array_3[i] = 0;
            if (i == 1 || i == 2) array_3[i] = 1;
            if (i > 2) array_3[i] = array_3[i - 2] + array_3[i - 1];
        }
        return array_3;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        int max = data[0]; //Integer.MIN_VALUE
        for(int i = 0; i < data.length; i++) {
            if (data[i]>max){
                max=data[i];
            }
        }
        return max;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int max = data[1];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max && data[i] % k == 0)
                max = data[i];
        }
        return max;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for(int i = arr1.length; i < arr3.length; i++) {
            arr3[i]=arr2[i-arr1.length];
        }
        return arr3;

    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}
