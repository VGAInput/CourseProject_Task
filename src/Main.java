import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(outputArray(createArray(20))));
    }

    private static int[] createArray(int length) {

        int outputInt[] = new int[length];

        for (int i = 0; i < length; i++) {
            outputInt[i] = i + 1;
        }
        return outputInt;
    }

    private static int[] outputArray(int[] inputArray) {

/*
        Получаем на входе массив чисел.
*/

        int[] evenNumberArray = new int[inputArray.length];
        int[] outputPart = new int[5];

/*
        Все четные числа увеличиваем на единицу.
*/

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                evenNumberArray[i] = inputArray[i] + 1;
            } else evenNumberArray[i] = inputArray[i];
        }

/*
        Возвращаем кусок списка с 3-го по 7-й элемент.
*/

        for (int i = 3; i <= 7; i++) {
            outputPart[i-3] = evenNumberArray[i];
        }

        return outputPart;
    }


}