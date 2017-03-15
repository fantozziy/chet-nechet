import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Вести число с клавиатуры
        // Проверить на чёт нечёт

        Scanner scanner = new Scanner(System.in);
        // Объявление переменной длина массива
        int lengthOfArray;
        // Вывод сообщения
        System.out.println("Введите длину массива: ");
        // Вводим массив
        lengthOfArray = scanner.nextInt();
        // Создаётся массив на введённое кол-во элементов
        int[] array = new int[lengthOfArray];
        //
        for (int i = 0; i < array.length; i++) {
            // Предложение ввести элементы массива
            System.out.println("Введите элемент массива под номером "+i);
            // Ввод элементов с клавиатуры
            array[i] = scanner.nextInt();
        }
        // Переменная для подсчета суммы всех введённых элементов
        int sum = 0;
        // Вывод элементов на консоль
        for (int j = 0; j < array.length; j++) {
            sum = sum + array[j];
        }
        System.out.println("Сумма" + sum);
    }
}
