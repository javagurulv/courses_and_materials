package student_dmitrijs_visuns.homeworks.lesson_5.day_4;

import java.util.Random;

class Task_30 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];

		// обычно переменные цикла называют: i, j, ...
        for (int inputCount = 1; inputCount <= array.length; inputCount++) {
            int randomNumber = random.nextInt(100);
            array[inputCount - 1] = randomNumber;
        }

		// обычно переменные цикла называют: i, j, ...
        for (int inputCount = 1; inputCount <= array.length; inputCount++) {
            System.out.println("Array integer # " + inputCount + " is " + array[inputCount - 1]);
        }

		// обычно переменные цикла называют: i, j, ...
        for (int inputCount = 1; inputCount <= array.length; inputCount++) {

            if (array[inputCount - 1] % 2 != 0) {
                System.out.println(array[inputCount - 1] + " is odd");
            }
        }

    }

}
